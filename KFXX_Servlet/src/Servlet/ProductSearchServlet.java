package Servlet;
/**
 * 用于库存查找的Servlet
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductSearchDao;
import Model.ProductBean;

public class ProductSearchServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		ProductSearchDao productSearchDao=new ProductSearchDao();
		PrintWriter out = response.getWriter();
		
		ArrayList<ProductBean> l=productSearchDao.checkExist(request.getParameter("productNumber"), request.getParameter("productName"));
		System.out.println(request.getParameter("productNumber"));
		
		request.setAttribute("products", l);
		System.out.println(l.get(0).getInventory());
		request.getRequestDispatcher("product_search.jsp").forward(request, response);
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

}
