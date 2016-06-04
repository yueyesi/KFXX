package Servlet;
/**
 * 用于查找员工信息的Servlet
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductSearchDao;
import DAO.UserSearchDao;
import Model.ProductBean;
import Model.UserBean;

public class UserSearchServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		UserSearchDao productSearchDao=new UserSearchDao();
		PrintWriter out = response.getWriter();
		
		ArrayList<UserBean> l=productSearchDao.checkExist(request.getParameter("userNumber"), request.getParameter("userName"));
	
		
		request.setAttribute("users", l);
		
		request.getRequestDispatcher("user_base_information.jsp").forward(request, response);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
