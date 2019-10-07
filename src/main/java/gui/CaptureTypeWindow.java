package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CaptureTypeWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tfCode;
	private JTextField tfDescription;
	private JTextField tfCostPerKm;
	
	public CaptureTypeWindow() {
		setTitle("Capturar Tipo");
		getContentPane().setLayout(null);
		
		JButton btnSave = new JButton("Guardar");
		btnSave.setBounds(39, 225, 117, 29);
		getContentPane().add(btnSave);
		
		tfCode = new JTextField();
		tfCode.setBounds(137, 33, 130, 26);
		getContentPane().add(tfCode);
		tfCode.setColumns(10);
		
		tfDescription = new JTextField();
		tfDescription.setBounds(137, 163, 130, 26);
		getContentPane().add(tfDescription);
		tfDescription.setColumns(10);
		
		tfCostPerKm = new JTextField();
		tfCostPerKm.setBounds(137, 98, 130, 26);
		getContentPane().add(tfCostPerKm);
		tfCostPerKm.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Descripción");
		lblNewLabel.setBounds(39, 168, 91, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código");
		lblNewLabel_1.setBounds(50, 38, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Costo por Km");
		lblNewLabel_2.setBounds(39, 103, 104, 16);
		getContentPane().add(lblNewLabel_2);
	}
	
	
}
