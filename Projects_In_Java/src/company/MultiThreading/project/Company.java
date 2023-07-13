package company.MultiThreading.project;

public class Company {
	int n;
	boolean state=true;
	synchronized public void produce_item(int n) {
		if(state) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Produced: "+ n);
		state=false;
		notify();
	}
	
	synchronized public int consume_item() {
		if(!state) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Consumed: "+ n);
		state=true;
		notify();
		return n;
	}

}
