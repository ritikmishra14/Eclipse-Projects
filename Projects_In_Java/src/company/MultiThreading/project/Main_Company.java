package company.MultiThreading.project;

public class Main_Company {

	public static void main(String[] args) {
		Company company=new Company();
		company.count=1;
		Producer produce =new Producer(company);
		Thread producerThread =new Thread(produce);
		Consumer consume=new Consumer(company);
		Thread consumerThread =new Thread(consume);
		
		producerThread.start();
		producerThread.setPriority(Thread.MAX_PRIORITY);
		consumerThread.start();
	}

}
