package DAO;
/**
 * ���ڽ�����DAO
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;





import DB.DBConn;
import Model.ProductBean;

public class ProductADDDao {
	private	Connection conn;
	private String sql;
	public void addProduct(String ProductName,String ProductCategory,String StockPrice,String Inventory){
			String productCategory;
			float stockPrice,sellPrice;
			int inventory;
			
			
			Date datatime=new Date(System.currentTimeMillis());
			if(ProductCategory.equals("1"))
			{
				productCategory="ʳƷ";
			}
			else if(ProductCategory.equals("2")){
				productCategory="ˮ��";
			}
			else if(ProductCategory.equals("3")){
				productCategory="����Ʒ";
			}
			else if(ProductCategory.equals("4")){
				productCategory="����";
			}
			else if(ProductCategory.equals("5")){
				productCategory="����";
			}
			else{
				productCategory="����";
			}
			stockPrice=Float.parseFloat(StockPrice);
			sellPrice=(float) (stockPrice*(1.2));
			inventory=Integer.parseInt(Inventory);
			try{
				conn=DBConn.getConn();
					System.out.println("���ݿ�����12");
					sql="insert into tb_Product(ProductName,ProductCategory,StockPrice,SellPrice,Inventory,PastTime) values(?,?,?,?,?,?)";
					PreparedStatement mConnection=conn.prepareStatement(sql);
					mConnection.setString(1, ProductName);
					mConnection.setString(2, productCategory);
					mConnection.setFloat(3, stockPrice);
					mConnection.setFloat(4, sellPrice);
					mConnection.setInt(5, inventory);
					mConnection.setDate(6,datatime);
					ResultSet rs=mConnection.executeQuery();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		
	}
}
