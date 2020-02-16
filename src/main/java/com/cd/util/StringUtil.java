/**
 *
 */
package com.cd.util;

import java.time.LocalDateTime;
import java.util.Random;

public class StringUtil {

	/**
	 * 产生仅仅包含数字的随机字符串
	 *
	 * @param length 产生的随机字符串的长度
	 * @return 仅仅包含数字的随机字符串
	 */
	public static String randomDigits(int length) {
		String str = "0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(str.length());
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}

	public static String randomName(int length) {
		String firstName = randomString(1, "李王张刘陈杨赵黄周吴");
		String lasttName = randomString(2, "泽海超阳海荣海逸海昌瀚越飞小刚中华国庆家雄");
		return firstName + lasttName;
	}

	/**
	 * @param length 产生的随机字符串的长度
	 * @param str 从本字符串中选择字符
	 * @return 随机字符串
	 */
	public static String randomString(int length, String str) {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {

			int number = random.nextInt(str.length());
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}

	/**
	 * 返回包含大小写字母和数字的随机字符串
	 *
	 * @param length 产生的随机字符串的长度
	 * @return 包含大小写字母和数字的随机字符串
	 */
	public static String randomString(int length) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		return randomString(length, str);
	}

	/**
	 * @return 当前时间
	 */
	public static String currentTime() {
		return LocalDateTime.now().toString();
	}

	/**
	 * 格式示例 2007-12-03T10:15:30
	 *
	 * @param time 时间字符串
	 * @return LocalDateTime对象
	 */
	public static LocalDateTime parseTime(String time) {
		return LocalDateTime.parse(time);
	}
}
