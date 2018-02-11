package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import testpac.CourseService;

/**
 * Servlet implementation class CourseController
 */
public class CourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseController() {
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
		doGet(request, response);
		
		//	StudentService ss = new StudentService();
	
		 int course_id = Integer.parseInt(request.getParameter("course_id"));
	
	
			String name = request.getParameter("name");
			int credits = Integer.parseInt(request.getParameter("credits"));
			String classroom = request.getParameter("classroom");
		
			CourseService ss = new CourseService();
			if(course_id==0) {
			if(ss.insert(name, classroom, credits)) {
		
			request.setAttribute("msg", "Successfully Added");
		request.getRequestDispatcher("Course.jsp").forward(request, response);	
		}
			}else {
				
				ss.updateCourse(name, classroom, credits, course_id);
				request.setAttribute("msg", "Successfully Edited");
				request.getRequestDispatcher("Course.jsp").forward(request, response);	
			}
		
	}

}
