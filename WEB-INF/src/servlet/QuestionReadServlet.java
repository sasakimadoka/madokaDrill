package servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Question;
import control.GetQuestionManager;

public class QuestionReadServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		String title=request.getParameter("title");

		GetQuestionManager manager=new GetQuestionManager();

		Question question=manager.Select(title);

		request.setAttribute("question",question);
		getServletContext().getRequestDispatcher("/jsp/answer.jsp").forward(request, response);
	}
}
