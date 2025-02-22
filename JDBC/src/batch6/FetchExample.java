package batch6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class FetchExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        Properties p = new Properties();
	        p.setProperty("user", "root");
	        p.setProperty("password", "pranav123");
	        p.setProperty("useSSL", "false");
	        
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch6", p);
	        Statement st = con.createStatement();
	        
	        st.executeUpdate("insert into emp values(101,'Ram',45)");
	        
	        int result = st.executeUpdate("delete from emp where age=100000");
	        
	        System.out.println(result+" record affected!");
		
	}

}
