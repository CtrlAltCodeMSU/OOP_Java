package src.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("Txt Field");
		JTextField T = new JTextField(20);
		JLabel l = new JLabel("You Typed: ");

		T.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setText("You Typed: " + T.getText());
			}
		});
		f.setLayout(null);
		T.setBounds(50 , 50 , 200 , 30);
		l.setBounds(50 , 100 , 200 , 30);

		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(T);
		f.add(l);
		f.setVisible(true);
	}
}
