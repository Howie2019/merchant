/**
 *
 */
package com.cd.util;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Howie
 */
public class StringUtilTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRandomString() {
		String randomString = StringUtil.randomString(8);
		System.out.println(randomString);
		assertEquals(8, randomString.length());
	}

	@Test
	public void testRandomDigits() {
		String randomDigits = StringUtil.randomDigits(11);
		System.out.println(randomDigits);
		assertEquals(11, randomDigits.length());
	}

}
