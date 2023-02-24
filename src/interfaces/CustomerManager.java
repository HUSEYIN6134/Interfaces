package interfaces;

public class CustomerManager {
	ICustomerDal CustomerDal;//bağımlılığı azaltmak için bu şekilde kod yazdık.
    public void Add() {
    //iş kodları
    CustomerDal.Add();
    }
}
