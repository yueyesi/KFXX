package Servlet;
/**
 * �����¶�����ͳ�Ƶ�Servlet
 */
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductStatisticMonth;
import Model.Order;
import Model.StatisticModel;

public class ProductStatisticServlet extends HttpServlet {
		private ArrayList<Order> orders;
		private ArrayList<StatisticModel> models;
		private float MaxPrice=0.0f;
		private int maxPriceID;
		private int MaxCount=0;
		private int maxCountID;
		private float Sum=0.0f;
		private String MaxPriceName;
		private String MaxCountName;
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("utf-8");
			int month=Integer.parseInt(request.getParameter("month"));
			ProductStatisticMonth productStatisticMonth=new ProductStatisticMonth();
			orders=productStatisticMonth.getOrder(month);
			//��ʼ��
			Sum=0.0f;
			MaxPrice=0.0f;
			MaxCount=0;
			 MaxPriceName="";
			 MaxCountName="";
			 maxPriceID=0; 
			 maxCountID=0;
	
			models=productStatisticMonth.getStatisticModel(orders);
			for(int i=0;i<models.size();i++){
				
				if(models.get(i).getTotalPrice()>MaxPrice){
					
					MaxPrice=models.get(i).getTotalPrice();
					maxPriceID=models.get(i).getProductID();
				}
				if(models.get(i).getInventory()>MaxCount){
					MaxCount=models.get(i).getInventory();
					maxCountID=models.get(i).getProductID();
				}
				Sum+=models.get(i).getTotalPrice();
			}
			MaxPriceName=productStatisticMonth.checkProduct(maxPriceID);
			MaxCountName=productStatisticMonth.checkProduct(maxCountID);
			request.setAttribute("MaxPrice", MaxPrice);
			request.setAttribute("MaxPriceName", MaxPriceName);
			request.setAttribute("MaxCount", MaxCount);
			request.setAttribute("MaxCountName", MaxCountName);
			request.setAttribute("Sum", Sum);
			request.getRequestDispatcher("month_statistic.jsp").forward(request, response);
			
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		}
}
