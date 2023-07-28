package car_Showroom;

import java.util.Scanner;
import java.util.UUID;

public class Emplyoee extends Showroom implements Utility {
	
	public Emplyoee() {
		
	}
	public Emplyoee(String showroom_name, int no_of_emplyoee, String manager_name, String address, int cars_in_stock) {
		super(showroom_name, no_of_emplyoee, manager_name, address, cars_in_stock);
		
	}
	private String emp_id;
	    private  String emp_name;
	  private  int emp_age;
	   private String emp_department;
	    private String showroom_name;
	    
		public String getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(String emp_id) {
			this.emp_id = emp_id;
		}
		public String getEmp_name() {
			return emp_name;
		}
		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}
		public int getEmp_age() {
			return emp_age;
		}
		public void setEmp_age(int emp_age) {
			this.emp_age = emp_age;
		}
		public String getEmp_department() {
			return emp_department;
		}
		public void setEmp_department(String emp_department) {
			this.emp_department = emp_department;
		}
		public String getShowroom_name() {
			return showroom_name;
		}
		public void setShowroom_name(String showroom_name) {
			this.showroom_name = showroom_name;
		}
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
		        System.out.println("======================= *** Enter Employee Details *** =======================");
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
