package com.revature.projectdept2;

import java.sql.Connection;

import org.junit.Test;

import com.revature.projectdept2.util.ConncetionUtil;

import junit.framework.TestCase;

public class ConnectionUtilTest extends TestCase {

	@Test
	public void testConnection() {
		Connection connection = ConncetionUtil.getconnection();
		assertNotNull(connection);
	}

}
