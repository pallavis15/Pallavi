package com.xworkz.Ganesha.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Toy {
	
	
	 
	@WebServlet(urlPatterns = "/toys" ,loadOnStartup = 2)
	public class ToyResource extends HttpServlet {
		public ToyResource() {
			System.out.println("Created ToyResouce.....");
			
		}
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running Service in ToyResource");
			String toyName=req.getParameter("name");
			String color=req.getParameter("color");
			String idealFor=req.getParameter("idealFor");
			String minAge=req.getParameter("minAge");
			String quantity=req.getParameter("quantity");
			System.out.println(toyName);
			System.out.println(color);
			System.out.println(idealFor);
			System.out.println(minAge);
			System.out.println(quantity);

		}

}
}
