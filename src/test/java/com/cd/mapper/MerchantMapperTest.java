/**
 *
 */
package com.cd.mapper;

import static org.junit.Assert.assertEquals;
import java.io.Reader;
import java.util.Arrays;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import com.cd.dao.MerchantMapper;
import com.cd.entity.MerchantInfo;
import com.cd.util.Constants;
import com.cd.util.MerchantInfoUtil;
import com.cd.util.StringUtil;

/**
 * @author Howie
 */
public class MerchantMapperTest {
	Reader reader;
	SqlSessionFactory sessionFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		reader = Resources.getResourceAsReader("mybatis-config.xml");
		// 构建sqlSession的工厂
		sessionFactory = new SqlSessionFactoryBuilder().build(reader);

	}

	@Test
	public void testGetMerchantInfoByID() {
		SqlSession session = sessionFactory.openSession();
		MerchantMapper mapper = session.getMapper(MerchantMapper.class);
		MerchantInfo merchantInfo = null;
		try {
			merchantInfo = mapper.GetMerchantInfoByID(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(merchantInfo.toString());

		session.commit();
		assertEquals("张三", merchantInfo.getMerchantName());

	}

	// @Test
	public void testCreate() {
		SqlSession session = sessionFactory.openSession();
		MerchantMapper mapper = session.getMapper(MerchantMapper.class);
		int affectedRows = 0;
		String address = StringUtil.randomString(Constants.address_LEN);
		try {
			affectedRows = mapper.create(Arrays.asList(MerchantInfoUtil.randomMerchantInfo()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.commit();
		assertEquals(1, affectedRows);
	}

	@Test
	public void testCreateOne() {
		SqlSession session = sessionFactory.openSession();
		MerchantMapper mapper = session.getMapper(MerchantMapper.class);
		int affectedRows = 0;

		try {
			affectedRows = mapper.createOne(MerchantInfoUtil.randomMerchantInfo());
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.commit();
		assertEquals(1, affectedRows);
	}

}
