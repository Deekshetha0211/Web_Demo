package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    String msg;
    public void init() {
    	msg = "From Deeks";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		String passWord = request.getParameter("pwd");
		String a = "Deeks";
		String b = "jv123";
		
		if (passWord.equals(b) && (userName.equals(a)))
		{
			System.out.println("You have entered correct credentials");
			request.setAttribute("test",userName);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("Invalid Enty");
			request.setAttribute("test",userName);
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		//RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		//rd.forward(request, response);
		
//		out.print("<html><body>");
//		out.print("<h1>Hello "+msg+ ">>From Servlet!</h1>");
//		out.print("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
