import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;


public class Creerequipe extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNomeq;
	private JTextField textFieldEntrain;
	private JTextField textFieldCapit;
	private JTextField textFieldJoue1;
	private JTextField textFieldJoue2;
	private JTextField textFieldJoue3;
	private JTextField textFieldJoue4;
	private JTextField textFieldJoue5;
	private JTextField textFieldRemp1;
	private JTextField textFieldRemp2;
	private JTextField textFieldRemp3;
	private JLabel lblNombreDeJoueur;
	private JTextField textField;

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
		setBounds(100, 100, 450, 433);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setToolTipText("Cr\u00E9er votre \u00E9quipe");
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
		
		textFieldNomeq = new JTextField();
		textFieldNomeq.setBounds(166, 43, 86, 20);
		contentPanel.add(textFieldNomeq);
		textFieldNomeq.setColumns(10);
		
		JLabel lblEntraineurDquipe = new JLabel("Entraineur d'\u00E9quipe");
		lblEntraineurDquipe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEntraineurDquipe.setBounds(28, 74, 132, 23);
		contentPanel.add(lblEntraineurDquipe);
		
		textFieldEntrain = new JTextField();
		textFieldEntrain.setBounds(166, 77, 86, 20);
		contentPanel.add(textFieldEntrain);
		textFieldEntrain.setColumns(10);
		
		textFieldCapit = new JTextField();
		textFieldCapit.setBounds(166, 111, 86, 20);
		contentPanel.add(textFieldCapit);
		textFieldCapit.setColumns(10);
		
		textFieldJoue1 = new JTextField();
		textFieldJoue1.setBounds(166, 145, 86, 20);
		contentPanel.add(textFieldJoue1);
		textFieldJoue1.setColumns(10);
		
		textFieldJoue2 = new JTextField();
		textFieldJoue2.setBounds(277, 145, 86, 20);
		contentPanel.add(textFieldJoue2);
		textFieldJoue2.setColumns(10);
		
		textFieldJoue3 = new JTextField();
		textFieldJoue3.setBounds(166, 176, 86, 20);
		contentPanel.add(textFieldJoue3);
		textFieldJoue3.setColumns(10);
		
		textFieldJoue4 = new JTextField();
		textFieldJoue4.setBounds(277, 176, 86, 20);
		contentPanel.add(textFieldJoue4);
		textFieldJoue4.setColumns(10);
		
		textFieldJoue5 = new JTextField();
		textFieldJoue5.setBounds(166, 207, 86, 20);
		contentPanel.add(textFieldJoue5);
		textFieldJoue5.setColumns(10);
		
		JLabel lblRemplaant = new JLabel("Rempla\u00E7ant");
		lblRemplaant.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRemplaant.setBounds(28, 241, 91, 23);
		contentPanel.add(lblRemplaant);
		
		textFieldRemp1 = new JTextField();
		textFieldRemp1.setBounds(166, 244, 86, 20);
		contentPanel.add(textFieldRemp1);
		textFieldRemp1.setColumns(10);
		
		textFieldRemp2 = new JTextField();
		textFieldRemp2.setBounds(277, 244, 86, 20);
		contentPanel.add(textFieldRemp2);
		textFieldRemp2.setColumns(10);
		
		textFieldRemp3 = new JTextField();
		textFieldRemp3.setBounds(166, 275, 86, 20);
		contentPanel.add(textFieldRemp3);
		textFieldRemp3.setColumns(10);
		
		JLabel lblJoueurDquipe = new JLabel("Joueur d'\u00E9quipe");
		lblJoueurDquipe.setBounds(28, 142, 132, 23);
		contentPanel.add(lblJoueurDquipe);
		lblJoueurDquipe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblCapitaineDquipe = new JLabel("Capitaine d'\u00E9quipe");
		lblCapitaineDquipe.setBounds(28, 108, 132, 23);
		contentPanel.add(lblCapitaineDquipe);
		lblCapitaineDquipe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(244, 32, 1, 1);
		contentPanel.add(desktopPane);
		
		lblNombreDeJoueur = new JLabel("Nombre de joueur");
		lblNombreDeJoueur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreDeJoueur.setBounds(28, 320, 132, 14);
		contentPanel.add(lblNombreDeJoueur);
		
		textField = new JTextField();
		textField.setBounds(166, 319, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nomeq = '\''+textFieldNomeq.getText()+'\'';
						String entraineur ='\''+textFieldEntrain.getText()+'\'';
						String capitaine = '\''+textFieldCapit.getText()+'\'';
						String joue1 = '\''+textFieldJoue1.getText()+'\'';
						String joue2 = '\''+textFieldJoue2.getText()+'\'';
						String joue3 = '\''+textFieldJoue3.getText()+'\'';
						String joue4 = '\''+textFieldJoue4.getText()+'\'';
						String joue5 = '\''+textFieldJoue5.getText()+'\'';
						String remp1 = '\''+textFieldRemp1.getText()+'\'';
						String remp2 = '\''+textFieldRemp2.getText()+'\'';
						String remp3 = '\''+textFieldRemp3.getText()+'\'';
						System.out.println("Insertion dans la table : "+nomeq+" | "+entraineur+" | "+capitaine+" | ");
						
						
				});
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
