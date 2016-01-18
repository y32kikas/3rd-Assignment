
public class GameConsole extends Product{
	
	public GameConsole(String name, double price){
		super(name, price);
	}
	
	public void paymentmethod(Payment p){		
		System.out.println("Thank you for your purchase ");
		System.out.println("You bought a brand new " + super.getName() + " Game Console");
		System.out.println("Your total amount is ");
		double pr = super.getPrice()*p.paymentmethod();
		System.out.println(pr);
		double x = 100 - p.paymentmethod()*100;
		System.out.println("You had a " + x + "% discount");
	}
}