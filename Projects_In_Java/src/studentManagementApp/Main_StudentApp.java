package studentManagementApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_StudentApp {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to student management application");
		System.out.println();
		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.println("==========Press 1 to Add Student===============");
		System.out.println();
		System.out.println("==========Press 2 to Delete Student=============");
		System.out.println();
		System.out.println("==========Press 3 to Display Student============");
		System.out.println();
		System.out.println("==========Press 4 to update Student Information==========");
		System.out.println();
		int count=Integer.parseInt(br.readLine());
		if(count==1) {
//			add student
			System.out.println("Add student details");
			System.out.println();
			System.out.println("Enter user name: ");
			String name=br.readLine();
			System.out.println("Enter user rollNo");
			String rollNo=br.readLine();
			int rollNumber=Integer.parseInt(rollNo);
//			br.readLine();
			System.out.println("Enter user phone number");
			String phoneNumber=br.readLine();
			
			Student student=new Student(name,rollNumber,phoneNumber);
			boolean answer=StudentDao.createStudentDb(student);
			if(answer) {
				System.out.println("student added successfully  ");
			}
			else {
				System.out.println("some problem accured while adding student");
			}
			
		}
		else if(count==2) {
//			delete student
			System.out.println("Enter student Id to delete: ");
			String sId=br.readLine();
			int userId=Integer.parseInt(sId);
			System.out.println(userId);
			boolean answer =StudentDao.deleteStudent(userId);
			if(answer) {
				System.out.println("student deleted successfully  ");
			}
			else {
				System.out.println("some problem accured while adding student");
			}
		}
		else if(count ==3) {
//			display student
			StudentDao.readStudent();
		}
		else if(count==4){
//			update student;
			System.out.println("Enter updated name: ");
			String name=br.readLine();
			System.out.println("Enter Student Id to update");
			String id=br.readLine();
			 int id1=Integer.parseInt(id);
			Student s1=new Student(name,id1);
			StudentDao.updateStudent(s1);
			
			System.out.println("student updated successfully");
		}
		else {
			break;
		}

		
		System.out.println("Thanks for using my application..");
	}

}
}
