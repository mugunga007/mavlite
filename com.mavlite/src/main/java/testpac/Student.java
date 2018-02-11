package testpac;

public class Student {

	private String student_id;
	private String firstname;
	private String lastname;
	private String email;
	private int professor_id;
	
	public int getProfessor_id() {
		return professor_id;
	}
	public void setProfessor_id(int professor_id) {
		this.professor_id = professor_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	
	
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	public Student(String firstname, String lastname, String email, int professor_id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.professor_id = professor_id;
	}
	public Student(String student_id, String firstname, String lastname, String email, int professor_id) {
		super();
		this.student_id = student_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.professor_id = professor_id;
	}
	public Student() {
		
	}

	
}
