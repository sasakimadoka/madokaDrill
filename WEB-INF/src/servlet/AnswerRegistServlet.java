package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Answer;
import control.AnswerManager;

public class AnswerRegistServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		//文字コードの設定
		request.setCharacterEncoding("UTF-8");

		//getParameterの引数はjspのnameの中身と同じ
		String title =request.getParameter("title");
		String student_name=request.getParameter("student_name");
		String user_id = request.getParameter("user_id");
		String student_answer = request.getParameter("student_answer");
		String impression = request.getParameter("impression");

		//保持されているユーザー情報を取得する
		//HttpSession session = request.getSession();
		//Question question = (question)session.getAttribute("title");
		//String title = .getTitle();

		AnswerManager manager=new AnswerManager();

		//AnswerManagerのRegistメソッドへ
		manager.Regist(title,student_name,user_id,student_answer,impression);

		response.sendRedirect(response.encodeRedirectURL("./check.jsp"));
	}
}
