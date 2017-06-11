package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class Testf {
	private static final String url="jdbc:mysql://localhost:3306/book_ex?useSSL=false&serverTimezone=UTC";
	private static final String driver="com.mysql.cj.jdbc.Driver";
	@Test
	public void test() throws SQLException, ClassNotFoundException{
		Class.forName(driver);
		try(Connection con=DriverManager.getConnection(url,"root","zxc06733")){
			System.out.println(con);
		}
	}
}
