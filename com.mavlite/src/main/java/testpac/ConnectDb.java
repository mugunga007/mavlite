package testpac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {

	 public Connection connect() {
	        // SQLite connection string
	        String url = "jdbc:sqlite:/Users/shema/sqlite/course.db";
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(url);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        return conn;
	        
	 }
	
}
