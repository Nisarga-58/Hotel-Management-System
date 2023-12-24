package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Room extends JFrame {
	
	JTable table;
    JButton back;
    
    
	Room(){
		
		
		JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        
        ImageIcon imageIcon = new ImageIcon("/Users/nisarga/Downloads/hotel/pic13.jpeg");
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);
        
        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);
        
        try {
        	
        conn c = new conn();
            String RoomInfo = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
            
        	
        }catch (Exception e ) {
        	e.printStackTrace();
        	
       }
        
        back = new JButton("BACK");
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.setBounds(200,500,120,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		
        	}
        	
        });
        
        JLabel room = new JLabel("Room No.");
        room.setBounds(12,15,80,19);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(room);

        
        JLabel availability = new JLabel("Availability");
        availability.setBounds(119,15,80,19);
        availability.setForeground(Color.WHITE);
        availability.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(availability);
        
       
        JLabel Clean = new JLabel("Clean Status");
        Clean.setBounds(216,15,150,19);
        Clean.setForeground(Color.WHITE);
        Clean.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(Clean);
        
        	
        JLabel Price = new JLabel("Price");
        Price.setBounds(330,15,80,19);
        Price.setForeground(Color.WHITE);
        Price.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(Price);
        
	
        JLabel Bed = new JLabel("Bed Type");
        Bed.setBounds(417,15,80,19);
        Bed.setForeground(Color.WHITE);
        Bed.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(Bed);
        

        setUndecorated(true);
		setLayout(null);
        setLocation(500,100);
        setSize(900,600);
        setVisible(true);
		
	}

	public static void main(String[] args) {
		new Room();
		

	}

}
