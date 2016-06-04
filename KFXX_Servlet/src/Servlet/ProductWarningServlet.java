package Servlet;
/**
 * 用于库存预警的Servlet
 */
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
/**
 * 用于商品预警的Servlet
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import DAO.ProductSearchDao;
import Model.ProductBean;

public class ProductWarningServlet extends HttpServlet {
	private ArrayList<ProductBean> products1;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		ProductSearchDao productSearchDao=new ProductSearchDao();
		products1=productSearchDao.ProductWarn();
		request.setAttribute("products", products1);
		System.out.println(products1.get(0).getProductName());
		
		request.getRequestDispatcher("product_warning.jsp").forward(request, response);
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
