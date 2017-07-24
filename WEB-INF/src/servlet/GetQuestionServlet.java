package servlet;
	import java.io.IOException;
	import java.util.ArrayList;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import beans.Question;
	import control.GetQuestionManager;

	public class GetQuestionServlet extends HttpServlet{

		public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException{
			doPost(request,response);
		}

		public void doPost(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException{

			request.setCharacterEncoding("UTF-8");

			HttpSession session = request.getSession();
			Question question = (Question)session.getAttribute("question");
			String title = question.getTitle();

			GetQuestionManager manager=new GetQuestionManager();

			//先生が登録した全ての問題をlistに渡す
			ArrayList list = manager.GetList(title);

			//取得したlistをquestion_listと名付けjspに受け渡せる形にする
			request.setAttribute("question-list",list);
			getServletContext().getRequestDispatcher("/jsp/student.jsp").forward(request, response);
		}
	}
