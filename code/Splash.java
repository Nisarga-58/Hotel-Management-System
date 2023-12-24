package hotel.management.system;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class Splash extends JFrame{
	Splash(){
		ImageIcon imageIcon = new ImageIcon("/Users/nisarga/Downloads/hotel/pic1.jpeg");
		JLabel label = new JLabel(imageIcon);
		label.setBounds(0,0,950,600);
		add(label);
		 
		setLayout(null);
		setLocation(75,150);
		setSize(950,600);
		setVisible(true);
		
		try {
            Thread.sleep(5000);
            new login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

		
	
	
	

	public static void main(String[] args) {
		new Splash();

		

	}

}
