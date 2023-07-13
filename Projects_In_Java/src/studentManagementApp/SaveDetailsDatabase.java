package studentManagementApp;
import java.sql.*;
public class SaveDetailsDatabase {
	static Connection con;
public static Connection connectToDb() {
//	step 1->load the driver.
	try {
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	step 2->create the connection.
	String user="root";
	String password="finally";
	String url="jdbc:mysql://localhost:3306/student_details";
	
	con=DriverManager.getConnection(url,user,password);
	
	}
	catch(Exception e) {
		e.printStackTrace();;
	}
	return con;

	
}
}
