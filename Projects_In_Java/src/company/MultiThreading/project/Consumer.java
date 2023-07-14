package company.MultiThreading.project;

public class Consumer implements Runnable {
	Company c;
	String name;
	public Consumer(Company c) {
		this.c=c;
	}
public void run() {

	while(true) {
		this.c.consume_item();
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
}
