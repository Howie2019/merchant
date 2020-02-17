package com.cd.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
//字段实在太多了, 权衡再三, 选择引入lombok
//好处: 简化代码, 增加可读性. 代码越多, 出错的可能性却大. 
//坏处: lombok带有侵入性, 在无插件的eclipse下会报错
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
}
