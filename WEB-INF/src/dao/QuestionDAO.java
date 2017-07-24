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
				System.out.println(123);
				String sql = "insert into question (title,content,correct_answer,kind,teacher_name) values(?,?,?,?,?);";

				PreparedStatement stmt = connection.prepareStatement(sql);

				stmt.setString(1,question.getTitle());
				stmt.setString(2,question.getContent());
				stmt.setString(3,question.getCorrect_answer());
				stmt.setString(4,question.getKind());
				stmt.setString(5,question.getTeacher_name());
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
