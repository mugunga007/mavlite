package testpac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;







public class AccountModel {
	String msg ="";
	Account a = new Account();
	 public String connecttest() {
	        Connection conn = null;
	        
	        try {
	            String url = "jdbc:sqlite:/Users/shema/sqlite/test.db";
	            conn = DriverManager.getConnection(url);
	            
	             msg = "Connection to SQLite has been established.";
	            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                System.out.println(ex.getMessage());
	            }
	        }
	        return msg;
	    }
	 
	 
	 public Connection connect() {
	        // SQLite connection string
	        String url = "jdbc:sqlite:/Users/shema/sqlite/account.db";
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(url);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        return conn;
	    }
	 
	 public boolean insert(String name, String password) {
		 boolean t = true;
	        String sql = "INSERT INTO account(username,password) VALUES(?,?)";
	 
	        try (Connection conn = this.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	            pstmt.setString(2, password);
	            pstmt.executeUpdate();
	            t = true;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            t= false;
	        }
	        return t;
	    }
	 
	 public void selectAll(){
		 String sql = "SELECT username, password FROM account";
	        
	        try (Connection conn = this.connect();
	             Statement stmt  = conn.createStatement();
	             ResultSet rs    = stmt.executeQuery(sql)){
	            
	            // loop through the result set
	            while (rs.next()) {
	                System.out.println(rs.getString("username") +  "\t" + 
	                                  
	                                   rs.getString("password"));
	                
	            }
	            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 
	 
	 public List<Account> getAccountList(){
			List<Account> list = new ArrayList<>();
			String sql = "SELECT username, password FROM account";
			
			try(Connection conn = this.connect();
		             Statement stmt  = conn.createStatement();
		             ResultSet rs    = stmt.executeQuery(sql)){
				int i = 0;
				while(rs.next()) {
					a = new Account(rs.getString("username"),rs.getString("password"));
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
