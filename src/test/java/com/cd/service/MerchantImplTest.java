/**
 *
 */
package com.cd.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.cd.util.MerchantInfoUtil;

/**
 * @author Howie
 */
public class MerchantImplTest {

	@Test
	public void testCreateOne() {
		IMerchant merchant = new MerchantImpl();
		int affectedRows = merchant.createOne(MerchantInfoUtil.randomMerchantInfo());
		assertEquals(1, affectedRows);
	}

}
