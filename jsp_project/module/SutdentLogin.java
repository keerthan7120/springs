package com.student.module;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SutdentLogin
 */
public class SutdentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Studentlogin studentlogin = new Studentlogin ();
    boolean login=false;
    public SutdentLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(login==true)
		{
			RequestDispatcher reqd=request.getRequestDispatcher("/index.jsp");
			reqd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{ 
			String uname =request.getParameter("uname");
			String password =request.getParameter("password");
			studentlogin.setUsername(uname);
			studentlogin.setPassword(password);
		    Class.forName("com.mysql.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdba:mysql://localhost:3306/Student_Managment","root","root");
	        String Query="Select * from student where uname=? and password=?";
	        PreparedStatement psmt =con.prepareStatement(Query);
	        ResultSet rs=psmt.executeQuery();
	     psmt.setString(1,uname);
	     psmt.setString(2,password);
	      while(rs.next())
	      {
	    	  String uname2=rs.getString(1);
	    	  String pass=rs.getString(2);
	    	   if(uname2.equals(studentlogin.getUsername()) && pass.equals(studentlogin.getPassword()) )
	    	   {
	    		   login=true;
	    	   }
	    	   else{
	   					RequestDispatcher reqd=request.getRequestDispatcher("index.jsp");
	   					reqd.include(request, response);
	   			
	    	   }
	      }
	      
	}catch(SQLException | ClassNotFoundException e)
		{
		 e.printStackTrace();
	}
	}

} 

