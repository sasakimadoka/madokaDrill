package control;

import java.sql.Connection;
import java.util.ArrayList;

import beans.Question;
import dao.GetQuestionDAO;

public class GetQuestionManager {

	private Connection connection = null;

	public GetQuestionManager() {
	}
	public ArrayList GetList() {

		GetQuestionDAO dao = new GetQuestionDAO();

		this.connection = dao.createConnection();
		//System.out.println(title.get(0));
		ArrayList list = dao.GetList(this.connection);


		dao.closeConnection(this.connection);

		this.connection = null;

		return list;
	}
	public Question Select(String title){

		GetQuestionDAO dao = new GetQuestionDAO();
		this.connection = dao.createConnection();

		Question question = dao.Select(title, this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;

		return question;
	}


}

