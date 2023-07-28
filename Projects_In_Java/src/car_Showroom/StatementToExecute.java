package car_Showroom;
import java.sql.*;

import com.mysql.cj.xdevapi.PreparableStatement;
public class StatementToExecute {

//	 Insert into showroom method.
public static void insertIntoShowroom(Showroom s) {
	try {
		Connection con= ConnectionToDb.dbConnection();
		String query="INSERT INTO showroom VALUES(?,?,?,?,?)";
		PreparedStatement statement=con.prepareStatement(query);
		statement.setString(1, s.getShowroom_name());
		statement.setInt(2, s.getNo_of_emplyoee());
		statement.setString(3, s.getManager_name());
		statement.setString(4, s.getAddress());
		statement.setInt(5, s.getCars_in_stock());
		statement.executeUpdate();
		System.out.println("===============Showroom details added successfully============");}
	catch(Exception e) {
		e.printStackTrace();
		}
}
	
// Insert into employees
	public static void insertIntoEmplyoee(Emplyoee emp) {
		try {
			Connection con= ConnectionToDb.dbConnection();
			String query="INSERT INTO emplyoees VALUES(?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(query);
			statement.setString(1, emp.getEmp_id());
			statement.setString(2,emp.getEmp_name() );
			statement.setInt(3,emp.getEmp_age() );
			statement.setString(4,emp.getEmp_department() );
			statement.setString(5, emp.getShowroom_name());
			statement.executeUpdate();
			System.out.println("==============Employee details added successfully============");}
		catch(Exception e) {
			e.printStackTrace();}
	}
	
//insert into car.	
	public static void insertIntocar(Cars car) {
		try {
			Connection con= ConnectionToDb.dbConnection();
			String query="INSERT INTO cars VALUES(?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(query);
			statement.setString(1,car.getCar_name() );
			statement.setString(2,car.getCar_color() );
			statement.setString(3,car.getCar_fuel_type() );
			statement.setInt(4,car.getCar_price() );
			statement.setString(5,car.getCar_type() );
			statement.setString(6,car.getCar_transmission() );
			
			statement.executeUpdate();
			System.out.println("=============Car details added successfully=============");}
		catch(Exception e) {
			e.printStackTrace();}
	}
	
	
//	Read from showroom.
	public static void getAllShowroom(){
		try {
		Connection con=ConnectionToDb.dbConnection();
		Statement stm=con.createStatement();
		ResultSet set=stm.executeQuery(QueriesForDb.readAllShowroom);
		while(set.next()) {
		String name=set.getString(1);
		int totalEmp=set.getInt(2);
		String Managername=set.getString(3);
		String address=set.getString(4);
		String car=set.getString(5);
		
		
			System.out.println("Showroom Name : "+ name);
			System.out.println("Total Emplyoee : "+ totalEmp);
			System.out.println("Manager Name : "+ Managername);
			System.out.println("Address : "+ address);
			System.out.println("Total Car : "+ car);
			System.out.println("=============================");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	 Read from employee
	public static void getAllEmployee(){
		try {
		Connection con=ConnectionToDb.dbConnection();
		Statement stm=con.createStatement();
		ResultSet set=stm.executeQuery(QueriesForDb.readAllEmplyoee);
		while(set.next()) {
			String id=set.getString(1);
			String name=set.getString(2);
			int age=set.getInt(3);
			String department=set.getString(4);
			String showroom=set.getString(5);
			System.out.println("Employee Id : "+ id);
			System.out.println("Name : "+ name);
			System.out.println("Age : "+ age);
			System.out.println("Department : "+ department);
			System.out.println("Showroom : "+ showroom);
			System.out.println("===========================");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
		
// Read all car
	public static void getAllCars(){

		try {
		Connection con=ConnectionToDb.dbConnection();
		Statement stm=con.createStatement();
		ResultSet set=stm.executeQuery(QueriesForDb.readAllCar);
		while(set.next()) {
			String name=set.getString(1);
			String color=set.getString(2);
			
			String fuelType=set.getString(3);
			int price=set.getInt(4);
			String type=set.getString(5);
			String transmission=set.getString(6);
			System.out.println("Car Name : "+ name);
			System.out.println("Colour : "+ color);
			System.out.println("Fuel Type : "+ fuelType);
			System.out.println("Price : "+ price);
			System.out.println("Car Type : "+ type);
			System.out.println("Car Transmission : "+ transmission);
			System.out.println("===========================");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	
}
	
	
	public static void updateShowroom(String showroomName,int noOfEmp) {
		try {
			
		Connection con=ConnectionToDb.dbConnection();
		String query="UPDATE showroom SET Total_Employee=? WHERE Showroom_Name=?; ";
		
		PreparedStatement pstm=con.prepareStatement(query);
		
		pstm.setInt(1, noOfEmp);
		
		pstm.setString(2, showroomName);
		
		pstm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateEmployee (String name, String showroom) {
		
		try {
			Connection con=ConnectionToDb.dbConnection();
			String query="UPDATE emplyoees SET Employer_Showroom=?  WHERE  Employee_Name=?;";
			PreparedStatement stm=con.prepareStatement(query);
			stm.setString(1, showroom);
			stm.setString(2,name );
			stm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
public static void updateCars (String carName, String price) {
		
		try {
			Connection con=ConnectionToDb.dbConnection();
			String query="UPDATE cars SET Price=?  WHERE  Car_Name=?;";
			PreparedStatement stm=con.prepareStatement(query);
			stm.setString(1, price);
			stm.setString(2,carName );
			stm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
			
			
	

public static void deleteEmployee(String  emplyoeeName) {
	try {
		Connection con=ConnectionToDb.dbConnection();
		String query ="DELETE FROM emplyoees WHERE Employee_Name=?";
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setString(1, emplyoeeName);
		pstm.execute();
	}
	catch( Exception e) {
		e.printStackTrace();
	}
		
		
}

public static void deleteShowroom(String  showroomName) {
	try {
		Connection con=ConnectionToDb.dbConnection();
		
		
		String query ="DELETE FROM showroom WHERE Showroom_Name=?";
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setString(1, showroomName);
		pstm.execute();
	}
	catch( Exception e) {
		e.printStackTrace();
	}
}
		
public static void deleteCars(String  carName) {
	try {
		Connection con=ConnectionToDb.dbConnection();
		
		
		String query ="DELETE FROM cars WHERE Car_Name=?";
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setString(1, carName);
		pstm.execute();
	}
	catch( Exception e) {
		e.printStackTrace();
	}
}	
	
}


	
		
		
		
		


