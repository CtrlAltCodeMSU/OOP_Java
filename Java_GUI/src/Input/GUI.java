package src.Input;

import javax.swing.*;

public class GUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello World GUI!");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("Hello World!" , SwingConstants.CENTER);
		frame.add(label);

		frame.setVisible(true);
	}
}
