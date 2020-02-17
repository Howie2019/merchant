/**
 *
 */
package com.cd.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cd.entity.MerchantInfo;

/**
 * @author Howie
 */
public interface MerchantMapper {
	// MerchantInfo queryByID(Integer id) throws Exception;

	int createMany(List<MerchantInfo> merchantInfoList);

	int createOne(MerchantInfo merchantInfo);

	/**
	 * 查询匹配的第一条记录
	 *
	 * @param template 查询模板
	 * @return 受影响的行数
	 */
	MerchantInfo queryOne(MerchantInfo template);

	/**
	 * 查询匹配的所有记录
	 *
	 * @param template 查询模板
	 * @return 受影响的行数
	 */
	List<MerchantInfo> queryMany(MerchantInfo template);

	/**
	 * 删除匹配的第一条记录
	 *
	 * @param template 查询模板
	 * @return 受影响的行数
	 */
	int deleteOne(MerchantInfo template);

	/**
	 * 删除匹配的所有记录
	 *
	 * @param template 查询模板
	 * @return 受影响的行数
	 */
	int deleteMany(MerchantInfo template);

	/**
	 * 更新匹配的第一条记录
	 *
	 * @param template 查询模板
	 * @return 受影响的行数
	 */
	int updateOne(@Param("template") MerchantInfo template, @Param("newMerchantInfo") MerchantInfo newMerchantInfo);

	/**
	 * 更新匹配的所有记录
	 *
	 * @param template 查询模板
	 * @return 受影响的行数
	 */
	int updateMany(MerchantInfo template, MerchantInfo newMerchantInfo);
}
