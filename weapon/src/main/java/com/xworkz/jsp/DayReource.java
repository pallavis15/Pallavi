package com.xworkz.jsp;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Pallavi",loadOnStartup =1)

public class DayReource extends HttpServlet {
	public DayReource()
	{
		
	System.out.print("daysReource details");
	
	}
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		String date = req.getParameter("date");
		String month = req.getParameter("month");
		String year = req.getParameter("year");
		String day = req.getParameter("day");
		
		req.setAttribute("date", date);
		req.setAttribute("month", month);
		req.setAttribute("date", year);
		req.setAttribute("day", day);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("dayDisplay.jsp");
		dispatcher.forward(req, resp);
	}
	

}
