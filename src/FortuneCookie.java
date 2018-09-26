import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie {

	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}
	
	public void showButton() {
		JFrame frame = new JFrame();
		JButton button = new JButton();
	    frame.setVisible(true);
	    frame.add(button);
	    button.addActionListener(null);
	    frame.pack();
	}
	
	public void actionPreformed() {
		JOptionPane.showMessageDialog(null, "Woo-hoo!");
		int rand = new Random().nextInt(5);
	}
	
	
}
