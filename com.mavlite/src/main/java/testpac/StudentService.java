package testpac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

	Student a = new Student();
	ConnectDb cd = new ConnectDb();
	 
	 public boolean insert(String firstname, String lastname, String email, int professor_id) {
		 boolean t = true;
	        String sql = "INSERT INTO student(firstname,lastname,email,professor_id) VALUES(?,?,?,?)";
	 
	        try (Connection conn = cd.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, firstname);
	            pstmt.setString(2, lastname);
	            pstmt.setString(3, email);
	            pstmt.setInt(4, professor_id);
	            pstmt.executeUpdate();
	            t = true;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            t= false;
	        }
	        return t;
	    }
	 
	 public Student getStudentByEmail(String email) {
		 Student cg = new Student();
		 
		 String sql = "SELECT * FROM student where email='"+email+"'";
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				
				if(rs.next()) {
					
					cg = new Student(rs.getString("student_id"), rs.getString("firstname"),rs.getString("lastname"),rs.getString("email"),rs.getInt("professor_id"));
				
				}
		

			}catch (Exception e) {
				// TODO: handle exception
			}
			return cg;
		 
	 }
	 public Student getStudentById(int student_id) {
		 Student cg = new Student();
		 
		 String sql = "SELECT * FROM student where student_id="+student_id;
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				
				if(rs.next()) {
					
					cg = new Student(rs.getString("student_id"), rs.getString("firstname"),rs.getString("lastname"),rs.getString("email"),rs.getInt("professor_id"));
				
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
	
	 
	 
	 public List<Student> getStudentList(){
			List<Student> list = new ArrayList<>();
			String sql = "SELECT student_id, firstname,lastname, email,professor_id FROM student";
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				int i = 0;
				while(rs.next()) {
					a = new Student(rs.getString("student_id"), rs.getString("firstname"),rs.getString("lastname"),rs.getString("email"),rs.getInt("professor_id"));
					list.add(a);
				}
				i++;
				
			//list = session.createQuery("from AccessHandling").list();
			
			}catch (Exception e) {
				// TODO: handle exception
			}
			return list;
		}


}
