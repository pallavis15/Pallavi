package com.xworkz.dto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/fill", loadOnStartup = 3)

public class CredentialServlet extends HttpServlet {
	

	public CredentialServlet() {
		System.out.println("CredentialyServlet running successfully");
	}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name = req.getParameter("name");
			String password = req.getParameter("password");

//			req.setAttribute("name", name);
			CredentialsDTO credentialsDTO = new CredentialsDTO(name, password);

			
			if (name.equals("admin") && password.equals("secret")) {
				req.setAttribute("info", credentialsDTO);
				RequestDispatcher dispatcher = req.getRequestDispatcher("Success.jsp");

				dispatcher.forward(req, resp);
			} else {
				req.setAttribute("error", "Credentials are not matching...");
				RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
				dispatcher.forward(req, resp);
			}

		}

	}


