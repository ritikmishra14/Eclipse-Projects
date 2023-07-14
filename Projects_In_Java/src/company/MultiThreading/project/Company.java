package company.MultiThreading.project;

public class Company {
	int count;
	boolean state=false;
//	 Produce Item method.
	synchronized public void produce_item(int count) {
//		this.count=count;
		if(state) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.count=count;
		System.out.println("Produced: "+ count);
		System.out.println("*************");
		state=true;
		notify();
	}
	
//	consumed item method.
	
	synchronized public int consume_item() {
		if(!state) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Consumed: "+ this.count);
		System.out.println("*************");
		state=false;
		notify();
		return count;
	}

}
