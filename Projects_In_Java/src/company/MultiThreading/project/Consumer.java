package company.MultiThreading.project;

public class Consumer extends Thread {
	Company c;
	public Consumer(Company c) {
		this.c=c;
	}
public void run() {
	int i=1;
	while(i<100) {
		this.c.consume_item();
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		i++;
	}
	
}
}
