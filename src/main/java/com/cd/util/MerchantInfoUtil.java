/**
 *
 */
package com.cd.util;

import java.util.ArrayList;
import java.util.List;
import com.cd.entity.MerchantInfo;

/**
 * @author Howie
 */
public abstract class MerchantInfoUtil {
	/**
	 * MerchantInfoUtil工厂方法, 生成一个MerchantInfo, 属性随机填写
	 *
	 * @return 属性随机的MerchantInfo
	 */
	public static MerchantInfo randomMerchantInfo() {
		String merchantNo = StringUtil.randomDigits(Constants.merchantNo_LEN);
		String custNo = StringUtil.randomDigits(Constants.custNo_LEN);
		String merchantName = StringUtil.randomName(3);
		String merchantAccount = StringUtil.randomString(Constants.merchantAccount_LEN);
		String status = StringUtil.randomString(Constants.status_LEN);
		String address = StringUtil.randomString(20);
		String telephone = StringUtil.randomDigits(11);
		String createDateTime = StringUtil.currentTime();
		String createPerson = StringUtil.randomName(3);
		String updateDateTime = createDateTime;
		String updatePerson = createPerson;

		MerchantInfo merchantInfo = new MerchantInfo();
		merchantInfo.setMerchantNo(merchantNo);
		merchantInfo.setCustNo(custNo);
		merchantInfo.setMerchantName(merchantName);
		merchantInfo.setMerchantAccount(merchantAccount);
		merchantInfo.setStatus(status);
		merchantInfo.setAddress(address);
		merchantInfo.setTelephone(telephone);
		merchantInfo.setCreateDateTime(createDateTime);
		merchantInfo.setCreatePerson(createPerson);
		merchantInfo.setUpdateDateTime(updateDateTime);
		merchantInfo.setUpdatePerson(updatePerson);

		return merchantInfo;
	}

	/**
	 * 得到含有size个MerchantInfo的List, 属性随机填写
	 * 
	 * @param size list中MerchantInfo的个数
	 * @return 含有size个MerchantInfo的List
	 */
	public static List<MerchantInfo> randomMerchantInfoList(int size) {
		List<MerchantInfo> list = new ArrayList<>(size);
		for (int i = 1; i <= size; i++) {
			list.add(randomMerchantInfo());
		}
		return list;
	}
}
