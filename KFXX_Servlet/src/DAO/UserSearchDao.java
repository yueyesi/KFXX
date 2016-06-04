package DAO;
/**
 * 用于查找用户信息的Dao
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DB.DBConn;
import Model.ProductBean;
import Model.UserBean;

public class UserSearchDao {
	 private	Connection conn;
		private String sql;
		private ArrayList<UserBean> users=new ArrayList<UserBean>();
		public ArrayList<UserBean> checkExist(String UserId,String UserName){
			try{
				conn=DBConn.getConn();
				if(UserId==""&&UserName==""){
					sql="select * from tb_User ";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					ResultSet rs=mConnection.executeQuery();
					while(rs.next()){
						UserBean user=new UserBean();
						user.setUserID(rs.getInt(1));
						user.setUserLoginName(rs.getString(2));
						user.setUserPassword(rs.getString(3));
						user.setUserName(rs.getString(4));
						user.setSex(rs.getString(5));
						user.setPhone(rs.getString(6));
						System.out.println("数据库连接全user2");
						users.add(user);
					
					}
					return users;
					
				}
				else if(UserId==""&&UserName!=""){
					sql="select * from tb_User where UserLoginName=?";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					mConnection.setString(1,UserName);
					ResultSet rs=mConnection.executeQuery();
					while(rs.next()){
						UserBean user=new UserBean();
						user.setUserID(rs.getInt(1));
						user.setUserLoginName(rs.getString(2));
						user.setUserPassword(rs.getString(3));
						user.setUserName(rs.getString(4));
						user.setSex(rs.getString(5));
						user.setPhone(rs.getString(6));
						System.out.println("数据库连接全user1");
						users.add(user);
					}
					return users;
					
				}
				else if(UserId!=""&&UserName==""){
					sql="select * from tb_User where UserID=?";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					int id=Integer.parseInt(UserId);
					mConnection.setInt(1, id);
					ResultSet rs=mConnection.executeQuery();
					while(rs.next()){
						UserBean user=new UserBean();
						user.setUserID(rs.getInt(1));
						user.setUserLoginName(rs.getString(2));
						user.setUserPassword(rs.getString(3));
						user.setUserName(rs.getString(4));
						user.setSex(rs.getString(5));
						user.setPhone(rs.getString(6));
						System.out.println("数据库连接全user3");
						users.add(user);
						
					}
					return users;
				}
				else {
					sql="select * from tb_User where UserID=? and UserLoginName=?";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					int id=Integer.parseInt(UserId);
					mConnection.setInt(1, id);
					mConnection.setString(2, UserName);
					ResultSet rs=mConnection.executeQuery();
					
					while(rs.next()){
						UserBean user=new UserBean();
						user.setUserID(rs.getInt(1));
						user.setUserLoginName(rs.getString(2));
						user.setUserPassword(rs.getString(3));
						user.setUserName(rs.getString(4));
						user.setSex(rs.getString(5));
						user.setPhone(rs.getString(6));
						System.out.println("数据库连接全user3");
						users.add(user);
					}
					return users;
				}
				
			}
			catch(Exception e){
					e.printStackTrace();
					System.out.println("数据库连接不上product");
					return null;
			}
			finally{
				DBConn.closeConn();
			}
				
		}
}
