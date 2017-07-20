package servlet;//まだいじってないです。

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import control.DiaryManager;

public class QuestionRegistServlet extends HttpServlet{


	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		//getParameterの引数はjspのnameの中身と同じ
		String question_title=request.getParameter("title");
		String question_cpntent=request.getParameter("conent");

		//保持されているユーザー情報を取得する
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		int user_id = user.getUser_id();

		DiaryManager manager=new DiaryManager();

		//DiaryManagerのRegistメソッドへ
		manager.Regist(question_title,question_content,user_id);

		response.sendRedirect(response.encodeRedirectURL("./top.jsp"));
	}
}
