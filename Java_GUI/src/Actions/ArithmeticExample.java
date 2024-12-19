package src.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("Arithmetic Example");
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		JButton b = new JButton("Add");
		JLabel l = new JLabel("Result: ");

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1F = Integer.parseInt(num1.getText());
				int num2F = Integer.parseInt(num2.getText());
				int sum = num1F + num2F ;
				l.setText("Result: " + sum);
			}
		});
		f.setLayout(null);
		num1.setBounds(50 , 50 , 100 , 30);
		num2.setBounds(160 , 50 , 100 , 30);
		b.setBounds(50 , 100 , 100 , 30);
		l.setBounds(50 , 150 , 200 , 30);

		f.setSize(300 , 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(num1);
		f.add(num2);
		f.add(b);
		f.add(l);
		f.setVisible(true);
	}
}
