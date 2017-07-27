package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Answer;
import control.GetAnswerManager;

public class SelectAnswerServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		String title=request.getParameter("title");

		GetAnswerManager manager=new GetAnswerManager();

		Answer answer=manager.Read(title);

		request.setAttribute("answer",answer);
		getServletContext().getRequestDispatcher("/jsp/reading.jsp").forward(request, response);
	}
}
