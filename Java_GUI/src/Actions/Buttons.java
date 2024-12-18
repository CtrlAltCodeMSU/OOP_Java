package src.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Click Example");
		JButton b = new JButton("Click Me");

		b.setPreferredSize(new Dimension(150 , 30));
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f , "You Clicked the Button!");
			}
		});
		f.setLayout(new FlowLayout());
		f.setSize(300 , 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(b);
		f.setVisible(true);
	}
}
