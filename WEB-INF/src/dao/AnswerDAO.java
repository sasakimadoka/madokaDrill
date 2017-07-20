package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utility.DriverAccessor;
import beans.Answer;


public class AnswerDAO extends DriverAccessor{

	public void Regist(Answer answer,Connection connection){

		try{
			String sql = "insert into answer(user_id,student_name,answer,impression,question_id) values(?,?,?,?,?)";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1,answer.getUser_id());
			stmt.setString(2,answer.getStudent_name());
			stmt.setString(3,answer.getAnswer());
			stmt.setString(4,answer.getImpression());
			stmt.setInt(5,answer.getQuestion_id());
			stmt.executeUpdate();

			stmt.close();

		}catch(SQLException e){

			e.printStackTrace();

		} finally {
		}
	}
	//public Answer<-ここが戻りの型return でAnswerが帰ってくる。
	public Answer Select(String Id,Connection connection){

		try{
			String sql="select * from answer where id = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(Id));
			ResultSet rs=stmt.executeQuery();

			rs.first();

			Answer answer = new Answer();
				//rs.getInt テーブルのカラム名を指定してint型で値をとる
				//rs.getStringならString型で値をとり、answerに入れてる。
			answer.setId( rs.getInt("id"));
			answer.setUser_id( rs.getString("user_id") );
			answer.setStudent_name( rs.getString("student_name") );
			answer.setAnswer( rs.getString("answer") );
			answer.setImpression(rs.getString("impression"));
			answer.setQuestion_id(rs.getInt("question_id"));

			stmt.close();
			rs.close();

			return answer;

		}catch(SQLException e){

			e.printStackTrace();

			return null;

		}finally{
		}
	}
}