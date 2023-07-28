package car_Showroom;

import java.util.Scanner;

public class Showroom implements Utility{
	private String showroom_name;
	private String address;
	private int no_of_emplyoee;
	private String manager_name;
	int cars_in_stock=0;
	
	public Showroom() {
		
	}
	

	public Showroom(String showroom_name,  int no_of_emplyoee, String manager_name,String address, int cars_in_stock) {
		super();
		this.showroom_name = showroom_name;
		this.address = address;
		this.no_of_emplyoee = no_of_emplyoee;
		this.manager_name = manager_name;
		this.cars_in_stock = cars_in_stock;
	}

	public String getShowroom_name() {
		return showroom_name;
	}

	public void setShowroom_name(String showroom_name) {
		this.showroom_name = showroom_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNo_of_emplyoee() {
		return no_of_emplyoee;
	}

	public void setNo_of_emplyoee(int no_of_emplyoee) {
		this.no_of_emplyoee = no_of_emplyoee;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public int getCars_in_stock() {
		return cars_in_stock;
	}

	public void setCars_in_stock(int cars_in_stock) {
		this.cars_in_stock = cars_in_stock;
	}

	@Override
	public void getDetails() {
		System.out.println("Showroom Name: "+ showroom_name);
		System.out.println("Address: "+ address);
		System.out.println("Number Of Emplyoee: "+ no_of_emplyoee);
		System.out.println("Manager Name: "+ manager_name);
		System.out.println("Cars In Stock: "+ cars_in_stock);
		
	}

	@Override
	public  void setDetails(){
		
		try {
			
			System.out.println("======================= *** Enter Showroom Details *** =======================");
			
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Showroom Name: ");
		 showroom_name=sc.nextLine();
		 System.out.println("Number Of Emplyoee: ");
		 no_of_emplyoee=sc.nextInt();

		 sc.nextLine();
		 System.out.println("Manager name: ");
		 manager_name=sc.nextLine();
		
		 System.out.println("Address: ");
		address=sc.nextLine();


		System.out.println("Cars in stock: ");
		 cars_in_stock=sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Please Enter Valid Input !");
		}
		 
		
		 
		 
		
		
		
		
		
	}

}
