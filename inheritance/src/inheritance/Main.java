package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer indv = new IndividualCustomer();
		indv.customerNumber = "12345";
		
		CorporateCustomer corp = new CorporateCustomer();
		corp.customerNumber = "78910";
		
		SendikaCustomer sendika = new SendikaCustomer();
		sendika.customerNumber = "9999";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(indv);
		//customerManager.add(corp);
		//customerManager.add(sendika);
		Customer [] customers = {indv, corp, sendika};
		customerManager.addMultiple(customers);
	}

}
