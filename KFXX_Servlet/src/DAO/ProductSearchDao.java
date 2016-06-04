package DAO;
/**
 * 用于库存查询的DAO
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DB.DBConn;
import Model.ProductBean;
import Model.UserBean;

public class ProductSearchDao {
	 private	Connection conn;
		private String sql;
		private ArrayList<ProductBean> products=new ArrayList<ProductBean>();
		private ArrayList<ProductBean> products2=new ArrayList<ProductBean>();
		public ArrayList<ProductBean> checkExist(String ProductId,String ProductName){
			try{
				conn=DBConn.getConn();
				if(ProductId==""&&ProductName==""){
					sql="select * from tb_Product ";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					ResultSet rs=mConnection.executeQuery();
					while(rs.next()){
						ProductBean product=new ProductBean();
						product.setProductID(rs.getInt(1));
						product.setProductName(rs.getString(2));
						product.setProductCategory(rs.getString(3));
						product.setStockPrice(rs.getFloat(4));
						product.setSellPrice(rs.getFloat(5));
						product.setInventory(rs.getInt(6));
						product.setDate(rs.getDate(7));
						System.out.println("数据库连接全product2");
						products.add(product);
					
					}
					return products;
					
				}
				else if(ProductId==""&&ProductName!=""){
					sql="select * from tb_Product where ProductName=?";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					mConnection.setString(1, ProductName);
					ResultSet rs=mConnection.executeQuery();
					while(rs.next()){
						ProductBean product=new ProductBean();
						product.setProductID(rs.getInt(1));
						product.setProductName(rs.getString(2));
						product.setProductCategory(rs.getString(3));
						product.setStockPrice(rs.getFloat(4));
						product.setSellPrice(rs.getFloat(5));
						product.setInventory(rs.getInt(6));
						product.setDate(rs.getDate(7));
						System.out.println("数据库连接全product1");
						products.add(product);
						
					}
					return products;
					
				}
				else if(ProductId!=""&&ProductName==""){
					sql="select * from tb_Product where ProductID=?";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					int id=Integer.parseInt(ProductId);
					mConnection.setInt(1, id);
					ResultSet rs=mConnection.executeQuery();
					while(rs.next()){
						ProductBean product=new ProductBean();
						product.setProductID(rs.getInt(1));
						product.setProductName(rs.getString(2));
						product.setProductCategory(rs.getString(3));
						product.setStockPrice(rs.getFloat(4));
						product.setSellPrice(rs.getFloat(5));
						product.setInventory(rs.getInt(6));
						product.setDate(rs.getDate(7));
						System.out.println("数据库连接全product3");
						products.add(product);
						
					}
					return products;
				}
				else {
					sql="select * from tb_Product where ProductID=? and ProductName=?";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					int id=Integer.parseInt(ProductId);
					mConnection.setInt(1, id);
					mConnection.setString(2, ProductName);
					ResultSet rs=mConnection.executeQuery();
					
					while(rs.next()){
						ProductBean product=new ProductBean();
						product.setProductID(rs.getInt(1));
						product.setProductName(rs.getString(2));
						product.setProductCategory(rs.getString(3));
						product.setStockPrice(rs.getFloat(4));
						product.setSellPrice(rs.getFloat(5));
						product.setInventory(rs.getInt(6));
						product.setDate(rs.getDate(7));
						System.out.println("数据库连接全product4");
						products.add(product);						
						
					}
					return products;
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
		/**
		 * 库存预警查询函数
		 * @return
		 */
		public ArrayList<ProductBean> ProductWarn(){
			try{
				int count=5;
				conn=DBConn.getConn();
			
					sql="select * from tb_Product where Inventory<=?";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					mConnection.setInt(1,count);
					ResultSet rs=mConnection.executeQuery();
					while(rs.next()){
						ProductBean product=new ProductBean();
						product.setProductID(rs.getInt(1));
						product.setProductName(rs.getString(2));
						product.setProductCategory(rs.getString(3));
						product.setStockPrice(rs.getFloat(4));
						product.setSellPrice(rs.getFloat(5));
						product.setInventory(rs.getInt(6));
						product.setDate(rs.getDate(7));
						System.out.println("数据库连接全product2");
						products2.add(product);
					
					}
					return products2;
					
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
