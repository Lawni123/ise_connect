package com.iseConnect.login;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;





@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("email");
		String pass = request.getParameter("password");
		
//		if(uname==""||pass=="") {
//			out.print("<script>" +
//		            "alert('Username Or Password Cannot be Empty!');" +
//		            "window.location.href = 'Login.jsp';" + 
//		            "</script>");
//		}
		
		LoginDAO obj = new LoginDAO();
		
		
		HttpSession session = request.getSession();
		if( obj.check(uname, pass)) {
//			RequestDispatcher rd = request.getRequestDispatcher("Index2.jsp");
//			rd.forward(request, response);
			response.getWriter().print("Welcome");
		}else {
			out.print("<script>" +
		            "alert('Authentication Failed!');" +
		            "window.location.href = 'Login.jsp';" + 
		            "</script>");
		}
	}

}