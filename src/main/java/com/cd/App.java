package com.cd;

import javax.xml.ws.Endpoint;
import com.cd.service.MerchantImpl;

/**
 * 运行此类后在浏览器访问http://localhost:8888/ws/merchantInfo?wsdl查看webservice定义
 *
 * @author Howie
 */
public class App {
	public static void main(String[] args) {

		String address = "http://localhost:8888/ws/merchantInfo";
		Endpoint.publish(address, new MerchantImpl());

		// String address = "http://localhost:8888/ws/merchant";
		// Endpoint.publish(address, new MerchantImpl());
		// System.out.println("ServerTest start");
	}
}
