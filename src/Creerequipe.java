import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Creerequipe extends JDialog {
	private JTextField textFieldnomeq;
	private JTextField textFieldentrain;
	private JTextField textFieldcapitain;
	private JTextField textFieldjoue_1;
	private JTextField textFieldjoue_2;
	private JTextField textFieldjoue_3;
	private JTextField textFieldjoue_4;
	private JTextField textFieldjoue_5;
	private JTextField textFieldremp_1;
	private JTextField textFieldremp_2;
	private JTextField textFieldremp_3;

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
		setBounds(100, 100, 398, 485);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(10, 403, 372, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String nomeq = '\''+textFieldnomeq.getText()+'\'';
						String entrain ='\''+textFieldentrain.getText()+'\'';
						String capitain = '\''+textFieldcapitain.getText()+'\'';
						String nbjoue = '\''+"9"+'\'';
						System.out.println("Insertion dans la table : "+nomeq+" | "+entrain+" | "+capitain+" ");
						
						String joue_1 = '\''+textFieldjoue_1.getText()+'\'';
						String joue_2 = '\''+textFieldjoue_2.getText()+'\'';
						String joue_3 = '\''+textFieldjoue_3.getText()+'\'';
						String joue_4 = '\''+textFieldjoue_4.getText()+'\'';
						String joue_5 = '\''+textFieldjoue_5.getText()+'\'';
						System.out.println("Insertion dans la table : "+joue_1+" | "+joue_2+" | "+joue_3+"| "+joue_4+"| "+joue_5+" ");
						
						Connection con;
						try {
							System.out.println("Creation....");
							con = DriverManager.getConnection("jdbc:mysql://localhost/tournois","root","");
						
						Statement stm = con .createStatement();
						stm.executeUpdate("insert into equipe values (NULL,"+nomeq+","+entrain+","+capitain+","+nbjoue+",NULL);");
						stm.executeUpdate("insert into joueur values (NULL,"+joue_1+",NULL,"+nomeq+",NULL);");
						stm.executeUpdate("insert into joueur values (NULL,"+joue_2+",NULL,"+nomeq+",NULL);");
						stm.executeUpdate("insert into joueur values (NULL,"+joue_3+",NULL,"+nomeq+",NULL);");
						stm.executeUpdate("insert into joueur values (NULL,"+joue_4+",NULL,"+nomeq+",NULL);");
						stm.executeUpdate("insert into joueur values (NULL,"+joue_5+",NULL,"+nomeq+",NULL);");
						
						if( textFieldremp_1 != null){
							String remp_1 = '\''+textFieldremp_1.getText()+'\'';
							stm.executeUpdate("insert into joueur values (NULL,"+remp_1+",NULL,"+nomeq+",NULL);");
							}
						if( textFieldremp_2 != null){
							String remp_2 = '\''+textFieldremp_2.getText()+'\'';
							stm.executeUpdate("insert into joueur values (NULL,"+remp_2+",NULL,"+nomeq+",NULL);");
							}
						if( textFieldremp_3 != null){
							String remp_3 = '\''+textFieldremp_3.getText()+'\'';
							stm.executeUpdate("insert into joueur values (NULL,"+remp_3+",NULL,"+nomeq+",NULL);");
							}
						System.out.println("Creation finit");
						
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							System.out.println("Erreur : "+e1);
						};
						
						
						if(textFieldremp_1 != null ){
							String remp_1 = '\''+textFieldremp_1.getText()+'\'';
							}
					
					}
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
		
		JLabel lblCrerVotrequipe = new JLabel("Cr\u00E9er votre \u00E9quipe");
		lblCrerVotrequipe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCrerVotrequipe.setBounds(58, 11, 128, 25);
		getContentPane().add(lblCrerVotrequipe);
		
		JLabel lblNomDquipe = new JLabel("Nom d'\u00E9quipe");
		lblNomDquipe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomDquipe.setBounds(10, 53, 98, 24);
		getContentPane().add(lblNomDquipe);
		
		textFieldnomeq = new JTextField();
		textFieldnomeq.setBounds(143, 57, 86, 20);
		getContentPane().add(textFieldnomeq);
		textFieldnomeq.setColumns(10);
		
		JLabel lblEntraineDquipe = new JLabel("Entraine d'\u00E9quipe");
		lblEntraineDquipe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEntraineDquipe.setBounds(10, 88, 115, 24);
		getContentPane().add(lblEntraineDquipe);
		
		textFieldentrain = new JTextField();
		textFieldentrain.setBounds(143, 92, 86, 20);
		getContentPane().add(textFieldentrain);
		textFieldentrain.setColumns(10);
		
		JLabel lblCapitaineDquipe = new JLabel("Capitaine d'\u00E9quipe");
		lblCapitaineDquipe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCapitaineDquipe.setBounds(10, 123, 115, 20);
		getContentPane().add(lblCapitaineDquipe);
		
		textFieldcapitain = new JTextField();
		textFieldcapitain.setBounds(143, 125, 86, 20);
		getContentPane().add(textFieldcapitain);
		textFieldcapitain.setColumns(10);
		
		JLabel lblNombreDeJoueurs = new JLabel("Nombre de joueur");
		lblNombreDeJoueurs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreDeJoueurs.setBounds(10, 161, 115, 25);
		getContentPane().add(lblNombreDeJoueurs);
		
		JSpinner spinnernbjoue = new JSpinner();
		spinnernbjoue.setBounds(143, 165, 86, 21);
		getContentPane().add(spinnernbjoue);
		
		JLabel lblJoueur = new JLabel("Joueur");
		lblJoueur.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJoueur.setBounds(10, 207, 73, 14);
		getContentPane().add(lblJoueur);
		
		textFieldjoue_1 = new JTextField();
		textFieldjoue_1.setBounds(143, 206, 86, 20);
		getContentPane().add(textFieldjoue_1);
		textFieldjoue_1.setColumns(10);
		
		textFieldjoue_2 = new JTextField();
		textFieldjoue_2.setBounds(262, 206, 86, 20);
		getContentPane().add(textFieldjoue_2);
		textFieldjoue_2.setColumns(10);
		
		textFieldjoue_3 = new JTextField();
		textFieldjoue_3.setBounds(143, 237, 86, 20);
		getContentPane().add(textFieldjoue_3);
		textFieldjoue_3.setColumns(10);
		
		textFieldjoue_4 = new JTextField();
		textFieldjoue_4.setBounds(262, 237, 86, 20);
		getContentPane().add(textFieldjoue_4);
		textFieldjoue_4.setColumns(10);
		
		textFieldjoue_5 = new JTextField();
		textFieldjoue_5.setBounds(143, 268, 86, 20);
		getContentPane().add(textFieldjoue_5);
		textFieldjoue_5.setColumns(10);
		
		JLabel lblRemplaant = new JLabel("Rempla\u00E7ant");
		lblRemplaant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRemplaant.setBounds(10, 307, 73, 14);
		getContentPane().add(lblRemplaant);
		
		textFieldremp_1 = new JTextField();
		textFieldremp_1.setBounds(143, 306, 86, 20);
		getContentPane().add(textFieldremp_1);
		textFieldremp_1.setColumns(10);
		
		textFieldremp_2 = new JTextField();
		textFieldremp_2.setBounds(262, 306, 86, 20);
		getContentPane().add(textFieldremp_2);
		textFieldremp_2.setColumns(10);
		
		textFieldremp_3 = new JTextField();
		textFieldremp_3.setBounds(143, 349, 86, 20);
		getContentPane().add(textFieldremp_3);
		textFieldremp_3.setColumns(10);
	}
}
