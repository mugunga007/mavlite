package testpac;

import java.util.List;

public class Test {
public static void main(String[]args) {
	StudentService ss = new StudentService();
	CourseDeliveryService cs = new CourseDeliveryService();
	//ProfessorService p = new ProfessorService();
	
	AttendanceService cd = new AttendanceService();
	ProfessorService pcs = new ProfessorService();
	Professor ca = new Professor();
	Student stu = new Student();
	
	/*Attendance a = new Attendance();
	
List<Attendance> ali = cd.getStudentAttendance(1);

for(Attendance aa:ali)
	
	System.out.println(aa.getCourse_id());*/
	
	System.out.println(cs.getCourseDeliveryByCourseId(1).getCourse_id());
	
 
   
}
}
