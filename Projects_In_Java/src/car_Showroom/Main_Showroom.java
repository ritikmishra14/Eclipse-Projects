package car_Showroom;
import java.util.Scanner;
import java.util.*;

public class Main_Showroom {
	static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].REGISTER SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].VIEW SHOWROOMS \t\t\t 5].VIEW EMPLOYEES \t\t\t 6].AVAILABLE CARS");
        System.out.println();
        

    }
	static void main_menu1(){
        System.out.println();
       
        System.out.println();
        
        System.out.println("1].REGISTER SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].VIEW SHOWROOMS \t\t\t 5].VIEW EMPLOYEES \t\t\t 6].AVAILABLE CARS");
        System.out.println("\t\tEnter any other input to exit: ");
        

    }

	public static void main(String[] args) {
		
		
		main_menu();
		Scanner sc=new Scanner(System.in);
		int choice;
		int menuChoice;
		
		
		
while(true) {
	
	
	
	choice=sc.nextInt();
	if(choice==1) {
//		Register showroom
		
		Showroom showroom=new Showroom();
		showroom.setDetails();
		StatementToExecute.insertIntoShowroom(showroom);

		System.out.println("Please Enter 1 to go to main menu: ");
		
		System.out.println("Enter any other input to Exit: ");
		menuChoice=sc.nextInt();
		if(menuChoice==1) {
			main_menu1();
		}
		
		else {
			System.out.println("Wrong input: ");
			System.out.println("Thanks for visiting, Have a great day !");
			break;
		}
		
		
		
	}
	else if(choice ==2) {
//		Add employee
		Emplyoee emplyoee=new Emplyoee();
		emplyoee.setDetails();
		StatementToExecute.insertIntoEmplyoee(emplyoee);
		
		
//		inserted method to the database invoked.
		System.out.println("Please Enter 1 to go to main menu: ");
		
		System.out.println("Enter any other input to Exit: ");
		
		menuChoice=sc.nextInt();
		if(menuChoice==1) {
			main_menu1();
		}
		
		else {
			System.out.println("Wrong input: ");
			System.out.println("Thanks for visiting, Have a great day !");
			break;
		}
		
		
	}
	else if(choice ==3) {
//		Add cars
		Cars car=new Cars();
		car.setDetails();
//		insert method to the database invoked.
		StatementToExecute.insertIntocar(car);
		
		System.out.println("Please Enter 1 to go to main menu: ");
		System.out.println("Enter any other input to Exit: ");

		menuChoice=sc.nextInt();
		if(menuChoice==1) {
			main_menu1();
		}
		
		else {
			System.out.println("Wrong input: ");
			System.out.println("Thanks for visiting, Have a great day !");
			break;
		}
		
		
	}
	else if(choice ==4) {
// View showroom
		StatementToExecute.getAllShowroom();

		System.out.println("Please Enter 1 to go to main menu:\n ");
		System.out.println("Enter 2 to update  showroom details:\n ");
		System.out.println("Enter 3 to delete showroom details:\n");
		System.out.println("Enter any other input to Exit: ");
		menuChoice=sc.nextInt();
		if(menuChoice==1) {
			main_menu1();
		}
		else if(menuChoice==2) {
//			Call update method
			Scanner input =new Scanner(System.in);
			System.out.println("Enter showroom name :");
			String name=input.nextLine();
			System.out.println("Enter Number of Employee");
			String emp=input.nextLine();
			int noOfemp=Integer.parseInt(emp);
			StatementToExecute.updateShowroom(name,noOfemp);
			System.out.println("Data Updated Successfully");
//			option to choose for main menu or exit.
			main_menu1();
			
			
		}
		else if(menuChoice==3) {
//			delete method
			Scanner input =new Scanner(System.in);
			System.out.println("Enter showroom name :");
			String name=input.nextLine();
			StatementToExecute.deleteShowroom(name);
			System.out.println("Data deleted successfully ");
//			option to choose for main menu or exit.
			main_menu1();
		}
		
		
		else {
			System.out.println("Wrong input: ");
			System.out.println("Thanks for visiting, Have a great day !");
			break;
		}
		
		
	}
	else if(choice ==5) {
//		view employees
		StatementToExecute.getAllEmployee();

		System.out.println("Please Enter 1 to go to main menu:\n ");
		System.out.println("Enter 2 to update  Employee details:\n ");
		System.out.println("Enter 3 to delete Employee details:\n");
		System.out.println("Enter any other input to Exit: ");
		menuChoice=sc.nextInt();
		if(menuChoice==1) {
			main_menu1();
		}
		else if(menuChoice==2) {
//			Call update method
			Scanner input =new Scanner(System.in);
			System.out.println("Enter Employee name :");
			String employeeName=input.nextLine();
			System.out.println("Enter updated Showroom : ");
			String newShowroom=input.nextLine();
			
			StatementToExecute.updateEmployee(employeeName, newShowroom);
			
			System.out.println("Data Updated Successfully");
//			option to choose for main menu or exit.
			main_menu1();
			
			
		}
		else if(menuChoice==3) {
//			delete method
			Scanner input =new Scanner(System.in);
			System.out.println("Enter Emplyoee name :");
			String name=input.nextLine();
			StatementToExecute.deleteEmployee(name);
			System.out.println("Data deleted successfully ");
//			option to choose for main menu or exit.
			main_menu1();
		}
		else {
			System.out.println("Wrong input: ");
			System.out.println("Thanks for visiting, Have a great day !");
			break;
		}
		
	}
	else if(choice ==6) {
	
//		view cars
		StatementToExecute.getAllCars();

		System.out.println("Please Enter 1 to go to main menu:\n ");
		System.out.println("Enter 2 to update  Car detail:\n ");
		System.out.println("Enter 3 to delete Car detail:\n");
		System.out.println("Enter any other input to Exit: ");
		menuChoice=sc.nextInt();
		if(menuChoice==1) {
			main_menu1();
		}
		else if(menuChoice==2) {
//			Call update method
			Scanner input =new Scanner(System.in);
			System.out.println("Enter Car name :");
			String carName=input.nextLine();
			System.out.println("Enter new Price : ");
			String newPrice=input.nextLine();
			StatementToExecute.updateCars(carName, newPrice);
			System.out.println("Data Updated Successfully");
//			option to choose for main menu or exit.
			main_menu1();
			
			
		}
		else if(menuChoice==3) {
//			delete method
			Scanner input =new Scanner(System.in);
			System.out.println("Enter Car name :");
			String name=input.nextLine();
			StatementToExecute.deleteCars(name);
			System.out.println("Data deleted successfully ");
//			option to choose for main menu or exit.
			main_menu1();
			
		}
		
		
	}
	else {
		System.out.println("Wrong choice given : ");
		System.out.println("Thanks for visiting , Have a great day ! ");
		break;
	}
}
	}
}
	
		
		
	



	
