
package beans;

public class Question {

	private int id = 0;
	private String title = null;
	private String content = null;
	private String correct_answer = null;
	private String kind = null;
	private String teacher_name = null;

	public Question(){
	}
	public Question(int id,String title, String content, String correct_answer,String kind,String teacher_name) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.correct_answer = correct_answer;
		this.kind = kind;
		this.teacher_name = teacher_name;
	}


	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getCorrect_answer() {
		return correct_answer;
	}

	public String getKind(){
		return kind;
	}

	public String getTeacher_name() {
		return teacher_name;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

}
