package company.MultiThreading.project;

public class Producer extends Thread {
	
	Company c;
	public Producer(Company c) {
		this.c=c;
	}
	public void run() {
		
		int i=1;
		while(i<100) {
			this.c.produce_item(i);
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
