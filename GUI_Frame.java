import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class GUI_Frame extends JFrame {
	
	private JPanel northpanel , southpanel;
	private JButton button1 , button2 , button3;
	private ArrayList<Product> products;
	private JList list;
	private DefaultListModel model;
	
	public GUI_Frame(ArrayList<Product> someProducts){
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		products = someProducts;
		
		northpanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		northpanel.setBorder(new EtchedBorder());
		southpanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		southpanel.setBorder(new EtchedBorder());
				
		button1 = new JButton("Cash");
		button2 = new JButton("Debit");
		button3 = new JButton("Internet");
		
		list = new JList();
		model = new DefaultListModel();
		
		for (Product product: products)
			model.addElement(product.getName());
		
		list.setModel(model);
		
		northpanel.add(list);
		contentPane.add(northpanel, BorderLayout.NORTH);
		//setContentPane(northpanel);
		
		southpanel.add(button1);
		southpanel.add(button2);
		southpanel.add(button3);
		contentPane.add(southpanel, BorderLayout.SOUTH);
		
		ButtonListener listener1 = new ButtonListener();
		ButtonListener listener2 = new ButtonListener();
		ButtonListener listener3 = new ButtonListener();

		button1.addActionListener(listener1);
		button2.addActionListener(listener2);
		button3.addActionListener(listener3);
		
		
		
		this.setVisible(true);
		this.setSize(300, 200);
		this.setTitle("Charge Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener{
		
		Payment c = new Cash();
		Payment d = new Debit();
		Payment i = new Internet();
		
		public void actionPerformed(ActionEvent e){
			//if(e.getSource() == button2){
			String selectedProductName = (String)list.getSelectedValue();
			
			Product selectedProduct = null;
			for(Product product: products)
				if(product.getName().equals(selectedProductName))
					selectedProduct = product;
			
			if(e.getSource() == button1)		selectedProduct.paymentmethod(c);
			else if(e.getSource() == button2)	selectedProduct.paymentmethod(d);
			else								selectedProduct.paymentmethod(i);
		}
	}

}


/*
				
		
		
		
		
		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		
	}
	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		      String selectedShipName = (String)list.getSelectedValue();
			
		      Ship selectedShip = null;
		      for(Ship ship: ships)
		    	  if(ship.getName().equals(selectedShipName))
		    		  selectedShip = ship;
		      
		      System.out.println(selectedShip.calculateTotalCharge());
		      
		}
		
	}

}
*/