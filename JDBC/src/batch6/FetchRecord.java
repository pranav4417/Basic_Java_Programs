package batch6;
import java.sql.*;
import java.util.Properties;

public class FetchRecord {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Properties p = new Properties();
        p.setProperty("user", "root");
        p.setProperty("password", "pranav123");
        p.setProperty("useSSL", "false");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch6", p);
        Statement st = con.createStatement();
        String query = "SELECT * FROM student";
        
        ResultSet rs = st.executeQuery(query);
        while(rs.next())	{
        	System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        rs.close();
        st.close();
        con.close();
    }
}
