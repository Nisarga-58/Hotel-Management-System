package hotel.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckOut extends JFrame {
	CheckOut(){
		
		JPanel panel = new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
		
        
        JLabel label = new JLabel("Check-Out");
        label.setBounds(100,20,100,30);
        label.setFont(new Font("Tahoma",Font.PLAIN,20));
        label.setForeground(Color.WHITE);
        panel.add(label);
        
        
        JLabel UserId = new JLabel("Customer Id");
        UserId.setBounds(30,80,150,30);
        UserId.setFont(new Font("Tahoma",Font.BOLD,14));
        UserId.setForeground(Color.WHITE);
        panel.add(UserId);
        
        final Choice Customer = new Choice();
        Customer.setBounds(200,80,150,25);
        panel.add(Customer);
        
        JLabel roomNum = new JLabel("Room Number");
        roomNum.setBounds(30,130,150,30);
        roomNum.setFont(new Font("Tahoma",Font.BOLD,14));
        roomNum.setForeground(Color.WHITE);
        panel.add(roomNum);

        final JLabel labelRoomnumber = new JLabel();
        labelRoomnumber.setBounds(200,130,150,30);
        labelRoomnumber.setFont(new Font("Tahoma",Font.BOLD,14));
        labelRoomnumber.setForeground(Color.WHITE);
        panel.add(labelRoomnumber);

        JLabel checkintime = new JLabel("Check-In Time");
        checkintime.setBounds(30,180,150,30);
        checkintime.setFont(new Font("Tahoma",Font.BOLD,14));
        checkintime.setForeground(Color.WHITE);
        panel.add(checkintime);
        
        final JLabel labelcheckintime = new JLabel();
        labelcheckintime.setBounds(200,180,200,30);
        labelcheckintime.setFont(new Font("Tahoma",Font.BOLD,14));
        labelcheckintime.setForeground(Color.WHITE);
        panel.add(labelcheckintime);

        JLabel checkouttime = new JLabel("Check-Out Time");
        checkouttime.setBounds(30,230,150,30);
        checkouttime.setFont(new Font("Tahoma",Font.BOLD,14));
        checkouttime.setForeground(Color.WHITE);
        panel.add(checkouttime);

        Date date = new Date();

        JLabel labelcheckouttime = new JLabel(""+date);
        labelcheckouttime.setBounds(200,230,200,30);
        labelcheckouttime.setFont(new Font("Tahoma",Font.BOLD,14));
        labelcheckouttime.setForeground(Color.WHITE);
        panel.add(labelcheckouttime);
        
        
        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from customer");
            while (resultSet.next()){
                Customer.add(resultSet.getString("number"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        JButton checkOut = new JButton(" Check-Out");
        checkOut.setBounds(30,300,120,30);
        checkOut.setForeground(Color.black);
        checkOut.setBackground(Color.white);
        panel.add(checkOut);
        
        checkOut.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                try {
                    conn cv = new conn();
                    cv.statement.executeUpdate("delete from customer where number = '"+Customer.getSelectedItem()+"'");
                    cv.statement.executeUpdate("update room set availability = 'Available' where roomnumber = '"+labelRoomnumber.getText()+"'");
                    JOptionPane.showMessageDialog(null, "Done");
                    setVisible(false);
                }catch (Exception E ){
                    E.printStackTrace();
                }
            }
        });
        
        
        
        JButton check = new JButton("Check");
        check.setBounds(300,300,120,30);
        check.setForeground(Color.black);
        check.setBackground(Color.white);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                conn c = new conn();
                try{
                    ResultSet resultSet = c.statement.executeQuery("select * from customer where number = '"+Customer.getSelectedItem()+"'");
                    while (resultSet.next()){
                        labelRoomnumber.setText(resultSet.getString("room"));
                        labelcheckintime.setText(resultSet.getString("checkintime"));
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        
        
        
        JButton back = new JButton("Back");
        back.setBounds(170,300,120,30);
        back.setForeground(Color.black);
        back.setBackground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        
        setUndecorated(true);
		setLayout(null);
        setSize(800,400);
        setLocation(500,210);
        setVisible(true);
		
	}

	public static void main(String[] args) {
		new CheckOut();

	}

}
