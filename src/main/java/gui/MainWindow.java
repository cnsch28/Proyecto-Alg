package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;

	public MainWindow() {
		
		setTitle("Proyecto - Rutas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnRoutes = new JButton("Rutas");
		btnRoutes.setBounds(67, 106, 117, 44);
		getContentPane().add(btnRoutes);
		
		JButton btnTypes = new JButton("Tipos");
		btnTypes.setBounds(258, 106, 117, 44);
		getContentPane().add(btnTypes);
		
		JLabel lblNewLabel = new JLabel("Elige una opción");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 42, 438, 26);
		getContentPane().add(lblNewLabel);
	}
	
	public static void main(String[] args) {
		
		MainWindow mw = new MainWindow();
		mw.setSize(450, 300);
		mw.setVisible(true);
	}
}
