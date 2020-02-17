/**
 *
 */
package com.cd.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.lang.reflect.Field;
import java.util.List;
import org.junit.Test;
import com.cd.entity.MerchantInfo;

/**
 * @author Howie
 */
public class MerchantInfoUtilTest {

	@Test
	public void test() {
		MerchantInfo randomMerchantInfo = MerchantInfoUtil.randomMerchantInfo();
		assertNotNull(randomMerchantInfo);
		System.out.println(randomMerchantInfo);

		Field[] declaredFields = MerchantInfo.class.getDeclaredFields();
		Object value = null;
		for (Field f : declaredFields) {
			if (f.getName().equals("id")) {// 不检查id属性
				continue;
			}
			f.setAccessible(true);
			try {
				value = f.get(randomMerchantInfo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			assertNotNull(value);// 断言非null
			System.out.println(value);
		}
	}

	@Test
	public void testRandomMerchantInfoList() {
		List<MerchantInfo> list = MerchantInfoUtil.randomMerchantInfoList(10);
		assertEquals(10, list.size());
		System.out.println(list.size());

		assertNotNull(list);
		System.out.println(list);
	}
}
