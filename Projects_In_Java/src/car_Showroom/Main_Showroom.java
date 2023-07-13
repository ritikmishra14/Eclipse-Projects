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
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        

    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
while(true) {
	main_menu();
	ArrayList<Showroom> showroomList=new ArrayList<Showroom>();
	int showroomCount=0;
	
	choice=sc.nextInt();
	if(choice==1) {
//		Add showroom
		
		showroomList.add(new Showroom());
		showroomList.get(showroomCount).setDetails();
		showroomCount++;
		
		
		
	}
	else if(choice ==2) {
//		Add employee
		
	}
	else if(choice ==3) {
//		Add cars
		
	}
	else if(choice ==4) {
// Get showroom
		Iterator itr=showroomList.iterator();
		while(itr.hasNext()) {
			Showroom show=(Showroom)itr.next();
			show.getDetails();
		}
		
		
	}
	else if(choice ==5) {
//		Get employees
		
	}
	else if(choice ==6) {
//		Get cars
		
	}
	else {
		System.out.println("Wrong choice given : ");
		break;
	}
	
}

	}
}


	
