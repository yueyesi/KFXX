package DAO;
/**
 * �����������ͳ�Ƶ�dao 
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import DB.DBConn;
import Model.Order;
import Model.StatisticModel;

public class ProductStatisticYear {
	private	Connection conn;
	private String sql;
	private int MaxDay;
	private Calendar calendar=Calendar.getInstance();
	/**
	 * ʵ����Ʒ��Ͷ���������ӣ�����һ��Order����
	 * @param month
	 * @return
	 */
	public ArrayList<Order> getOrder(int year){
		
		ArrayList<Order> orders=new ArrayList<Order>();
		
		Date datetime1=new Date(System.currentTimeMillis());
		Date datetime2=new Date(System.currentTimeMillis());
		System.out.print("���"+year);
	
		datetime1.setYear(year-1900);
		datetime2.setYear(year-1900);
		datetime1.setMonth(0);
		datetime1.setDate(1);
		datetime2.setMonth(11);
		datetime2.setDate(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(datetime1);
		System.out.println(datetime2);
		try{
			conn=DBConn.getConn();
			sql="select OrderID,tb_order.ProductID,OrderNumber,SellTime,Discount,tb_Product.SellPrice from tb_order,tb_Product where tb_order.ProductID=tb_Product.ProductID and SellTime between ? and ?";    
			PreparedStatement mConnection=conn.prepareStatement(sql);
			mConnection.setDate(1, datetime1);
			mConnection.setDate(2, datetime2);
			
			ResultSet rs=mConnection.executeQuery();
			
			while(rs.next()){
				Order order=new Order();
				order.setOrderID(rs.getInt(1));
				order.setProductID(rs.getInt(2));
				order.setOrderNumber(rs.getInt(3));
				order.setSellTime(rs.getDate(4));
				order.setDiscount(rs.getFloat(5));
				order.setSellPrice(rs.getFloat(6));
				
				float  sum;
				float number=(float)(rs.getInt(3));
				sum=number*(rs.getFloat(5))*(rs.getFloat(6));
				order.setSumPrice(sum);
				orders.add(order);
				
				
			
			}
			
			
			return orders;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		finally{
			DBConn.closeConn();
		}
	}
	/**
	 * �Դ���ʵ���¼���������������Ʒ
	 * �Դ���ʵ�������۶�������Ʒ
	 *����һ��StatisticModelͳ����
	 * @param orders
	 * @return
	 */
	public ArrayList<StatisticModel> getStatisticModel(ArrayList<Order> orders){
			int i,j;
			ArrayList<StatisticModel> models=new ArrayList<StatisticModel>();
			for(i=0;i<orders.size();i++){
				int ProductID=orders.get(i).getProductID();
				int OrderNumber=orders.get(i).getOrderNumber();
				
				System.out.println("ͳ��һ"+ProductID); 
				float SumPrice=orders.get(i).getSumPrice();
				for(j=0;j<models.size();j++){
					if(models.get(j).getProductID()==ProductID){
					
						System.out.println("ͳ�ƶ�");
						break;
					}
					
						
					
				}
				if(j>=models.size()){
					System.out.println("ͳ����");
					StatisticModel model=new StatisticModel();
					model.setInventory(OrderNumber);
					model.setTotalPrice(SumPrice);
					model.setProductID(ProductID);
					models.add(model);
					System.out.println(models.size());
				}
				else{
					models.get(j).setTotalPrice(models.get(j).getTotalPrice()+SumPrice);
					models.get(j).setInventory(models.get(j).getInventory()+OrderNumber);
					System.out.println("ͳ����"); 
					System.out.println(models.size());
				}
			}
			return models;
		
	}
	/**
	 * ������Ʒ��Ų�����Ʒ����
	 */
	public String checkProduct(int ProductID){
		String name="";
		try{
			conn=DBConn.getConn();
			sql="select ProductName from tb_Product where ProductID=?";
			PreparedStatement mConnection=conn.prepareStatement(sql);
			mConnection.setInt(1, ProductID);
			ResultSet  rs=mConnection.executeQuery();
			if(rs.next()){
				name=rs.getString(1);
			}
			return name;
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
