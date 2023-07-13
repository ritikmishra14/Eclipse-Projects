package car_Showroom;

import java.util.Scanner;
import java.util.UUID;

public class Emplyoee extends Showroom implements Utility {
	private String emp_id;
	    private  String emp_name;
	  private  int emp_age;
	   private String emp_department;
	    private String showroom_name;
		@Override
		public void getDetails() {
			 System.out.println("ID: "+emp_id);
		        System.out.println("Name: "+emp_name);
		        System.out.println("Age: "+emp_age);
		        System.out.println("Department: "+emp_department);
		        System.out.println("Showroom Name: "+showroom_name);
		}
		@Override
		public void setDetails() {
			 Scanner sc = new Scanner(System.in);
		        UUID uuid = UUID.randomUUID();
		        emp_id = String.valueOf(uuid);
		        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
		        System.out.println();
		        System.out.print("EMPLOYEE NAME: ");
		        emp_name = sc.nextLine();
		        System.out.print(("EMPLOYEE AGE: "));
		        emp_age = sc.nextInt();
		        sc.nextLine();
		        System.out.print("EMPLOYEE DEPARTMENT: ");
		        emp_department = sc.nextLine();
		        System.out.print("SHOWROOM NAME: ");
		        showroom_name = sc.nextLine();
		}
	    
}
