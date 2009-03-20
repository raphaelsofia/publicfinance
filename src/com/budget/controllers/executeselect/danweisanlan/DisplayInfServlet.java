package com.budget.controllers.executeselect.danweisanlan;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.budget.models.*;

public class DisplayInfServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		Kemuleixing kmlx=new Kemuleixing();
		ArrayList<Kemuleixing> allKmlx = kmlx.returnKmlxInf();
		
		Kemu km=new Kemu();
		ArrayList<Kemu> allKm = km.returnKmInf();
		
		Zhaiyao zy=new Zhaiyao();
		ArrayList<Zhaiyao> allZy = zy.returnZyInf();
		
		HttpSession session = request.getSession();
		
		session.setAttribute("allKmlxInf",allKmlx);
		session.setAttribute("allKmInf",allKm);
		session.setAttribute("allZyInf",allZy);
		
		response.sendRedirect("../../budget/executeselect/6-1.jsp");
	}
}