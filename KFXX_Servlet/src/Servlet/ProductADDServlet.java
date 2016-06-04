package Servlet;
/**
 * 用于进货的Servlet
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import DAO.ProductADDDao;

public class ProductADDServlet extends HttpServlet {
			@Override
			protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				// TODO Auto-generated method stub
				response.setContentType("text/html;charset=UTF-8");
				request.setCharacterEncoding("utf-8");
				ProductADDDao productADDDao=new ProductADDDao();
				PrintWriter out=response.getWriter();
			if(request.getParameter("ProductName")!=""&&request.getParameter("StockPrice")!=""&&request.getParameter("Inventory")!=""){
					
		
				
				productADDDao.addProduct(request.getParameter("ProductName"), request.getParameter("select1"), request.getParameter("StockPrice"), request.getParameter("Inventory"));
				out.println("<script>alert('进货成功!!!!')</script>");
				
				
				
				}
			
				response.sendRedirect("product_add.jsp");
				
				
			}
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doGet(req, resp);
			}
}
