/**
 *
 */
package com.cd.dao;

import java.util.List;
import com.cd.entity.MerchantInfo;

/**
 * @author Howie
 */
public interface MerchantMapper {
	MerchantInfo GetMerchantInfoByID(Integer id) throws Exception;

	int create(List<MerchantInfo> merchantInfoList);

	int createOne(MerchantInfo merchantInfo);
}
