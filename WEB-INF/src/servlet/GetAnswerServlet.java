package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Answer;
import control.GetAnswerManager;

public class GetAnswerServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
	 	Answer answer = (Answer)session.getAttribute("answer");
		String user_id = answer.getUser_id();

		GetAnswerManager manager=new GetAnswerManager();

		//user_idが登録した全ての日記をlistに渡す
		ArrayList list = manager.GetList(user_id);

		//取得したlistをdiary_listと名付けjspに受け渡せる形にする
		request.setAttribute("answer-list",list);
		getServletContext().getRequestDispatcher("/jsp/serch.jsp").forward(request, response);

	}
}
