/**
 *
 */
package com.cd.service;

import java.util.List;
import javax.jws.WebService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.cd.dao.MerchantMapper;
import com.cd.entity.MerchantInfo;
import com.cd.util.SQLUtil;

/**
 * @author Howie
 */
@WebService
public class MerchantImpl implements IMerchant {
	SqlSessionFactory sqlSessionFactory = SQLUtil.getSqlSessionFactory();

	SqlSession session = sqlSessionFactory.openSession(true);
	SqlSession sessionWithTx = sqlSessionFactory.openSession(false);

	/**
	 * @param name
	 * @return
	 * @see com.cd.service.IMerchant#sayHello(java.lang.String)
	 */
	@Override
	public String sayHello(String name) {
		return "hello " + name;
	}

	/**
	 * @param merchantInfoList
	 * @return
	 * @see com.cd.service.IMerchant#create(java.util.List)
	 */
	@Override
	public int create(List<MerchantInfo> merchantInfoList) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @param merchantInfo
	 * @return
	 * @see com.cd.service.IMerchant#createOne(com.cd.entity.MerchantInfo)
	 */
	@Override
	public int createOne(MerchantInfo merchantInfo) {
		MerchantMapper mapper = session.getMapper(MerchantMapper.class);
		int affectedRows = mapper.createOne(merchantInfo);
		return affectedRows;
	}

	/**
	 * @param template
	 * @return
	 * @see com.cd.service.IMerchant#delete(com.cd.entity.MerchantInfo)
	 */
	@Override
	public int delete(MerchantInfo template) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @param template
	 * @param newMerchantInfo
	 * @return
	 * @see com.cd.service.IMerchant#update(com.cd.entity.MerchantInfo, com.cd.entity.MerchantInfo)
	 */
	@Override
	public int update(MerchantInfo template, MerchantInfo newMerchantInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @param template
	 * @return
	 * @see com.cd.service.IMerchant#Retrieve(com.cd.entity.MerchantInfo)
	 */
	@Override
	public List<MerchantInfo> Retrieve(MerchantInfo template) {
		// TODO Auto-generated method stub
		return null;
	}

}
