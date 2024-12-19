package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Input {
	public static void main(String[] args) {
		JFrame f = new JFrame("Input Example");
		f.setSize(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);

		JLabel l = new JLabel("Enter Your Name: ");
		l.setBounds(10,30,250,20);
		l.setFont(new Font("Times New Roman" , Font.ITALIC , 24));
		f.add(l);

		JTextField textField = new JTextField();
		textField.setBounds(200, 30, 150, 30);
		textField.setFont(new Font("Times New Roman" , Font.ITALIC , 22));
		f.add(textField);

		JButton button = new JButton("Submit");
		button.setBounds(150, 70, 100, 30);
		f.add(button);

		JLabel outputLabel = new JLabel("");
		outputLabel.setBounds(80, 120, 300, 20);
		outputLabel.setFont(new Font("Arial" , Font.BOLD , 24));
		f.add(outputLabel);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				outputLabel.setText("Hello, " + name + "!");

			}
		});
		f.setVisible(true);

	}
}
