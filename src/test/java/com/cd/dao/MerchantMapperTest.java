/**
 *
 */
package com.cd.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import com.cd.entity.MerchantInfo;
import com.cd.util.Constants;
import com.cd.util.MerchantInfoUtil;
import com.cd.util.StringUtil;

public class MerchantMapperTest {
	Reader reader;
	SqlSessionFactory sessionFactory;
	SqlSession session;
	MerchantMapper mapper;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		reader = Resources.getResourceAsReader("mybatis-config.xml");
		// 构建sqlSession的工厂
		sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		session = sessionFactory.openSession(true);
		mapper = session.getMapper(MerchantMapper.class);
	}

	// @Test
	// public void testGetMerchantInfoByID() {
	// MerchantMapper mapper = session.getMapper(MerchantMapper.class);
	// MerchantInfo merchantInfo = null;
	// try {
	// merchantInfo = mapper.queryByID(1);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// System.out.println(merchantInfo.toString());
	//
	// session.commit();
	// assertEquals("张三", merchantInfo.getMerchantName());
	//
	// }

	// @Test
	public void testCreate() {

		int affectedRows = 0;
		String address = StringUtil.randomString(Constants.address_LEN);
		try {
			affectedRows = mapper.createMany(Arrays.asList(MerchantInfoUtil.randomMerchantInfo()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.commit();
		assertEquals(1, affectedRows);
	}

	@Test
	public void testCreateOne() {
		MerchantInfo toCreate = MerchantInfoUtil.randomMerchantInfo();
		int affectedRows = mapper.createOne(toCreate);

		MerchantInfo actual = mapper.queryOne(new MerchantInfo().setId(toCreate.getId()));

		System.out.println(toCreate);
		System.out.println(actual);

		assertEquals(1, affectedRows);
		assertEquals(toCreate, actual);
	}

	@Test
	public void testCreateMany() {
		List<MerchantInfo> many = MerchantInfoUtil.randomMerchantInfoList(3);
		int affectedRows = mapper.createMany(many);

		assertEquals(3, affectedRows);

		MerchantInfo actual1 = mapper.queryOne(new MerchantInfo().setId(many.get(0).getId()));
		MerchantInfo actual2 = mapper.queryOne(new MerchantInfo().setId(many.get(1).getId()));
		MerchantInfo actual3 = mapper.queryOne(new MerchantInfo().setId(many.get(2).getId()));
		// assert
		List<MerchantInfo> actualList = Arrays.asList(actual1, actual2, actual3);
		assertEquals(many, actualList);
	}

	@Test
	public void testQueryOne() {
		// 插入5行数据
		List<MerchantInfo> list = MerchantInfoUtil.randomMerchantInfoList(5);
		for (MerchantInfo it : list) {
			it.setMerchantNo("16968107");
		}
		list.get(0).setMerchantName("袁浩");
		String expectedAddress = list.get(0).getAddress();

		for (MerchantInfo it : list) {
			mapper.createOne(it);
		}

		MerchantInfo merchantInfo = new MerchantInfo();
		merchantInfo.setMerchantNo("16968107");
		merchantInfo.setMerchantName("袁浩");
		MerchantInfo one = mapper.queryOne(merchantInfo);
		System.out.println(one);
		assertEquals(expectedAddress, one.getAddress());

	}

	@Test
	public void testQueryMany() {
		// 清理数据库
		MerchantInfo toDetele = new MerchantInfo();
		toDetele.setMerchantNo("16968109");
		mapper.deleteMany(toDetele);

		// 插入5行数据
		List<MerchantInfo> list = MerchantInfoUtil.randomMerchantInfoList(5);
		for (MerchantInfo it : list) {
			it.setMerchantNo("16968109");
			mapper.createOne(it);
		}
		MerchantInfo merchantInfo = toDetele;
		merchantInfo.setMerchantNo("16968109");
		List<MerchantInfo> many = mapper.queryMany(merchantInfo);
		System.out.println(many);

		assertEquals(5, many.size());
		for (int i = 0; i < list.size(); i++) {
			assertEquals("16968109", many.get(i).getMerchantNo());
		}
	}

	@Test
	public void testDeleteOne() {
		// 全匹配
		MerchantInfo toCreate = MerchantInfoUtil.randomMerchantInfo();
		mapper.createOne(toCreate);

		int affectedRows = mapper.deleteOne(toCreate);
		assertEquals(1, affectedRows);
		MerchantInfo one = mapper.queryOne(toCreate);
		assertNull(one);

		// ID匹配
		MerchantInfo toCreate1 = MerchantInfoUtil.randomMerchantInfo();
		mapper.createOne(toCreate1);

		MerchantInfo merchantInfo = new MerchantInfo();
		merchantInfo.setId(toCreate1.getId());
		int affectedRows1 = mapper.deleteOne(merchantInfo);
		assertEquals(1, affectedRows1);
		MerchantInfo one1 = mapper.queryOne(toCreate);
		assertNull(one1);
	}

	@Test
	public void testDeleteMany() {
		// 全匹配
		MerchantInfo toCreate = MerchantInfoUtil.randomMerchantInfo();
		mapper.createMany(Arrays.asList(toCreate, toCreate, toCreate));// 插入三条相同数据

		int affectedRows = mapper.deleteMany(toCreate);
		assertEquals(3, affectedRows);
		List<MerchantInfo> many = mapper.queryMany(toCreate);
		assertEquals(0, many.size());

		// ID匹配
		MerchantInfo toCreate1 = MerchantInfoUtil.randomMerchantInfo();
		mapper.createMany(Arrays.asList(toCreate1, toCreate1, toCreate1));// 插入三条相同数据

		MerchantInfo merchantInfo = new MerchantInfo();
		merchantInfo.setId(toCreate1.getId());
		int affectedRows1 = mapper.deleteMany(merchantInfo);
		assertEquals(3, affectedRows1);
		List<MerchantInfo> many1 = mapper.queryMany(toCreate);
		assertEquals(0, many1.size());
	}

	@Test
	public void testUpdateOne() {
		MerchantInfo toCreate = MerchantInfoUtil.randomMerchantInfo();
		mapper.createOne(toCreate);

		MerchantInfo toUpdate = MerchantInfoUtil.randomMerchantInfo();
		mapper.updateOne(toCreate, toUpdate);

	}

}
