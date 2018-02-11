package testpac;

public class Professor {
private int professor_id;
private String name;





public int getProfessor_id() {
	return professor_id;
}
public void setProfessor_id(int professor_id) {
	this.professor_id = professor_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



public Professor(int professor_id, String name) {
	super();
	this.professor_id = professor_id;
	this.name = name;
}



public Professor(String name) {
	super();
	this.name = name;
}



public Professor() {
	
}


}
