package interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()}; 
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer mehmet = new Customer(1, "Mehmet", "Uður");
		
		customerManager.add(mehmet);

	}

}
