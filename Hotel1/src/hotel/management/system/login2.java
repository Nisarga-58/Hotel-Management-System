package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login2 extends JFrame implements ActionListener{
	
	JTextField textField1;
	JPasswordField passwordField1;
	
	JButton b1,b2;
	
	login2(){
		
		
		JLabel label1 = new JLabel("username");
		label1.setBounds(40,20,100,30 );
		label1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label1.setForeground(Color.white);
        add(label1);
        
        JLabel label2 = new JLabel("Password");
		label2.setBounds(40,70,100,30 );
		label2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label2.setForeground(Color.white);
        add(label2);
        
        textField1 = new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.white);
        textField1.setFont(new Font("Tahoma", Font.PLAIN,15));
        textField1.setBackground(new Color(26,104,110));
        add(textField1);
        
        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(Color.white);
        passwordField1.setBackground(new Color(26,104,110));
        add(passwordField1);
        
        ImageIcon imageIcon = new ImageIcon("/Users/nisarga/Downloads/hotel/pic2.jpeg");
        Image i1 = imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        
        JLabel label = new JLabel(imageIcon);
        label.setBounds(350,20,180,220);
        add(label);
        
        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.white);
       
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        add(b2);


        
		
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setLocation(400,270);
		setSize(600,300);
		setVisible(true);
		
		
	}
	
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==b1) {
				try {
					conn c = new conn();
					String user = textField1.getText();
					String pass = passwordField1.getText();
					
					String q = "select * from login2 where user_name = '"+user+"' and password = '"+pass+"'";
					ResultSet resultSet = c.statement.executeQuery(q);
					if(resultSet.next()) {
						new admin();
						
						
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "invalid");
					}
					
				}
				catch(Exception E) {
					E.printStackTrace();
				}
				
			}
			else {
				new Dashboard();
				setVisible(false);
			}
			
		 
	 }

	public static void main(String[] args) {
		new login2();
	}

}
