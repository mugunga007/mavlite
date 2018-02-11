package testpac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CourseService {

	ConnectDb cd = new ConnectDb();
	Course co = new Course();
	 public boolean insert(String name, String classroom,int credit) {
		 boolean t = true;
	        String sql = "INSERT INTO course(name,classroom,credits) VALUES(?,?,?)";
	 
	        try (Connection conn = cd.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	            pstmt.setString(2, classroom);
	            pstmt.setInt(3, credit);
	            pstmt.executeUpdate();
	            t = true;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            t= false;
	        }
	        return t;
	    }
	 
	 public Course getCourseById(int course_id) {
		 Course cg = new Course();
		 
		 String sql = "SELECT * FROM course where course_id="+course_id;
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				
				if(rs.next()) {
					
					cg = new Course(rs.getString("name"),rs.getInt("credits"),rs.getString("classroom"));
				
				}
		

			}catch (Exception e) {
				// TODO: handle exception
			}
			return cg;
		 
	 }
	 
	 public boolean update(String firstname, String lastname,String email,int student_id) {
		 boolean t = true;
	        String sql = "UPDATE `student` SET firstname='"+firstname +"', lastname='"+lastname+"', email='"+email+"' WHERE student_id="+student_id;
	 
	        try (Connection conn = cd.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, firstname);
	            pstmt.setString(2, lastname);
	            pstmt.setString(2, email);
	            pstmt.setInt(2, student_id);
	           
	            pstmt.executeUpdate();
	            t = true;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            t= false;
	        }
	        return t;
	    }
	
	 public boolean updateCourse(String name, String classroom,int credit, int course_id) {
		 boolean t = true;
	        String sql = "UPDATE `course` SET name='"+name +"', classroom='"+classroom+"', credits='"+credit+"' WHERE course_id="+course_id;
	 
	        try (Connection conn = cd.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	            pstmt.setString(2, classroom);
	            pstmt.setInt(2, credit);
	            pstmt.setInt(2, course_id);
	           
	            pstmt.executeUpdate();
	            t = true;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            t= false;
	        }
	        return t;
	    }
	 
	 
	 public List<Course> getCourseList(){
			List<Course> list = new ArrayList<>();
			String sql = "SELECT course_id,name, classroom,credits FROM course";
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				int i = 0;
				while(rs.next()) {
					
					co = new Course(rs.getInt("course_id"),rs.getString("name"),rs.getInt("credits"),rs.getString("classroom"));
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
