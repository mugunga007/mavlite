package testpac;



//@DatabaseTable(tableName = "accounts")
public class Account {

	
	
	//    @DatabaseField(id = true)
	    private String username;
	    
	//    @DatabaseField(canBeNull = false)
	    private String password;

		public String getUsername() {
			return username;
		}

		public void setUserame(String usernname) {
			this.username = username;
		}
 
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Account(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
	    
	     
	public Account() {
		
	}
	
}
