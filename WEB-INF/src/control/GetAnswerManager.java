package control;

import java.sql.Connection;
import java.util.ArrayList;

import dao.GetAnswerDAO;

public class GetAnswerManager {

	private Connection connection = null;

	public GetAnswerManager() {
	}
	public ArrayList GetList(String user_id) {

		GetAnswerDAO dao = new GetAnswerDAO();

		this.connection = dao.createConnection();
		//System.out.println(user_id.get(0));
		ArrayList list = dao.GetList(user_id,this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;

		return list;
	}
}

