
import java.sql.*;
import java.util.*;

public class JDBC_PRACTICE_PROBLEM1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String  url = "jdbc:mysql://localhost:3306/grocerry";
		String user = "root";
		String password = "lomtehrushikesh@123";
		
		try {
			
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,password);
            Statement stmt = con.createStatement();
            
            String insertQuery ="INSERT INTO products(product_id,product_name,product_price,availability) VALUES(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(insertQuery);
            System.out.println("enter the number of products to insert");
            int count= sc.nextInt();
            sc.nextLine();
            
            for(int i=1;i<=count;i++) {
            	System.out.println("enter details for product"+i);
            	
            	System.out.print("product id :");
            	int id = sc.nextInt();
            	sc.nextLine();
            	
            	System.out.print("product name :");
            	String name = sc.nextLine();
            	
            	System.out.println("product price");
            	int price = sc.nextInt();
            	sc.nextLine();
            	
            	System.out.println("Availability(Available/not Available)");
            	String availability = sc.nextLine();
            	
                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setInt(3, price);
                pstmt.setString(4, availability);
                pstmt.executeUpdate();
                
                
            
            }
            System.out.println("All products inserted succesfully!!");
            pstmt.close();
            stmt.close();
            con.close();
            sc.close();
		    
		
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		

	}

}
 
    

