package company.MultiThreading.project;

public class Producer implements Runnable {
	
	Company c;
	public Producer(Company c) {
		this.c=c;
	}
	
	public void run() {
		while(true) {
			this.c.produce_item(c.count);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			c.count++;
		}
	}
		
		
	

}
