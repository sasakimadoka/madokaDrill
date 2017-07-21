package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Question;
import control.QuestionManager;

public class QuestionRegistServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		//文字コードの設定
		request.setCharacterEncoding("UTF-8");

		//getParameterの引数はjspのnameの中身と同じ
		String teacher_name=request.getParameter("teacher_name");
		String title=request.getParameter("title");
		String kind=request.getParameter("kind");
		String content =request.getParameter("content");
		String correct_answer = request.getParameter("correct_answer");

		//保持されているユーザー情報を取得する
		//HttpSession session = request.getSession();
		//Question question = (question)session.getAttribute("title");
		//String title = .getTitle();

		QuestionManager manager=new QuestionManager();

		//QuestionManagerのRegistメソッドへ
		manager.Regist(teacher_name,title,kind,content,correct_answer);

		response.sendRedirect(response.encodeRedirectURL("./top.jsp"));
	}
}
