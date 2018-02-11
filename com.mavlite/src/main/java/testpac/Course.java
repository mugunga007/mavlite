package testpac;

public class Course {
	
private int course_id;
private String name="";
private int credit;
private String classroom="";


private String action="Register";



public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}


public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public int getCredit() {
	return credit;
}
public void setCredit(int credit) {
	this.credit = credit;
}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getClassroom() {
	return classroom;
}
public void setClassroom(String classroom) {
	this.classroom = classroom;
}
public Course(int course_id, String name, int credit, String classroom) {
	
	this.course_id = course_id;
	this.name = name;
	this.credit = credit;
	this.classroom = classroom;
}
public Course(String name, int credit, String classroom) {

	this.name = name;
	this.credit = credit;
	this.classroom = classroom;
}
public Course() {
	
}
}
