package car_Showroom;

import java.util.Scanner;

public class Showroom implements Utility{
	 private String showroom_name;
	private String address;
	private int no_of_emplyoee;
	private String manager_name;
	int cars_in_stock=0;

	@Override
	public void getDetails() {
		System.out.println("Showroom Name: "+ showroom_name);
		System.out.println("Address: "+ address);
		System.out.println("Number Of Emplyoee: "+ no_of_emplyoee);
		System.out.println("Manager Name: "+ manager_name);
		System.out.println("Cars In Stock: "+ cars_in_stock);
		
	}

	@Override
	public void setDetails() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Showroom Name: ");
		 showroom_name=sc.nextLine();
//		System.out.println();
		System.out.println("Address: ");
		 address=sc.nextLine();
//		System.out.println();
		System.out.println("Number Of Emplyoee: ");
		 no_of_emplyoee=sc.nextInt();
		sc.nextLine();
		System.out.println("Manager name: ");
		 manager_name=sc.nextLine();
//		System.out.println();
		System.out.println("Cars in stock: ");
		 cars_in_stock=sc.nextInt();
		 
		 System.out.println("Showroom details added successfully");
		
		
		
		}
		catch(Exception e) {
			System.out.println("Please Enter Valid Input !");
		}
		
		
	}

}
