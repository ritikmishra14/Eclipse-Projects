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

	public static void main(String[] args) {
		main_menu();
		Scanner sc=new Scanner(System.in);
		int choice;
		int menuChoice;
		ArrayList<Showroom> showroomList=new ArrayList<Showroom>();
		int showroomCount=0;
		ArrayList<Emplyoee> employee=new ArrayList<>();
		int employeeCount=0;
		ArrayList<Cars> car=new ArrayList<>();
		int carCount=0;
		
		
while(true) {
	
	
	
	choice=sc.nextInt();
	if(choice==1) {
//		Register showroom
		
		showroomList.add(new Showroom());
		showroomList.get(showroomCount).setDetails();
		showroomCount++;
		System.out.println("********* Please enter 1 to go to main menu, 2 to exit from application.**********");
		menuChoice=sc.nextInt();
		if(menuChoice==1) {
			main_menu();
		}
		else if(menuChoice==2) {
			System.out.println("Thanks for reaching out to us, Visit Again !");
			break;
		}
		else {
			System.out.println("Wrong input: ");
			break;
		}
		
		
		
	}
	else if(choice ==2) {
//		Add employee
		
		employee.add(new Emplyoee());
		employee.get(employeeCount).setDetails();
		System.out.println("********* Please enter 1 to go to main menu, 2 to exit from application.**********");
		menuChoice=sc.nextInt();
		if(menuChoice==1) {
			main_menu();
		}
		else if(menuChoice==2) {
			System.out.println("Thanks for reaching out to us, Visit Again !");
			break;
		}
		else {
			System.out.println("Wrong input: ");
			break;
		}
		
		
	}
	else if(choice ==3) {
//		Add cars
		car.add(new Cars());
		car.get(carCount).setDetails();
		System.out.println("********* Please enter 1 to go to main menu, 2 to exit from application.**********");
		menuChoice=sc.nextInt();
		if(menuChoice==1) {
			main_menu();
		}
		else if(menuChoice==2) {
			System.out.println("Thanks for reaching out to us, Visit Again !");
			break;
		}
		else {
			System.out.println("Wrong input: ");
			break;
		}
		
		
	}
	else if(choice ==4) {
// View showroom
		Iterator itr=showroomList.iterator();
		while(itr.hasNext()) {
			Showroom show=(Showroom)itr.next();
			show.getDetails();
			System.out.println("*******************");
		}
		
		
	}
	else if(choice ==5) {
//		view employees
		Iterator<Emplyoee> itr=employee.iterator();
		while(itr.hasNext()) {
			Emplyoee emplyoees=(Emplyoee)itr.next();
			emplyoees.getDetails();
			System.out.println("*******************");
		}
		
	}
	else if(choice ==6) {
//		view cars
		Iterator<Cars> itr=car.iterator();
		while(itr.hasNext()) {
			Cars car1=(Cars)itr.next();
			car1.getDetails();
			System.out.println("*******************");
		}
		
		
	}
	else {
		System.out.println("Wrong choice given : ");
		System.out.println("Thanks for visiting us, Have a Nice day: ");
		break;
	}
	
}

	}
}


	
