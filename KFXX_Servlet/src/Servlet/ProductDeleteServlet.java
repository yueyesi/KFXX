package Servlet;
/**
 * 用于商品删除的Servlet
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductDeleteDao;

public class ProductDeleteServlet extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("utf-8");
			ProductDeleteDao productDeleteDao=new ProductDeleteDao();
			PrintWriter out = response.getWriter();
			if(request.getParameter("number")==""){
				
			}
			else{
				out.println("<script>alert('删除成功')</script>");
				
				productDeleteDao.deleteProduct(request.getParameter("number"));
				
			}
			request.getRequestDispatcher("product_delete.jsp").forward(request, response);
			out.close();
			
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		}
}
