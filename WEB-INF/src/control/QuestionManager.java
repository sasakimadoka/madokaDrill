package control;

import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.Calendar;

import beans.Question;
import dao.QuestionDAO;


public class QuestionManager {

	private Connection connection = null;

	public  QuestionManager(){
	}

	public void Regist(String teacher_name,String title,String kind,String content,String correct_answer){


		Question question = new Question();
		question.setTeacher_name(teacher_name);
		question.setTitle(title);
		question.setKind(kind);
		question.setContent(content);
		question.setCorrect_answer(correct_answer);
		System.out.println(title);

		QuestionDAO dao = new QuestionDAO();
		this.connection = dao.createConnection();

		dao.Regist(question, this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;
	}


		public Question Select(String title){

		QuestionDAO dao = new QuestionDAO();
		this.connection = dao.createConnection();

		dao.closeConnection(this.connection);

		Question question = dao.Select(title, this.connection);

		this.connection = null;

		return question;
	}
}


