package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DB.DBConn;

/**
 * 用于商品删除的DAO
 * @author Administrator
 *
 */
public class ProductDeleteDao {
	private	Connection conn;
	private String sql;
		public void deleteProduct(String number){
			try{
				conn=DBConn.getConn();
				sql="delete from tb_Product where ProductID=?";
				PreparedStatement mConnection=conn.prepareStatement(sql);
				mConnection.setInt(1, Integer.parseInt(number));
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
