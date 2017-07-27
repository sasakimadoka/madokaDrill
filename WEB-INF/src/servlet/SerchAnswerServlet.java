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
import control.GetQuestionManager;

public class SerchAnswerServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		String user_id = (String)request.getParameter("user_id");
		System.out.println(user_id);
		//user_idが登録した全ての日記をlistに渡す
		GetAnswerManager manager=new GetAnswerManager();

		ArrayList list = manager.GetList(user_id);

		//取得したlistをanswer_listと名付けjspに受け渡せる形にする
		request.setAttribute("answer-list",list);
		getServletContext().getRequestDispatcher("/jsp/select.jsp").forward(request, response);

	}
}
