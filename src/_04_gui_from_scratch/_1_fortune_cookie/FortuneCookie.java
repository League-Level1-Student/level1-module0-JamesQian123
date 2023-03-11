package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame;
	JButton button = new JButton();
	  public void showButton() {
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
        int rand = new Random().nextInt(5);
     }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		JOptionPane.showMessageDialog(null, "Woohoo");
		if(rand == 1) {
			JOptionPane.showMessageDialog(nul, "You will have good luck for the rest of the week");
			
		}
		else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You will have bad luck for the rest of the week ");
		}
		else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You will do good in a test");
		}
		else if(rand == 4) {
			JOptionPane.showMessageDialog(null, "You will do bad in a test ");
		}
		else if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You will have good luck");
		}
	}
  }


