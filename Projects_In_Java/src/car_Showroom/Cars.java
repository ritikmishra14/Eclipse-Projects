package car_Showroom;

import java.util.Scanner;

public class Cars extends Showroom implements Utility {
public Cars() {
		
	}
	 public Cars(String showroom_name, int no_of_emplyoee, String manager_name, String address, int cars_in_stock) {
		super(showroom_name, no_of_emplyoee, manager_name, address, cars_in_stock);
		
	}

	private String car_name;
   private  String car_color;
   private String car_fuel_type;
    private int car_price;
    private String car_type;
     private String car_transmission;
     
     

	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_color() {
		return car_color;
	}
	public void setCar_color(String car_color) {
		this.car_color = car_color;
	}
	public String getCar_fuel_type() {
		return car_fuel_type;
	}
	public void setCar_fuel_type(String car_fuel_type) {
		this.car_fuel_type = car_fuel_type;
	}
	public int getCar_price() {
		return car_price;
	}
	public void setCar_price(int car_price) {
		this.car_price = car_price;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getCar_transmission() {
		return car_transmission;
	}
	public void setCar_transmission(String car_transmission) {
		this.car_transmission = car_transmission;
	}
	@Override
	public void getDetails() {
		 System.out.println("NAME :  "+car_name);
	        System.out.println("COLOR: "+car_color);
	        System.out.println("FUEL TYPE: "+car_fuel_type);
	        System.out.println("PRICE: "+car_price);
	        System.out.println("CAR TYPE: "+car_type);
	        System.out.println("TRANSMISSION: "+car_transmission);
		
	}

	@Override
	public void setDetails() {
		try {
			System.out.println("======================= *** Eenter Car Details *** =======================");
		 Scanner sc = new Scanner(System.in);
	        System.out.println();
	        System.out.print("CAR NAME: ");
	        car_name = sc.nextLine();
	        System.out.print(("CAR COLOR: "));
	        car_color = sc.nextLine();
	        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
	        car_fuel_type = sc.nextLine();
	        System.out.print("CAR PRICE: ");
	        car_price = Integer.parseInt(sc.nextLine());
	      
	        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
	        car_type = sc.nextLine();
	        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
	        car_transmission = sc.nextLine();
	        System.out.println("Car added successfully\n");
		}
		catch(Exception e) {
			System.out.println("Please Enter Valid Input !");
		}
	        cars_in_stock++;
		
	}

}
