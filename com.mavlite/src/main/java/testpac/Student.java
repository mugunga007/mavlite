package testpac;

public class Student {

	private String firstname;
	private String lastname;
	private String faculty;
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
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public Student(String firstname, String lastname, String faculty) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.faculty = faculty;
	}
	
	
	public Student() {
		
	}
	
}
