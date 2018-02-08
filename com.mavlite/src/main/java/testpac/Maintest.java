package testpac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Maintest {

	public static void main(String[] args) {
      
      
		Account a = new Account();
		AccountModel am = new AccountModel();
		
		//System.out.println(a.connecttest());
		
		/*
		if(am.insert("mugabe", "robert"))
			System.out.println("ok");
		*/
		
		

/*
for(Account al: am.getAccountList())
	
	System.out.println(al.getUsername()+" "+al.getPassword());

   */
		StudentService ss = new StudentService();
	      Student s = new Student("shema","landry","iot");
	if(ss.insert("shema","landry","iot"))
	System.out.println("OK");
	else
		System.out.println("NO");
	 
	}
	
}
