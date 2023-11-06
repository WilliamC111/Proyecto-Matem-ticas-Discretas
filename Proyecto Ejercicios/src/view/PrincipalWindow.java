package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;

public class PrincipalWindow extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JLabel lblNewLabel_1;
	/**
	 * Create the frame.
	 */
	public PrincipalWindow(ActionListener listener) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ModifyPanel panel = new ModifyPanel();
		panel.setDirectionImg("/img/Back.jpg");
		panel.setBounds(10, 11, 373, 348);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recomendador de libros");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 0, 242, 39);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		comboBox= new JComboBox<>();
		comboBox.setBounds(10, 41, 242, 30);
		comboBox.addItem("                 ");
		comboBox.addItem("Ciencia ficción");
		comboBox.addItem("Fantasía");
		comboBox.addItem("Distopía");
		comboBox.addItem("Aventura");
		comboBox.addItem("Romance");
		comboBox.addItem("Misterio");
		comboBox.addItem("Thriller");
		comboBox.addItem("Suspenso");
		comboBox.addItem("Policial");
		comboBox.addItem("Drama");
		comboBox.addItem("Comedia romántica");
		comboBox.addItem("Novela rosa");
		comboBox.addItem("Histórica");
		comboBox.addItem("Biografía");
		comboBox.addItem("Novela histórica");
		comboBox.addItem("Realismo mágico");
		comboBox.addItem("Terror");
		comboBox.addItem("Suspenso psicológico");
		comboBox.addItem("Horror cósmico");
		comboBox.addItem("Gótico");
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(264, 11, 86, 81);
		btnNewButton.setIcon(new ImageIcon(PrincipalWindow.class.getResource(("/img/Group-removebg-preview.png"))));
		btnNewButton.setOpaque(false); // Hace que el botón sea transparente
		btnNewButton.setContentAreaFilled(false); // No muestra el área de contenido
		btnNewButton.setBorderPainted(false);
		btnNewButton.setActionCommand("Buscar");
		btnNewButton.addActionListener(listener);
		panel.add(btnNewButton);
		
		ModifyPanel panel_1 = new ModifyPanel();
		panel_1.setDirectionImg("/img/Pergamino.jpg");
		panel_1.setBounds(96, 73, 157, 201);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(24, 25, 110, 139);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP); // Alineación vertical superior
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_1);
		
		this.setResizable(false);
		this.setVisible(true);
	}
	public void obtainResults(String name) {
		StringBuilder sb= new StringBuilder();
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}
    public void updateLabelText(String text) {
    	int aux=lblNewLabel_1.getWidth()-40;
    	lblNewLabel_1.setText("<html><body style='width: " + aux + "px'>" + text + "</body></html>");
    	this.repaint();
    }
	
	
}
