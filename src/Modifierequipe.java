import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.JButton;


public class Modifierequipe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modifierequipe frame = new Modifierequipe();
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
	public Modifierequipe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTapezVotreNumro = new JLabel("Tapez votre num\u00E9ro d'\u00E9quipe");
		lblTapezVotreNumro.setBounds(10, 11, 181, 34);
		lblTapezVotreNumro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblTapezVotreNumro);
		
		textField = new JTextField();
		textField.setBounds(201, 19, 131, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 84, 395, 352);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("Nom d'\u00E9quipe");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(28, 40, 97, 23);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(166, 43, 86, 20);
		panel.add(textField_1);
		
		JLabel label_2 = new JLabel("Entraineur d'\u00E9quipe");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(28, 74, 132, 23);
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(166, 77, 86, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(277, 77, 86, 20);
		panel.add(textField_3);
		
		JLabel label_3 = new JLabel("Capitaine d'\u00E9quipe");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(28, 108, 132, 23);
		panel.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(166, 111, 86, 20);
		panel.add(textField_4);
		
		JLabel label_4 = new JLabel("Joueur d'\u00E9quipe");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(28, 142, 132, 23);
		panel.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(166, 145, 86, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(277, 145, 86, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(166, 187, 86, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(277, 187, 86, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(166, 227, 86, 20);
		panel.add(textField_9);
		
		JLabel label_5 = new JLabel("Rempla\u00E7ant");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(28, 273, 91, 23);
		panel.add(label_5);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(166, 276, 86, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(277, 276, 86, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(166, 308, 86, 20);
		panel.add(textField_12);
		
		JButton btnSeach = new JButton("Search");
		btnSeach.setBounds(201, 50, 131, 23);
		contentPane.add(btnSeach);
		btnSeach.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnSauvegarde = new JButton("Sauvegarde");
		btnSauvegarde.setBounds(27, 447, 98, 23);
		contentPane.add(btnSauvegarde);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(151, 447, 98, 23);
		contentPane.add(btnCancel);
	}
}
