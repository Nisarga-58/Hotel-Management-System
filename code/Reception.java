package hotel.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reception extends JFrame {
	Reception(){
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(230,15,1040,680);
		panel.setBackground(new Color(3,45,48));
		add(panel);
		
		 JPanel panel1 = new JPanel();
	     panel1.setLayout(null);
	     panel1.setBounds(15,15,208,680);
	     panel1.setBackground(new Color(3,45,48));
	     add(panel1);
	     
	     ImageIcon i111 = new ImageIcon("/Users/nisarga/Downloads/hotel/pic6.jpeg");
		 Image i22 = i111.getImage().getScaledInstance(950,660,Image.SCALE_DEFAULT);
		 ImageIcon imageIcon111 = new ImageIcon(i22);
		 JLabel label11 = new JLabel(imageIcon111);
		 label11.setBounds(50,10,950,660);
		 panel.add(label11);
		 
		 JButton btnNCF = new JButton("New Customer Form");
		 btnNCF.setBounds(5,30,200,30);
		 btnNCF.setBackground(Color.white);
		 btnNCF.setForeground(Color.black);
		 panel1.add(btnNCF);
		 btnNCF.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					new NewCustomer();
					 
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });
		 
		 JButton btnRoom = new JButton("Room");
		 btnRoom.setBounds(5,75,200,30);
		 btnRoom.setBackground(Color.white);
		 btnRoom.setForeground(Color.black);
		 panel1.add(btnRoom);
		 btnRoom.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new Room();
					 
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });
		 
		 
		 JButton btnDepartment = new JButton("Department");
		 btnDepartment.setBounds(5,120,200,30);
		 btnDepartment.setBackground(Color.white);
		 btnDepartment.setForeground(Color.black);
		 panel1.add(btnDepartment);
		 btnDepartment.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new Department();
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });
		 
		 
		 JButton btnAEI = new JButton("All Employee Info");
		 btnAEI.setBounds(5,165,200,30);
		 btnAEI.setBackground(Color.white);
		 btnAEI.setForeground(Color.black);
		 panel1.add(btnAEI);
		 btnAEI.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new Employee();
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });
		 
		 
		 JButton btnCI = new JButton("Customer Info");
		 btnCI.setBounds(5,210,200,30);
		 btnCI.setBackground(Color.white);
		 btnCI.setForeground(Color.black);
		 panel1.add(btnCI);
		 btnCI.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new CustomerInfo();
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });
		 
		 
		 JButton btnMI = new JButton("Manager Info");
		 btnMI.setBounds(5,255,200,30);
		 btnMI.setBackground(Color.white);
		 btnMI.setForeground(Color.black);
		 panel1.add(btnMI);
		 btnMI.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new ManagerInfo();
					 
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });
		 
		    
		 JButton btnCO = new JButton("Check out");
		 btnCO.setBounds(5,300,200,30);
		 btnCO.setBackground(Color.white);
		 btnCO.setForeground(Color.black);
		 panel1.add(btnCO);
		 btnCO.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new CheckOut();
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 }); 
		 
		 
		 JButton btnUC = new JButton("Update check-In Details");
		 btnUC.setBounds(5,345,200,30);
		 btnUC.setBackground(Color.white);
		 btnUC.setForeground(Color.black);
		 panel1.add(btnUC );
		 btnUC.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new UpdateCheck();
					 
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });   
		 
		 
		 JButton btnURS = new JButton("Update Room Status");
		 btnURS.setBounds(5,390,200,30);
		 btnURS.setBackground(Color.white);
		 btnURS.setForeground(Color.black);
		 panel1.add(btnURS );
		 btnURS.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new UpdateRoom();
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });   
		 
		 JButton btnPUS = new JButton("Pic Up Service");
		 btnPUS.setBounds(5,390,200,30);
		 btnPUS.setBackground(Color.white);
		 btnPUS.setForeground(Color.black);
		 panel1.add(btnPUS );
		 btnPUS.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new PickUp();
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });   
		 
		 
		 JButton btnSR = new JButton("Search Room");
		 btnSR.setBounds(5,435,200,30);
		 btnSR.setBackground(Color.white);
		 btnSR.setForeground(Color.black);
		 panel1.add(btnSR  );
		 btnSR.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 new SearchRoom();
					 
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });   
		 
		 
		 JButton logout = new JButton("Logout");
		 logout.setBounds(5,475,95,30);
		 logout.setBackground(Color.white);
		 logout.setForeground(Color.black);
		 panel1.add(logout );
		 logout.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 System.exit(102);
					 
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });   
		 
		 
		 JButton back = new JButton("Back");
		 back.setBounds(110,475,95,30);
		 back.setBackground(Color.white);
		 back.setForeground(Color.black);
		 panel1.add( back );
		 back.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 setVisible(false);
					 new Dashboard();
					 
					 
				 }catch(Exception E) {
					 E.printStackTrace();
				 }
				 
			 }
			 
		 });   








		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setSize(1300,750);
		setVisible(true);

	     
	     

		
	}
	

	public static void main(String[] args) {
		new Reception();

		

	}

}
