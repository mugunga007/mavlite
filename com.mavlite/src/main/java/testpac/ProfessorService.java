package testpac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProfessorService {

	ConnectDb cd = new ConnectDb();
	Professor co = new Professor();
	 public boolean insert(String name) {
		 boolean t = true;
	        String sql = "INSERT INTO professor(name) VALUES(?)";
	 
	        try (Connection conn = cd.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	          
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
	 
	 
	 public List<Professor> getProfessorList(){
			List<Professor> list = new ArrayList<>();
			String sql = "SELECT professor_id,name FROM professor";
			
			try(Connection conn = cd.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				int i = 0;
				while(rs.next()) {
					
					co = new Professor(rs.getInt("professor_id"),rs.getString("name"));
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
