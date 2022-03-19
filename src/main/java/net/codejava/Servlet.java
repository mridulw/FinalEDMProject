package net.codejava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
       
    public Servlet() {
        super();
       
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String customerName=request.getParameter("customerName");
		String address=request.getParameter("address");
		String title=request.getParameter("title");
		String quantity=request.getParameter("quantity");
		
    } 
}
