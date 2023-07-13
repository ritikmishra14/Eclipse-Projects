package company.MultiThreading.project;

public class Main_Company {

	public static void main(String[] args) {
		Company company=new Company();
		Producer produce =new Producer(company);
		Consumer consume=new Consumer(company);
		
		produce.start();
		produce.setPriority(Thread.MAX_PRIORITY);
		consume.start();
	}

}
