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
	
	 public Connection connect() {
	        // SQLite connection string
	        String url = "jdbc:sqlite:/Users/shema/sqlite/uni.db";
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(url);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        return conn;
	    }
	 
	 public boolean insert(String firstname, String lastname, String faculty) {
		 boolean t = true;
	        String sql = "INSERT INTO student(firstname,lastname,faculty) VALUES(?,?,?)";
	 
	        try (Connection conn = this.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, firstname);
	            pstmt.setString(2, lastname);
	            pstmt.setString(3, faculty);
	            pstmt.executeUpdate();
	            t = true;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            t= false;
	        }
	        return t;
	    }
	
	 
	 
	 public List<Student> getAccountList(){
			List<Student> list = new ArrayList<>();
			String sql = "SELECT username, password FROM account";
			
			try(Connection conn = this.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				int i = 0;
				while(rs.next()) {
		//			a = new Student(rs.getString("username"),rs.getString("password"));
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
