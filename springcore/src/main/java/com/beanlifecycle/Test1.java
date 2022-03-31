package com.beanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test1 implements InitializingBean, DisposableBean{
	private String driver,url, username, pwd;
	private Connection con=null;

	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		Class.forName(driver);
	    con=DriverManager.getConnection(url,username, pwd);
		System.out.println("connection opened");
		
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		con.close();
		System.out.println("connection closed");
	}
	public void save(int id ,String name,String email,String address) throws SQLException {
		PreparedStatement ps=con.prepareStatement("Insert into student1(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, address);
		ps.executeUpdate();
		System.out.println("insertion success");
	}


	

	public void setUsername(String username) {
		this.username = username;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
