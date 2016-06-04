package Servlet;
/*
 * ���ڵ�¼Servlet
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoginDao;
import Model.AdministratorBean;
import Model.UserBean;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		LoginDao loginDao=new LoginDao();
		PrintWriter out = response.getWriter();
		UserBean l=loginDao.checkLogin(request.getParameter("name"), request.getParameter("password"));
		AdministratorBean l2=loginDao.checkLogin2(request.getParameter("name"), request.getParameter("password"));
		String xcount=request.getParameter("select1");
		if(request.getParameter("name").equals("")||request.getParameter("password").equals("")){
			out.println("<script>alert('����д����������Ϣ')</script>");
			out.close();
		}
		if(xcount.equals("1")){
			if(l2!=null){
				HttpSession session=request.getSession();
				System.out.println("sfssdf");
				session.setAttribute("login", l2);
				response.sendRedirect("frame_main2.html");
			}
			else{
				out.println("<script>alert('�û������������������')</script>");
				out.close();
			}
			
		}
		else if(xcount.equals("2")){
			if(l!=null){
				HttpSession session=request.getSession();
				System.out.println("sfssdf");
				session.setAttribute("login", l);
				response.sendRedirect("frame_main1.html");
			}
			else{
				out.println("<script>alert('�û������������������')</script>");
				out.close();
			}
		}
		
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}
}
