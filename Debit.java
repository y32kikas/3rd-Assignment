
public class Debit implements Payment{
	
private double discount;
	
	public Debit(){
		discount = 0.02;
	}
	
	public double paymentmethod(){		
		return 1-discount;
	}
}