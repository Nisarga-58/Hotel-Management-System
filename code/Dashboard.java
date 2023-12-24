package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Dashboard extends JFrame implements ActionListener {
	JButton add,rec;
	Dashboard(){
		
super("HOTEL MANAGEMENT SYSTEM");
		
		rec = new JButton("RECEPTION");
		rec.setBounds(425,510,140,30);
		rec.setFont(new Font("Tahoma", Font.BOLD, 15));
		rec.setBackground(new Color(255,98,0));
		rec.setForeground(Color.black);
		rec.addActionListener(this);
		add(rec);
		
		add = new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma", Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.setForeground(Color.black);
        add.addActionListener(this);
        
        add(add);
        
        
        ImageIcon i11 = new ImageIcon("/Users/nisarga/Downloads/hotel/pic4.jpeg");
		Image i2 = i11.getImage().getScaledInstance(170,160,Image.SCALE_DEFAULT);
		ImageIcon imageIcon11 = new ImageIcon(i2);
		JLabel label1 = new JLabel(imageIcon11);
	    label1.setBounds(865,300,170,160);
	    add(label1);
	    
	    ImageIcon i111 = new ImageIcon("/Users/nisarga/Downloads/hotel/pic5.jpeg");
		Image i22 = i111.getImage().getScaledInstance(170,160,Image.SCALE_DEFAULT);
		ImageIcon imageIcon111 = new ImageIcon(i22);
		JLabel label11 = new JLabel(imageIcon111);
	    label11.setBounds(425,300,170,160);
	    add(label11);
        
        ImageIcon imageIcon = new ImageIcon("/Users/nisarga/Downloads/hotel/pic3.jpeg");
		Image i1 = imageIcon.getImage().getScaledInstance(1300,750,Image.SCALE_DEFAULT);
		ImageIcon imageIcon1 = new ImageIcon(i1);
		JLabel label = new JLabel(imageIcon1);
	    label.setBounds(0,0,1300,750);
	    add(label);
	    
	    
	    setSize(1300,750);
		setVisible(true);
		


		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rec) {
			new Reception();
            setVisible(false);
			
		}
		else {
			new login2();
			setVisible(false);
			
		}
		
	}
    

	
		
	

	public static void main(String[] args) {
		new Dashboard();


	}

}
