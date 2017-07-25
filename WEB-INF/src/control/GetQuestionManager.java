package control;

import java.sql.Connection;
import java.util.ArrayList;

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
}

