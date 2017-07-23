package beans;

public class Answer {

	private int id = 0;//question_idみたいなもん
	private String user_id = null;//学籍番号
	private String student_name = null;//名前
	private String answer = null;//答案
	private String impression = null;//感想

	public Answer(){
	}
	public Answer(int id,String user_id, String student_name, String answer,String impression ){
		this.id = id;
		this.user_id = user_id;
		this.student_name = student_name;
		this.answer = answer;
		this.impression = impression;
	}


	public int getId() {
		return id;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public String getAnswer() {
		return answer;
	}

	public String getImpression(){
		return impression;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setImpression(String impression){
		this.impression = impression;
	}

}