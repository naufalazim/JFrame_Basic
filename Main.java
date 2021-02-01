import javax.swing.JFrame;
import java.awt.Color;

public class Main{

	public static void main(String[] args) {
		
		//Kena Setup JFrame kompenen
		
		JFrame frame = new JFrame();  // Kita setup frame
		
		frame.setTitle("JFrame Basic Grid!"); // Tajuk 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Bina button pangkah
		frame.setSize(500,500);  // Set size petak segi 
		frame.setResizable(true); // Fix size.
		frame.setVisible(true); //frame akan wujud
		frame.getContentPane().setBackground(new Color(250,50,250)); //Ubah warna backround
	}
}