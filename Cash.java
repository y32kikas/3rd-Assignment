
public class Cash implements Payment{
	
	private double discount;
	
	public Cash(){
		discount = 0;
	}

	public double paymentmethod(){		
		return 1-discount;
	}
}