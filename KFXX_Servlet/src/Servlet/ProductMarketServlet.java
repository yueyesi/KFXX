package Servlet;
/**
 *用于商品销售的Servlet
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductMarketDao;
import Model.ProductBean;

public class ProductMarketServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置response和request字符类型
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		ProductMarketDao productMarketDao=new ProductMarketDao();
		PrintWriter out=response.getWriter();
		if(request.getParameter("ProductID")==""||request.getParameter("OrderNumber")==""){
			out.println("<script>alert('订单信息未填写完成请重新填写')</script>");
		}
		else{
		 productMarketDao.addOrder(request.getParameter("ProductID"),request.getParameter("OrderNumber"), request.getParameter("Discount"));
		 productMarketDao.deleteProduct(request.getParameter("ProductID"),request.getParameter("OrderNumber"));
		 	ProductBean l=productMarketDao.findProduct(request.getParameter("ProductID"));
		 	float SellPrice=l.getSellPrice();
		 	int count=Integer.parseInt(request.getParameter("OrderNumber"));
		 	float discount=Float.parseFloat(request.getParameter("Discount"));
		 	float sum=SellPrice*discount*(float)count;
		 	request.setAttribute("sum", sum);
		}
		request.getRequestDispatcher("product_market.jsp").forward(request, response);
		 
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
