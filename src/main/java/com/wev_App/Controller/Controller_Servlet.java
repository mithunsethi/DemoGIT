package com.wev_App.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.wev_App.model.Model_Class;

@WebServlet("/controller")
public class Controller_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller_Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		Model_Class m = new Model_Class();
		int add = m.addNumber(num1, num2);
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("adding", add);
		

		RequestDispatcher rd = request.getRequestDispatcher("mvc.jsp");
		rd.forward(request, response);

	}

}
