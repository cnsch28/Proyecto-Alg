package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CaptureRouteWindow extends JFrame {
	
	static final long serialVersionUID = 1L;
	private JTextField tfCode;
	private JTextField tfRoute;
	private JTextField tfStartDate;
	private JTextField tfEndDate;
	private JTextField tfDistance;
	private JTextField tfTravelTimeDuration;
	
	public CaptureRouteWindow() {
		
		setTitle("Capturar Ruta");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(42, 25, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Recorrido");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(29, 60, 82, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de inicio");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(29, 98, 103, 16);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha final");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(29, 137, 96, 16);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Distancia (Km)");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(29, 175, 103, 16);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Horas de viaje");
		lblNewLabel_5.setBounds(29, 212, 103, 21);
		getContentPane().add(lblNewLabel_5);
		
		tfCode = new JTextField();
		tfCode.setBounds(143, 20, 130, 26);
		getContentPane().add(tfCode);
		tfCode.setColumns(10);
		
		tfRoute = new JTextField();
		tfRoute.setBounds(143, 55, 130, 26);
		getContentPane().add(tfRoute);
		tfRoute.setColumns(10);
		
		tfStartDate = new JTextField();
		tfStartDate.setBounds(144, 93, 130, 26);
		getContentPane().add(tfStartDate);
		tfStartDate.setColumns(10);
		
		tfEndDate = new JTextField();
		tfEndDate.setBounds(143, 132, 130, 26);
		getContentPane().add(tfEndDate);
		tfEndDate.setColumns(10);
		
		tfDistance = new JTextField();
		tfDistance.setBounds(143, 170, 130, 26);
		getContentPane().add(tfDistance);
		tfDistance.setColumns(10);
		
		JButton bnSave = new JButton("Guardar");
		bnSave.setBounds(86, 245, 117, 29);
		getContentPane().add(bnSave);
		
		tfTravelTimeDuration = new JTextField();
		tfTravelTimeDuration.setBounds(143, 207, 130, 26);
		getContentPane().add(tfTravelTimeDuration);
		tfTravelTimeDuration.setColumns(10);
	}
}
