package beans;

public class Answer {

	private int id = 0;
	private String title = null; //int id = 0;//question_idみたいなもん
	private String user_id = null;//学籍番号
	private String student_name = null;//名前
	private String student_answer = null;//答案
	private String impression = null;//感想

	public Answer(){
	}
	public Answer(int id,String title,String user_id, String student_name, String student_answer,String impression ){
		this.id = id;
		this.title = title;
		this.user_id = user_id;
		this.student_name = student_name;
		this.student_answer = student_answer;
		this.impression = impression;
	}

	public int getId(){
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public String getStudent_answer() {
		return student_answer;
	}

	public String getImpression(){
		return impression;
	}

	public int setId(int id){
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void setStudent_answer(String student_answer) {
		this.student_answer = student_answer;
	}

	public void setImpression(String impression){
		this.impression = impression;
	}

}