package testpac;

public class CourseDelivery {
private int id;
private int course_id;
private int professor_id;
private String timeSlot;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public int getProfessor_id() {
	return professor_id;
}
public void setProfessor_id(int professor_id) {
	this.professor_id = professor_id;
}
public String getTimeSlot() {
	return timeSlot;
}
public void setTimeSlot(String timeSlot) {
	this.timeSlot = timeSlot;
}
public CourseDelivery(int id, int course_id, int professor_id, String timeSlot) {
	super();
	this.id = id;
	this.course_id = course_id;
	this.professor_id = professor_id;
	this.timeSlot = timeSlot;
}
public CourseDelivery(int course_id, int professor_id, String timeSlot) {
	super();
	this.course_id = course_id;
	this.professor_id = professor_id;
	this.timeSlot = timeSlot;
}

public CourseDelivery() {
	
}

}
