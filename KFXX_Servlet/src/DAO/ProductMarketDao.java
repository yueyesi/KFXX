package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DB.DBConn;
import Model.ProductBean;

/**
 * ������Ʒ������DAO
 * @author Administrator
 *
 */
public class ProductMarketDao {
	private	Connection conn;
	private String sql;
	//��Ӷ�����Ϣ
	public void addOrder(String ProductID,String OrderNumber,String Discount){
		int productID=Integer.parseInt(ProductID);//��ƷID
		int orderNumber=Integer.parseInt(OrderNumber);//��������Ʒ����
		float discount=Float.parseFloat(Discount);//������
		Date datatime=new Date(System.currentTimeMillis());//��ǰʱ��
		
		try{
			conn=DBConn.getConn();
				System.out.println("���ݿ�����12");
				sql="insert into tb_order(ProductID,OrderNumber,SellTime,Discount) values(?,?,?,?)";
				PreparedStatement mConnection=conn.prepareStatement(sql);
				mConnection.setInt(1, productID);
				mConnection.setInt(2,orderNumber);
				mConnection.setDate(3, datatime);
				mConnection.setFloat(4, discount);
				
				ResultSet rs=mConnection.executeQuery();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	//����Ʒ���м�ȥ��������Ʒ����
	public void deleteProduct(String ProductID,String OrderNumber){
		int orderNumber=Integer.parseInt(OrderNumber);
		int productID=Integer.parseInt(ProductID);
		int count = 0;
		//��ȡ����е���
		try{
			conn=DBConn.getConn();
			sql="select Inventory from tb_Product where ProductID=?";
			PreparedStatement mConnection1=conn.prepareStatement(sql);
			mConnection1.setInt(1, productID);
			ResultSet rs=mConnection1.executeQuery();
			if(rs.next()){
				count=rs.getInt(1);
				System.out.println(count+"��Ʒ����DAO");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//��ȥ��������Ʒ����
	
		try{
				count=count-orderNumber;
				System.out.println("���ݿ�����12");
				sql="update tb_Product set Inventory=? where ProductID=?";
				PreparedStatement mConnection=conn.prepareStatement(sql);
				mConnection.setInt(1,count);
				mConnection.setInt(2,productID);
				ResultSet rs=mConnection.executeQuery();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			DBConn.closeConn();
		}
	}
	//��ȡ��Ʒ����,��ȡ��Ʒ�ۼ�
	public ProductBean findProduct(String ProductID){
		int productID=Integer.parseInt(ProductID);
		ProductBean productBean=new ProductBean();
		try{
			conn=DBConn.getConn();
			sql="select * from tb_Product where ProductID=?";
			PreparedStatement mConnection1=conn.prepareStatement(sql);
			mConnection1.setInt(1, productID);
			ResultSet rs=mConnection1.executeQuery();
			if(rs.next()){
				productBean.setProductID(rs.getInt(1));
				productBean.setProductName(rs.getString(2));
				productBean.setProductCategory(rs.getString(3));
				productBean.setStockPrice(rs.getFloat(4));
				productBean.setSellPrice(rs.getFloat(5));
				productBean.setInventory(rs.getInt(6));
				productBean.setDate(rs.getDate(7));
				return productBean;
			}
			return null;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		finally{
			DBConn.getConn();
		}
	}
}
