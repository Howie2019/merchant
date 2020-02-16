/**
 *
 */
package com.cd.util;

import static org.junit.Assert.assertNotNull;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * @author Howie
 */
public abstract class SQLUtilTest {

	@Test
	public void test() {
		SqlSessionFactory sqlSessionFactory = SQLUtil.getSqlSessionFactory();
		assertNotNull(sqlSessionFactory);
	}

}
