import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;


public class Creerequipe extends JDialog {

	private final JPanel contentPanel = new JPanel();
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Creerequipe dialog = new Creerequipe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Creerequipe() {
		setBounds(100, 100, 450, 429);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCrerVotrequipe = new JLabel("Cr\u00E9er votre \u00E9quipe");
			lblCrerVotrequipe.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCrerVotrequipe.setBounds(166, 11, 142, 22);
			contentPanel.add(lblCrerVotrequipe);
		}
		
		JLabel lblNomDquipe = new JLabel("Nom d'\u00E9quipe");
		lblNomDquipe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomDquipe.setBounds(28, 40, 97, 23);
		contentPanel.add(lblNomDquipe);
		
		textField = new JTextField();
		textField.setBounds(166, 43, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEntraineurDquipe = new JLabel("Entraineur d'\u00E9quipe");
		lblEntraineurDquipe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEntraineurDquipe.setBounds(28, 74, 132, 23);
		contentPanel.add(lblEntraineurDquipe);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 77, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 77, 86, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCapitaineDquipe = new JLabel("Capitaine d'\u00E9quipe");
		lblCapitaineDquipe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCapitaineDquipe.setBounds(28, 108, 132, 23);
		contentPanel.add(lblCapitaineDquipe);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 111, 86, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblJoueurDquipe = new JLabel("Joueur d'\u00E9quipe");
		lblJoueurDquipe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJoueurDquipe.setBounds(28, 142, 132, 23);
		contentPanel.add(lblJoueurDquipe);
		
		textField_4 = new JTextField();
		textField_4.setBounds(166, 145, 86, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(277, 145, 86, 20);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(166, 187, 86, 20);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(277, 187, 86, 20);
		contentPanel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(166, 227, 86, 20);
		contentPanel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblRemplaant = new JLabel("Rempla\u00E7ant");
		lblRemplaant.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRemplaant.setBounds(28, 273, 91, 23);
		contentPanel.add(lblRemplaant);
		
		textField_9 = new JTextField();
		textField_9.setBounds(166, 276, 86, 20);
		contentPanel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(277, 276, 86, 20);
		contentPanel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(166, 308, 86, 20);
		contentPanel.add(textField_11);
		textField_11.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
