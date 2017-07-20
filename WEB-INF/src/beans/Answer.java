package beans;

public class Answer {

	private int id = 0;
	private String user_id = null;
	private String student_name = null;
	private String answer = null;
	private String impression = null;
	private int question_id = 0;

	public Answer(){
	}
	public Answer(int id,String user_id, String student_name, String answer,String impression,int question_id) {
		this.id = id;
		this.user_id = user_id;
		this.student_name = student_name;
		this.answer = answer;
		this.impression = impression;
		this.question_id = question_id;
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

	public int getQuestion_id() {
		return question_id;
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

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

}