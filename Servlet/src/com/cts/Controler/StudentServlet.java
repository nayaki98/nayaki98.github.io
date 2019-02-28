package com.cts.Controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.Bean.Student;
import com.cts.Service.StudentService;
import com.cts.Service.StudentServiceImpl;


@WebServlet("/link")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentService ser=new StudentServiceImpl();

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int eno=Integer.parseInt(request.getParameter("rno"));
		String name=request.getParameter("name");
		String dept=request.getParameter("dept");
		String gender=request.getParameter("gender");
		boolean res=ser.insert(new Student(eno,name,dept,gender));
		//if(res==true)
			//pw.println("<h1>Success</h1>");
		//else
			//pw.println("<h1>UnSuccess</h1>");
		if(res==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Index.html");
		}
	}

}
