package car_Showroom;
import java.sql.*;
public class ConnectionToDb {
	static Connection con;
	public static Connection dbConnection() {
  String url="jdbc:mysql://localhost:3306/showroom_management";
  String user="root";
  String password="finally";
  try {
   con=DriverManager.getConnection(url,user,password);
  }
  catch(Exception e) {
	  e.printStackTrace();
  }
  return con;
	}
}
