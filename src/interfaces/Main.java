package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.CustomerDal = new OracleCustomerDal();
		customerManager.Add();

	}

}
