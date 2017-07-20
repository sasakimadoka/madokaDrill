package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utility.DriverAccessor;
import beans.Answer;

public class GetAnswerDAO extends DriverAccessor{

	public ArrayList GetList(int id,Connection connection){

		try{
			String sql="select * from answer_table where id = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1,id);
			ResultSet rs=stmt.executeQuery();

			ArrayList list = new ArrayList();

			//登録されている回答の分だけ繰り返す
			while(rs.next())
			{
				Answer answer = new Answer();
				answer.setUser_id( rs.getString("User_id") );
				answer.setStudent_name( rs.getString("student_name") );
				answer.setAnswer( rs.getString("answer") );
				answer.setImpression( rs.getString("impression") );
				answer.setQuestion_id( rs.getInt("question_id") );
				list.add(answer);
			}

			stmt.close();
			rs.close();

			return list;

		}catch(SQLException e){

			e.printStackTrace();

			return null;

		}finally{
		}
	}
}

