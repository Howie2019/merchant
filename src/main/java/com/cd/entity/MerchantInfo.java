package com.cd.entity;

public class MerchantInfo {
	// 无意义主键
	private Integer id;
	// 商户编号（8位，全局唯一）
	private String merchantNo;
	// 客户号
	private String custNo;
	// 商户名称
	private String merchantName;
	// 商户对公结算户
	private String merchantAccount;
	// 记录状态
	private String status;
	// 联系地址
	private String address;
	// 联系电话
	private String telephone;
	// 创建时间
	private String createDateTime;
	// 创建人
	private String createPerson;
	// 更新时间
	private String updateDateTime;
	// 修改人
	private String updatePerson;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantAccount() {
		return merchantAccount;
	}

	public void setMerchantAccount(String merchantAccount) {
		this.merchantAccount = merchantAccount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getCreatePerson() {
		return createPerson;
	}

	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	public String getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public String getUpdatePerson() {
		return updatePerson;
	}

	public void setUpdatePerson(String updatePerson) {
		this.updatePerson = updatePerson;
	}

	@Override
	public String toString() {
		return "MerchantInfo [id=" + id + ", merchantNo=" + merchantNo + ", custNo=" + custNo + ", merchantName=" + merchantName + ", merchantAccount=" + merchantAccount + ", status=" + status + ", address=" + address + ", telephone=" + telephone + ", createDateTime=" + createDateTime + ", createPerson=" + createPerson + ", updateDateTime=" + updateDateTime + ", updatePerson=" + updatePerson + "]";
	}

	// public static class Builder {
	// private MerchantInfo merchant = new MerchantInfo();
	//
	// public Builder merchantNo(String merchantNo) {
	// merchant.setMerchantNo(merchantNo);
	// return this;
	// }
	//
	// public Builder custNo(String custNo) {
	// merchant.setCustNo(custNo);
	// return this;
	// }
	//
	// public Builder merchantName(String merchantName) {
	// merchant.setMerchantName(merchantName);
	// return this;
	// }
	//
	// public Builder merchantAccount(String merchantAccount) {
	// merchant.setMerchantAccount(merchantAccount);
	// return this;
	// }
	//
	// public Builder status(String status) {
	// merchant.setStatus(status);
	// return this;
	// }
	//
	// public Builder address(String address) {
	// merchant.setAddress(address);
	// return this;
	// }
	//
	// public Builder telephone(String telephone) {
	// merchant.setTelephone(telephone);
	// return this;
	// }
	//
	// public Builder createDateTime(String createDateTime) {
	// merchant.setCreateDateTime(createDateTime);
	// return this;
	// }
	//
	// public Builder createPerson(String createPerson) {
	// merchant.setCreatePerson(createPerson);
	// return this;
	// }
	//
	// public Builder updateDateTime(String updateDateTime) {
	// merchant.setUpdateDateTime(updateDateTime);
	// return this;
	// }
	//
	// public Builder updatePerson(String updatePerson) {
	// merchant.setUpdatePerson(updatePerson);
	// return this;
	// }
	//
	// public MerchantInfo build() {
	// return merchant;
	// }
	//
	// }
}
