package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utility.DriverAccessor;
import beans.Question;


public class GetQuestionDAO extends DriverAccessor {

	public ArrayList GetList(String title,Connection connection){

		try{
			String sql="select * from question_table where title = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,title);
			ResultSet rs=stmt.executeQuery();

			ArrayList list = new ArrayList();

			//登録されている問題の数だけ繰り返す
			while(rs.next())
			{
				Question question = new Question();
				question.setId(rs.getInt("id"));
				question.setTitle( rs.getString("title") );
				question.setKind( rs.getString("kind") );
				question.setContent( rs.getString("content") );
				question.setCorrect_answer(rs.getString("correct_answer"));
				question.setTeacher_name(rs.getString("teacher_name"));
				list.add(question);
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