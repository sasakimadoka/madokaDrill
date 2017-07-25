package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utility.DriverAccessor;
import beans.Answer;

public class GetAnswerDAO extends DriverAccessor{

	public ArrayList<Answer> GetList(String user_id,Connection connection){

		try{
			String sql="select * from answer_table where user_id = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,user_id);
			ResultSet rs=stmt.executeQuery();

			ArrayList<Answer> list = new ArrayList<Answer>();

			//登録されている回答の分だけ繰り返す
			while(rs.next())
			{
				Answer answer = new Answer();
				answer.setId(rs.getInt("id"));
				answer.setTitle(rs.getString("title"));
				answer.setUser_id( rs.getString("User_id") );
				answer.setStudent_name( rs.getString("student_name") );
				answer.setStudent_answer( rs.getString("student_answer") );
				answer.setImpression( rs.getString("impression") );
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

