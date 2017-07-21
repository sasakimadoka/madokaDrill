package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Question;
import utility.DriverAccessor;

public class QuestionDAO extends DriverAccessor{

		public void Regist(Question question,Connection connection){

			try{
				String sql = "insert into answer(teacher_name,title,kind,content,correct_answer) values(?,?,?,?,?)";

				PreparedStatement stmt = connection.prepareStatement(sql);

				stmt.setString(1,question.getTeacher_name());
				stmt.setString(2,question.getTitle());
				stmt.setString(3,question.getKind());
				stmt.setString(4,question.getContent());
				stmt.setString(5,question.getCorrect_answer());
				stmt.executeUpdate();

				stmt.close();

			}catch(SQLException e){

				e.printStackTrace();

			} finally {
			}
		}
		//public Question<-ここが戻りの型return でQuestionが帰ってくる。
		public Question Select(String title,Connection connection){

			try{
				String sql="select * from answer where title = ?";

				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setInt(1, Integer.parseInt(title));
				ResultSet rs=stmt.executeQuery();

				rs.first();

				Question question = new Question();
					//rs.getInt テーブルのカラム名を指定してint型で値をとる
					//rs.getStringならString型で値をとり、answerに入れてる。
				question.setTeacher_name( rs.getString("teacher_name"));
				question.setTitle( rs.getString("title") );
				question.setKind( rs.getString("kind") );
				question.setContent( rs.getString("content") );
				question.setCorrect_answer(rs.getString("correct_answer"));

				stmt.close();
				rs.close();

				return question;

			}catch(SQLException e){

				e.printStackTrace();

				return null;

			}finally{
			}
		}

}
