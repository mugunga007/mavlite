package testpac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CourseDeliveryService {

	ConnectDb cd = new ConnectDb();
	CourseDelivery co = new CourseDelivery();
	
	
	 public boolean insert(int course_id, int professor_id,String timeSlot) {
		 boolean t = true;
	        String sql = "INSERT INTO courseDelivery(course_id,professor_id,timeSlot) VALUES(?,?,?)";
	 
	        try (Connection conn = cd.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, course_id);
	            pstmt.setInt(2, professor_id);
	            pstmt.setString(3, timeSlot);
	            pstmt.executeUpdate();
	            t = true;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            t= false;
	        }
	        return t;
	    }
	 
	 public CourseDelivery getCourseDeliveryByCourseId(int course_id) {
		 CourseDelivery cg = new CourseDelivery();
		 
		 String sql = "SELECT * FROM courseDelivery where course_id="+course_id;
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				
				if(rs.next()) {
					
					cg = new CourseDelivery(rs.getInt("id"),rs.getInt("course_id"),rs.getInt("professor_id"),rs.getString("timeSlot"));
				
				}
		

			}catch (Exception e) {
				// TODO: handle exception
			}
			return cg;
		 
	 }
	 
	 
	 
	 public List<CourseDelivery> getCourseDeliveryList(){
			List<CourseDelivery> list = new ArrayList<>();
			String sql = "SELECT id,course_id, professor_id, timeSlot FROM courseDelivery";
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				int i = 0;
				while(rs.next()) {
					
					co = new CourseDelivery(rs.getInt("id"),rs.getInt("course_id"),rs.getInt("professor_id"),rs.getString("timeSlot"));
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
