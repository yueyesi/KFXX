package Servlet;
/**
 * 用于注册用户的Servlet
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import DAO.UserADDDAO;

public class UserADDServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		UserADDDAO userADDDAO=new UserADDDAO();
		if(request.getParameter("UserLoginName")!=""&&request.getParameter("UserPassword")!=""&&request.getParameter("UserName")!=""&&request.getParameter("Sex")!=""&&request.getParameter("Phone")!=""){
			
	
			userADDDAO.addUser(request.getParameter("UserLoginName"),request.getParameter("UserPassword"),request.getParameter("UserName"),request.getParameter("Sex"),request.getParameter("Phone"));
		}
		response.sendRedirect("user_add.jsp");
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
