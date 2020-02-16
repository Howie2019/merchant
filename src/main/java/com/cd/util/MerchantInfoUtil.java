/**
 *
 */
package com.cd.util;

import com.cd.entity.MerchantInfo;

/**
 * @author Howie
 */
public abstract class MerchantInfoUtil {
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
}
