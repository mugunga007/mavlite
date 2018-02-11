package testpac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AttendanceService {

	ConnectDb cd = new ConnectDb();
	Attendance co = new Attendance();
	 public boolean insert(int course_id,int student_id) {
		 boolean t = true;
	        String sql = "INSERT INTO attendance(course_id,student_id) VALUES(?,?)";
	 
	        try (Connection conn = cd.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, course_id);
	            pstmt.setInt(2, student_id);
	          
	            pstmt.executeUpdate();
	            t = true;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            t= false;
	        }
	        return t;
	    }
	 
	 public Professor getProfessorById(int professor_id) {
		 Professor cg = new Professor();
		 
		 String sql = "SELECT * FROM professor where professor_id="+professor_id;
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				
				if(rs.next()) {
					
					cg = new Professor(rs.getInt("professor_id"),rs.getString("name"));
				
				}
		

			}catch (Exception e) {
				// TODO: handle exception
			}
			return cg;
		 
	 }
	 
	 
	 public List<Attendance> getStudentAttendance(int student_id){
			List<Attendance> list = new ArrayList<>();
			String sql = "SELECT course_id,student_id FROM attendance where student_id="+student_id;
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				int i = 0;
				while(rs.next()) {
					
					co = new Attendance(rs.getInt("course_id"),rs.getInt("student_id"));
					list.add(co);
				}
				i++;
				
			//list = session.createQuery("from AccessHandling").list();
			
			}catch (Exception e) {
				// TODO: handle exception
			}
			return list;
		}
	 

	
}
