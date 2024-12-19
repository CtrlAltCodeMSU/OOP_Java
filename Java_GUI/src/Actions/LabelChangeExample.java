package src.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelChangeExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("Label Change Example");
		JLabel l = new JLabel("Original Text");
		JButton b = new JButton("Change Text");

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setText("Text Changed ");
			}
		});
		f.setLayout(null);
		l.setBounds(100, 50 , 150 , 30);
		b.setBounds(100, 100 , 150 , 30);
		f.setSize(300 ,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l);
		f.add(b);
		f.setVisible(true);
	}
}
