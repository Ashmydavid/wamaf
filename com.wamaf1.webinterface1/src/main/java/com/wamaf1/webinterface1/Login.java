package com.wamaf1.webinterface1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		GetterAndSetter objgetset= new GetterAndSetter();
		boolean status;
		String varUserName=request.getParameter("username");
		String varPassword=request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("username", varUserName);
		
		//setting the username value to getterSetter methods to authenticate from DBManager.check user function.
		
		objgetset.setUserName(varUserName);
		objgetset.setPassWrod(varPassword);
		status= DBManager.checklogin(objgetset);
		
		if(status==true){
			

						
			request.getRequestDispatcher("/Homepage.jsp").forward(request, response);	
			
		}else{
			
			request.getRequestDispatcher("/Loginpage.jsp").forward(request, response);
			
		}
		
		
		
	}

}
