package car_Showroom;

import java.util.Scanner;

public class Cars extends Showroom implements Utility {
	 private String car_name;
   private  String car_color;
   private String car_fuel_type;
    private int car_price;
    private String car_type;
     private String car_transmission;

	@Override
	public void getDetails() {
		 System.out.println("NAME is :  "+car_name);
	        System.out.println("COLOR: "+car_color);
	        System.out.println("FUEL TYPE: "+car_fuel_type);
	        System.out.println("PRICE: "+car_price);
	        System.out.println("CAR TYPE: "+car_type);
	        System.out.println("TRANSMISSION: "+car_transmission);
		
	}

	@Override
	public void setDetails() {
		try {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
	        System.out.println();
	        System.out.print("CAR NAME: ");
	        car_name = sc.nextLine();
	        System.out.print(("CAR COLOR: "));
	        car_color = sc.nextLine();
	        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
	        car_fuel_type = sc.nextLine();
	        System.out.print("CAR PRICE: ");
	        car_price = sc.nextInt();
	        sc.nextLine();
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
