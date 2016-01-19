import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Product gc1 = new GameConsole("XBOX1", 300);
		Product gc2 = new GameConsole("PS4", 350);
		Product tv1 = new TV("Samsung", 460);
		Product tv2 = new TV("LG", 370);
		Product rad1 = new Radio("Panasonic", 150);
		Product rad2 = new Radio("Philips", 200);		
		
		ArrayList<Product> products = new ArrayList<Product>();		
		products.add(rad1);
		products.add(rad2);
		products.add(tv2);
		products.add(tv1);
		products.add(gc2);
		products.add(gc1);
		
		new GUI_Frame(products);
		
		
		
		
		

	}
}