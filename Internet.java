
public class Internet implements Payment{
	
private double discount;
	
	public Internet(){
		discount = 0.05;
	}
	
	public double paymentmethod(){
		return 1-discount;
	}
}