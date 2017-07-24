package control;

import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.Calendar;

import beans.Answer;
import dao.AnswerDAO;


public class AnswerManager {

	private Connection connection = null;

	public  AnswerManager(){
	}
	//manager.Regist(title,student_name,user_id,content,answer);
	public void Regist(String title,String student_name,String user_id,String student_answer,String impression){


		Answer answer = new Answer();

		answer.setTitle(title);
		answer.setStudent_name(student_name);
		answer.setUser_id(user_id);
		answer.setStudent_answer(student_answer);
		answer.setImpression(impression);
		System.out.println(title);

		AnswerDAO dao = new AnswerDAO();
		this.connection = dao.createConnection();

		dao.Regist(answer, this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;
	}


		public Answer Select(String title){

		AnswerDAO dao = new AnswerDAO();
		this.connection = dao.createConnection();

		dao.closeConnection(this.connection);

		Answer answer = dao.Select(title, this.connection);

		this.connection = null;

		return answer;
	}
}


