package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Cuteness_tv implements ActionListener {
	JFrame frame = new JFrame();
	JButton button =  new JButton("Duck");
	JButton button1 = new JButton("Frog");
	JButton button2 = new JButton("Unicorn");
	JPanel panel = new JPanel();
	public void run() {
		// TODO Auto-generated method stub
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == button) {
			showDucks();
		}
		else if(arg0.getSource() == button1) {
			showFrog();
		}
		else if(arg0.getSource() == button2 ) {
			showFluffyUnicorns();
		}
		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
