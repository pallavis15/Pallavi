package com.xworkz.dto.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/AttachAddress",loadOnStartup=1)

public class Adress extends HttpServlet {


	
	public Adress() {
		System.out.println("Address Object is Created");
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String no=req.getParameter("number");
		String state=req.getParameter("state");
		String street=req.getParameter("street");
		String city=req.getParameter("city");
		req.setAttribute("no", no);
		req.setAttribute("state", state);
		req.setAttribute("street", street);
		req.setAttribute("city", city);
		
		RequestDispatcher dispatcher1 = req.getRequestDispatcher("Adress.jsp");
		dispatcher1.forward(req,resp);
		}
	}


