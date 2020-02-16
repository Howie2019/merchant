package com.cd.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.cd.entity.MerchantInfo;

@WebService
public interface IMerchant {

	@WebMethod
	String sayHello(String name);

	/**
	 * 批量新增
	 *
	 * @param merchantInfoList 待插入的MerchantInfo
	 * @return 数据库受影响的记录条数
	 */
	@WebMethod
	int create(List<MerchantInfo> merchantInfoList);

	/**
	 * 新增一个MerchantInfo
	 *
	 * @param merchantInfo 待插入的MerchantInfo
	 * @return 数据库受影响的记录条数
	 */
	@WebMethod
	int createOne(MerchantInfo merchantInfo);

	/**
	 * 删除
	 *
	 * @param template 查询模板
	 * @return 数据库受影响的记录条数
	 */
	@WebMethod
	int delete(MerchantInfo template);

	/**
	 * 更新
	 *
	 * @param template 查询模板
	 * @param newMerchantInfo 新的MerchantInfo
	 * @return 数据库受影响的记录条数
	 */
	@WebMethod
	int update(MerchantInfo template, MerchantInfo newMerchantInfo);

	/**
	 * 查询
	 *
	 * @param template 查询模板
	 * @return 商户列表
	 */
	@WebMethod
	List<MerchantInfo> Retrieve(MerchantInfo template);

}
