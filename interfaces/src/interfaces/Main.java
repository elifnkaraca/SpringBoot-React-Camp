package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger [] loggers = {new SmsLogger(), new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer elif = new Customer(1, "Elif", "Karaca");
		customerManager.add(elif);

	}

}
