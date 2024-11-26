import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class InventoryManagementGUI {
	private List<Product> products = new ArrayList<>();

	public InventoryManagementGUI() {
		// Main Frame
		JFrame frame = new JFrame("Inventory Management System");
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		// Title Label
		JLabel titleLabel = new JLabel("Inventory Management System", SwingConstants.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		frame.add(titleLabel, BorderLayout.NORTH);

		// Buttons Panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));

		JButton addProductButton = new JButton("Add Product");
		JButton viewProductsButton = new JButton("View Products");
		JButton exitButton = new JButton("Exit");

		buttonPanel.add(addProductButton);
		buttonPanel.add(viewProductsButton);
		buttonPanel.add(exitButton);

		frame.add(buttonPanel, BorderLayout.CENTER);

		// Button Actions
		addProductButton.addActionListener(e -> openAddProductDialog(frame));
		viewProductsButton.addActionListener(e -> openViewProductsDialog(frame));
		exitButton.addActionListener(e -> System.exit(0));

		frame.setVisible(true);
	}

	// Add Product Dialog
	private void openAddProductDialog(JFrame parent) {
		JDialog dialog = new JDialog(parent, "Add Product", true);
		dialog.setSize(350, 300);
		dialog.setLayout(new GridLayout(6, 2, 10, 10));

		JLabel idLabel = new JLabel("Product ID:");
		JTextField idField = new JTextField();

		JLabel nameLabel = new JLabel("Name:");
		JTextField nameField = new JTextField();

		JLabel priceLabel = new JLabel("Price:");
		JTextField priceField = new JTextField();

		JLabel quantityLabel = new JLabel("Quantity:");
		JTextField quantityField = new JTextField();

		JLabel categoryLabel = new JLabel("Category:");
		JTextField categoryField = new JTextField();

		JButton addButton = new JButton("Add");
		JButton cancelButton = new JButton("Cancel");

		dialog.add(idLabel);
		dialog.add(idField);
		dialog.add(nameLabel);
		dialog.add(nameField);
		dialog.add(priceLabel);
		dialog.add(priceField);
		dialog.add(quantityLabel);
		dialog.add(quantityField);
		dialog.add(categoryLabel);
		dialog.add(categoryField);
		dialog.add(addButton);
		dialog.add(cancelButton);

		// Button Actions
		addButton.addActionListener(e -> {
			try {
				int id = Integer.parseInt(idField.getText());
				String name = nameField.getText();
				double price = Double.parseDouble(priceField.getText());
				int quantity = Integer.parseInt(quantityField.getText());
				String category = categoryField.getText();

				products.add(new Product(id, name, price, quantity, category));
				JOptionPane.showMessageDialog(dialog, "Product added successfully!");
				dialog.dispose();
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(dialog, "Invalid input. Please enter correct values.");
			}
		});

		cancelButton.addActionListener(e -> dialog.dispose());

		dialog.setVisible(true);
	}

	// View Products Dialog
	private void openViewProductsDialog(JFrame parent) {
		JDialog dialog = new JDialog(parent, "Product List", true);
		dialog.setSize(400, 300);

		JTextArea productArea = new JTextArea();
		productArea.setEditable(false);

		if (products.isEmpty()) {
			productArea.setText("No products available.");
		} else {
			for (Product product : products) {
				productArea.append(product.toString() + "\n");
			}
		}

		JScrollPane scrollPane = new JScrollPane(productArea);
		dialog.add(scrollPane);

		dialog.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(InventoryManagementGUI::new);
	}
}
