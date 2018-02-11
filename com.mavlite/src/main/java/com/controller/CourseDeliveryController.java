package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import testpac.CourseDeliveryService;

/**
 * Servlet implementation class CourseDeliveryController
 */
public class CourseDeliveryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseDeliveryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		
	int cid = Integer.parseInt(request.getParameter("course_id"));
		int pid = Integer.parseInt(request.getParameter("professor_id").toString());
		String timeSlot = request.getParameter("timeSlot");
	
		CourseDeliveryService ss = new CourseDeliveryService();
		
		//PrintWriter p = response.getWriter();
		//p.print(pid);
		
	if(ss.insert(cid, pid,timeSlot)) {
	
		request.setAttribute("msg", "Added SuccessfullyS");
	request.getRequestDispatcher("CourseDelivery.jsp").forward(request, response);	
	}
		
	
		
	}

}
