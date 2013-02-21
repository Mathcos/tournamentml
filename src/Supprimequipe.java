import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Supprimequipe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supprimequipe frame = new Supprimequipe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Supprimequipe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Tapez votre num\u00E9ro d'\u00E9quipe");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 21, 181, 34);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(213, 29, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSupprimer.setBounds(10, 138, 116, 23);
		contentPane.add(btnSupprimer);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(166, 138, 108, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblTapezVotreNom = new JLabel("Tapez votre nom d'\u00E9quipe");
		lblTapezVotreNom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTapezVotreNom.setBounds(10, 66, 170, 34);
		contentPane.add(lblTapezVotreNom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 74, 123, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
