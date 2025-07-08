
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
	
	private static final String Url ="jdbc:mysql://localhost:3306/your_databse_name";
	private static final String User ="root";
	private static final String Password = "your password";
	
	// define a method to get connnection with database 
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(Url,User,Password);
	}

	public static void main(String[] args) {
		
	}

}
