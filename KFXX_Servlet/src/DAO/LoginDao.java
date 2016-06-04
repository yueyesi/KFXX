package DAO;
/**
 * 用于登录的DAO
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DB.DBConn;
import Model.AdministratorBean;
import Model.UserBean;


public class LoginDao {
	 private	Connection conn;
		private String sql;
		public UserBean checkLogin(String name,String password){
			try{
				conn=DBConn.getConn();
				sql="select * from tb_User where UserLoginName=? and UserPassword=?";
				PreparedStatement mConnection=conn.prepareStatement(sql);
				mConnection.setString(1, name);
				System.out.println(name);
				mConnection.setString(2, password);
				ResultSet  rs=mConnection.executeQuery();
				System.out.println("数据库连接1");
				if(rs.next()){
					UserBean login=new UserBean();
					login.setUserID(rs.getInt(1));
					
					login.setUserLoginName(rs.getString(2));
				
					login.setUserPassword(rs.getString(3));
					
					login.setUserName(rs.getString(4));
					
					login.setSex(rs.getString(5));
					
					login.setPhone(rs.getString(6));
				
				
					System.out.print("数据库连接2");
					return login;
				}
				return null;
			}
			catch(Exception e){
				e.printStackTrace();
				System.out.println("数据库连接不上");
				return null;
			
			}
			finally{
				DBConn.closeConn();
			}
		}
		public AdministratorBean checkLogin2(String name,String password){
			try{
				conn=DBConn.getConn();
				sql="select * from tb_Administor where AdministorName=? and AdminstorPassword=?";
				PreparedStatement mConnection=conn.prepareStatement(sql);
				mConnection.setString(1, name);
			
				mConnection.setString(2, password);
				ResultSet  rs=mConnection.executeQuery();
				if(rs.next()){
					AdministratorBean login2=new AdministratorBean();
					login2.setAdministratorID(rs.getInt(1));
					login2.setAdministratorName(rs.getString(2));
					login2.setAdministratorPassword(rs.getString(3));
					System.out.println("Administor1");
					return login2;
				}
				return null;
			}
			catch(Exception e){
				e.printStackTrace();
				return null;
			}
			finally{
				DBConn.closeConn();
			}
		}
}
