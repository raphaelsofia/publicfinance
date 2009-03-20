package com.budget.controllers.executeselect.danweisanlan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.budget.models.Zbtz;


public class SelectInfServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Zbtz> zbtz = new Zbtz().getAll();
		HttpSession session = request.getSession();
		session.setAttribute("zbtz", zbtz);
		response.sendRedirect("../../budget/executeselect/zxzxx.jsp");
		
		
	}

}
