package DAO;
/**
 * 用于注册用户的DAO
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DB.DBConn;

public class UserADDDAO {
	private	Connection conn;
	private String sql;
	public void addUser(String UserLoginName,String UserPassword,String UserName,String Sex,String Phone){
		try{
			conn=DBConn.getConn();
				System.out.println("数据库增加User");
				sql="insert into tb_User(UserLoginName,UserPassword,UserName,Sex,Phone) values(?,?,?,?,?)";
				PreparedStatement mConnection=conn.prepareStatement(sql);
				mConnection.setString(1, UserLoginName);
				mConnection.setString(2, UserPassword);
				mConnection.setString(3, UserName);
				mConnection.setString(4, Sex);
				mConnection.setString(5, Phone);
				ResultSet rs=mConnection.executeQuery();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			DBConn.closeConn();
		}
	}
}
