/**
 *
 */
package com.cd.service;

import javax.xml.ws.Endpoint;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Howie
 */
public class IMerchantServiceTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

		String address = "http://localhost:8888/ws/merchant";
		Endpoint.publish(address, new MerchantImpl());
		System.out.println("ServerTest start");

	}

}
