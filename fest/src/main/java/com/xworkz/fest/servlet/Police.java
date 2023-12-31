package com.xworkz.fest.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pallavi", loadOnStartup = 1)

public class Police extends HttpServlet {

	public Police() {

		System.out.println("Created Police Servlet..");
	}
	
		

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String station = req.getParameter("Station_name");
			String location = req.getParameter("location");
			String inspector = req.getParameter("inspector_name");
			String head_Constable = req.getParameter("Head_constable");
			String cases = req.getParameter("case");
			String cell = req.getParameter("cells");
			String positive = req.getParameter("positive");
			String negative = req.getParameter("negative");

			System.out.println("Station_name:" + station);
			System.out.println("location:" + location);
			System.out.println("inspector_name:" + inspector);
			System.out.println("Head_constable:" + head_Constable);
			System.out.println("case:" + cases);
			System.out.println("cells:" + cell);
			System.out.println("positive:" + positive);
			System.out.println("negative:" + negative);
	        
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			writer.print("<!doctype html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"utf-8\">\r\n"
					+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
					+ "<title>police</title>\r\n"
					+ "<link\r\n"
					+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n"
					+ "	rel=\"stylesheet\"\r\n"
					+ "	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n"
					+ "	crossorigin=\"anonymous\">\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\r\n"
					+ "		<div class=\"container-fluid\">\r\n"
					+ "			<a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
					+ "			<button class=\"navbar-toggler\" type=\"button\"\r\n"
					+ "				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n"
					+ "				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n"
					+ "				aria-label=\"Toggle navigation\">\r\n"
					+ "				<span class=\"navbar-toggler-icon\"></span>\r\n"
					+ "			</button>\r\n"
					+ "			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
					+ "				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
					+ "					<li class=\"nav-item\"><a href=\"index.html\">Home</a><br><br>"
					+ "<a href=\\\"police.html\\\">Police</a></li>\r\n"
					+ "				</ul>\r\n"
					+ "			</div>\r\n"
					+ "		</div>\r\n"
					
					+ "	</nav>"
					
					+ "</body>\r\n"
					+ "</html>"
					);
			
			writer.println("\n<br>Station_name:" + station);
			writer.println("\n<br>location:" + location);
			writer.println("\n<br>inspector_name:" + inspector);
			writer.println("\n<br>Head_constable:" + head_Constable);
			writer.println("\n<br>case:" + cases);
			writer.println("\n<br>cells:" + cell);
			writer.println("\n<br>positive:" + positive);
			writer.println("\n<br>negative:" + negative);
			
		}

	}



