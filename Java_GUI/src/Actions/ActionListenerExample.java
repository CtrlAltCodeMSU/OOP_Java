package src.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("Action Listener Example: ");
		JButton b = new JButton("Click Me");
		b.setSize(60 , 20);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f , "Button Clicked!");
			}
		});
		f.setSize(300 , 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(b);
		f.setVisible(true);
	}
}
