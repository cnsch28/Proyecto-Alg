package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class RouteWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public RouteWindow() {
		setTitle("Rutas");
		getContentPane().setLayout(null);
		
		JButton btnModify = new JButton("Modificar");
		btnModify.setBounds(162, 113, 117, 44);
		getContentPane().add(btnModify);
		
		JButton btnShow = new JButton("Mostrar");
		btnShow.setBounds(162, 166, 117, 44);
		getContentPane().add(btnShow);
		
		JButton btnCapture = new JButton("Capturar");
		btnCapture.setBounds(162, 64, 117, 44);
		getContentPane().add(btnCapture);
		
		JLabel lblNewLabel = new JLabel("Elige una acción");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 20, 438, 33);
		getContentPane().add(lblNewLabel);
	}
}
