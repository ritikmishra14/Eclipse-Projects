package studentManagementApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class StudentDao {
	
	public static boolean createStudentDb(Student s) {
		boolean flag=false;
//		step 3-> create connection in here.
		try {
		Connection con=SaveDetailsDatabase.connectToDb();
		String query="insert into students(StudentName,RollNo,PhoneNumber) Values(?,?,?) ";
//		prepared statement to fire this query;
		PreparedStatement prepared=con.prepareStatement(query);
//		set the values of parameter;
		prepared.setString(1, s.getName());
		prepared.setInt(2, (int)s.getRollNo());
		prepared.setString(3, s.getPhoneNumber());
//		query completed now write statement to execute it.
		prepared.executeUpdate();
		flag=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
		
		
		
		public static boolean deleteStudent(int sId) {
			boolean flag1=false;
			try {
				Connection con=SaveDetailsDatabase.connectToDb();
				String query="delete from students where StudentId=?";
				PreparedStatement prepared=con.prepareStatement(query);
				prepared.setInt(1, sId);
				prepared.executeUpdate();
				flag1=true;
				}
			catch(Exception e) {
				e.printStackTrace();
			}
			return flag1;
		
	}



		public static void readStudent() {
		
			
			try {
				Connection con=SaveDetailsDatabase.connectToDb();
				
				String q="select * from students;";
				Statement statement=con.createStatement();
				ResultSet set=statement.executeQuery(q);
				while(set.next()) {
					int id=set.getInt(1);
					String name=set.getString(2);
					int rollNo=set.getInt(3);
					String number=set.getString(4);
					
					System.out.println("Student Id: "+ id);
					System.out.println("Student Name: "+ name);
					System.out.println("Roll Number: "+ rollNo);
					System.out.println("Phone number: "+ number);
					System.out.println("================================");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
public static void updateStudent(Student s) {
	try {
	Connection con=SaveDetailsDatabase.connectToDb();
	String query="UPDATE students SET StudentName=? WHERE StudentID=?;";
	PreparedStatement pstm=con.prepareStatement(query);
	pstm.setString(1,s.getName());
	pstm.setInt(2, s.getId());
	pstm.execute();
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
