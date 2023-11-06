package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JTextField txtAltura, txtPeso;

	public PrincipalWindow(ActionListener listener) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ModifyPanel panel = new ModifyPanel();
		panel.setDirectionImg("/img/logo.jpg");
		panel.setBounds(10, 1, 600, 600);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("BUSCA TU EJERCICIO");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(160, 20, 242, 39);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);


		JLabel lblAltura = new JLabel("Altura (cm):");
		lblAltura.setForeground(new Color(255, 255, 255));
		lblAltura.setBounds(140, 115, 100, 30);
		panel.add(lblAltura);

		txtAltura = new JTextField();
		txtAltura.setBounds(100, 145, 100, 30);
		txtAltura.setBackground(Color.GRAY);
		panel.add(txtAltura);

		JLabel lblPeso = new JLabel("Peso (kg):");
		lblPeso.setForeground(new Color(255, 255, 255));
		lblPeso.setBounds(300, 115, 100, 30);
		panel.add(lblPeso);

		txtPeso = new JTextField();
		txtPeso.setBounds(300, 145, 100, 30);
		txtPeso.setBackground(Color.GRAY);
		panel.add(txtPeso);

		JButton btnSave = new JButton("Guardar");
		btnSave.setBounds(200, 180, 100, 30);
		btnSave.setBackground(Color.GRAY);
		panel.add(btnSave);

		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String alturaStr = txtAltura.getText();
				String pesoStr = txtPeso.getText();

				if (alturaStr.isEmpty() || pesoStr.isEmpty()) {
					return;
				}

				try {
					double altura = Double.parseDouble(alturaStr);
					double peso = Double.parseDouble(pesoStr);
					System.out.println("Altura: " + altura + " cm, Peso: " + peso + " kg guardados.");
					comboBox.setEnabled(true);
				} catch (NumberFormatException ex) {

					JOptionPane.showMessageDialog(null, "Ingrese valores numéricos para altura y peso.", "Advertencia",
							JOptionPane.WARNING_MESSAGE);

				}
			}
		});

		JPanel comboBoxPanel = new JPanel();
		comboBoxPanel.setLayout(null);
		comboBoxPanel.setBounds(108, 250, 242, 30);
		comboBoxPanel.setBackground(Color.GRAY);
		panel.add(comboBoxPanel);

		JLabel comboBoxTitle = new JLabel("Grupos musculares");
		comboBoxTitle.setForeground(Color.black);
		comboBoxTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
		comboBoxTitle.setHorizontalAlignment(SwingConstants.CENTER);
		comboBoxTitle.setBounds(0, 0, 252, 20);
		comboBoxPanel.add(comboBoxTitle);
		comboBox = new JComboBox<>();
		comboBox.setBounds(108, 270, 242, 30);

		comboBox.addItem("                 ");
		comboBox.addItem("Biceps");
		comboBox.addItem("Tríceps");
		comboBox.addItem("Antebrazos");
		comboBox.addItem("Deltoides");
		comboBox.addItem("Trapecio");
		comboBox.addItem("Dorsal ancho");
		comboBox.addItem("Pectorales");
		comboBox.addItem("Abdominales");
		comboBox.addItem("Oblicuos");
		comboBox.addItem("Serrato");
		comboBox.addItem("Fascia lata");
		comboBox.addItem("Glúteos");
		comboBox.addItem("Cuadriceps");
		comboBox.addItem("Aductor");
		comboBox.addItem("Isquiotibiales");
		comboBox.addItem("Gemelos");
		comboBox.addItem("Tibial anterior");
		panel.add(comboBox);
		
		JLabel lblAltura = new JLabel("Altura (cm):");
        lblAltura.setForeground(new Color(255, 255, 255));
        lblAltura.setBounds(140, 115, 100, 30);
        panel.add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(100, 145, 100, 30);
		txtAltura.setBackground(Color.GRAY);
        panel.add(txtAltura);

        JLabel lblPeso = new JLabel("Peso (kg):");
        lblPeso.setForeground(new Color(255, 255, 255));
        lblPeso.setBounds(300, 115, 100, 30);
        panel.add(lblPeso);

        txtPeso = new JTextField();
        txtPeso.setBounds(300, 145, 100, 30);
		txtPeso.setBackground(Color.GRAY);
        panel.add(txtPeso);

        JButton btnSave = new JButton("Guardar");
        btnSave.setBounds(200, 180, 100, 30);
		btnSave.setBackground(Color.GRAY);
        panel.add(btnSave);

		btnSave.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String alturaStr = txtAltura.getText();
        String pesoStr = txtPeso.getText();

        if (alturaStr.isEmpty() || pesoStr.isEmpty()) {
            return;
        }

        try {
            double altura = Double.parseDouble(alturaStr);
            double peso = Double.parseDouble(pesoStr);
            System.out.println("Altura: " + altura + " cm, Peso: " + peso + " kg guardados.");
            comboBox.setEnabled(true); 
        } catch (NumberFormatException ex) {
            
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos para altura y peso.", "Advertencia", JOptionPane.WARNING_MESSAGE);
          
        }
    }
});

    
JPanel comboBoxPanel = new JPanel();
comboBoxPanel.setLayout(null);
comboBoxPanel.setBounds(108, 250, 242, 30);
comboBoxPanel.setBackground(Color.GRAY);
panel.add(comboBoxPanel);

JLabel comboBoxTitle = new JLabel("Grupos musculares");
comboBoxTitle.setForeground(Color.black);
comboBoxTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
comboBoxTitle.setHorizontalAlignment(SwingConstants.CENTER);
comboBoxTitle.setBounds(0, 0, 252, 20);
comboBoxPanel.add(comboBoxTitle);
comboBox = new JComboBox<>();
        comboBox.setBounds(108, 270, 242, 30);
		
comboBox.addItem("                 ");
comboBox.addItem("Pecho");
comboBox.addItem("Espalda");
comboBox.addItem("Hombros");
comboBox.addItem("Bíceps");
comboBox.addItem("Tríceps");
comboBox.addItem("Abdomen");
comboBox.addItem("Piernas");
comboBox.addItem("Glúteos");
comboBox.addItem("Cardio");
comboBox.addItem("Trapecio");
comboBox.addItem("Antebrazo");
comboBox.addItem("Isquiotibiales");
comboBox.addItem("Pantorrillas");
panel.add(comboBox);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(350, 245, 60, 60);
		btnNewButton.setIcon(new ImageIcon(PrincipalWindow.class.getResource(("/img/lupa.jpg"))));
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setActionCommand("Buscar");
		btnNewButton.addActionListener(listener);
		panel.add(btnNewButton);

		ModifyPanel panel_1 = new ModifyPanel();
		panel_1.setDirectionImg("/img/gris.jpg");
		panel_1.setBounds(190, 350, 180, 201);
		panel.add(panel_1);
		panel_1.setLayout(null);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));

		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(24, 25, 110, 139);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);

		lblNewLabel_1.setForeground(Color.WHITE); 
		lblNewLabel_1.setBounds(24, 25, 110, 139);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP); 

		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_1);

		this.setResizable(false);
		this.setVisible(true);
	}

	public void obtainResults(String name) {
		StringBuilder sb = new StringBuilder();
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void updateLabelText(String text) {
		int aux = lblNewLabel_1.getWidth() - 40;
		lblNewLabel_1.setText("<html><body style='width: " + aux + "px'>" + text + "</body></html>");
		this.repaint();
	}

	public JTextField getTxtPeso() {
		return txtPeso;
	}

	public JTextField getTxtAltura() {
		return txtAltura;
	}

}

