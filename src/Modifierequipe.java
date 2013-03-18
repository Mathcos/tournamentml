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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Modifierequipe extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldideq;
	private JTextField textFieldnomeq;
	private JTextField textFieldentraineq;
	private JTextField textFieldcapitaineq;
	private JTextField textFieldjoue1;
	private JTextField textFieldjoue2;
	private JTextField textFieldjoue3;
	private JTextField textFieldjoue4;
	private JTextField textFieldjoue5;
	private JTextField textFieldremp1;
	private JTextField textFieldremp2;
	private JTextField textFieldremp3;

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
		
		textFieldideq = new JTextField();
		textFieldideq.setBounds(201, 19, 131, 20);
		contentPane.add(textFieldideq);
		textFieldideq.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 84, 395, 352);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("Nom d'\u00E9quipe");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(28, 40, 97, 23);
		panel.add(label_1);
		
		textFieldnomeq = new JTextField();
		textFieldnomeq.setColumns(10);
		textFieldnomeq.setBounds(166, 43, 86, 20);
		panel.add(textFieldnomeq);
		
		JLabel label_2 = new JLabel("Entraineur d'\u00E9quipe");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(28, 74, 132, 23);
		panel.add(label_2);
		
		textFieldentraineq = new JTextField();
		textFieldentraineq.setColumns(10);
		textFieldentraineq.setBounds(166, 77, 86, 20);
		panel.add(textFieldentraineq);
		
		JLabel label_3 = new JLabel("Capitaine d'\u00E9quipe");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(28, 108, 132, 23);
		panel.add(label_3);
		
		textFieldcapitaineq = new JTextField();
		textFieldcapitaineq.setColumns(10);
		textFieldcapitaineq.setBounds(166, 111, 86, 20);
		panel.add(textFieldcapitaineq);
		
		JLabel label_4 = new JLabel("Joueur d'\u00E9quipe");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(28, 142, 132, 23);
		panel.add(label_4);
		
		textFieldjoue1 = new JTextField();
		textFieldjoue1.setColumns(10);
		textFieldjoue1.setBounds(166, 145, 86, 20);
		panel.add(textFieldjoue1);
		
		textFieldjoue2 = new JTextField();
		textFieldjoue2.setColumns(10);
		textFieldjoue2.setBounds(277, 145, 86, 20);
		panel.add(textFieldjoue2);
		
		textFieldjoue3 = new JTextField();
		textFieldjoue3.setColumns(10);
		textFieldjoue3.setBounds(166, 187, 86, 20);
		panel.add(textFieldjoue3);
		
		textFieldjoue4 = new JTextField();
		textFieldjoue4.setColumns(10);
		textFieldjoue4.setBounds(277, 187, 86, 20);
		panel.add(textFieldjoue4);
		
		textFieldjoue5 = new JTextField();
		textFieldjoue5.setColumns(10);
		textFieldjoue5.setBounds(166, 227, 86, 20);
		panel.add(textFieldjoue5);
		
		JLabel label_5 = new JLabel("Rempla\u00E7ant");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(28, 273, 91, 23);
		panel.add(label_5);
		
		textFieldremp1 = new JTextField();
		textFieldremp1.setColumns(10);
		textFieldremp1.setBounds(166, 276, 86, 20);
		panel.add(textFieldremp1);
		
		textFieldremp2 = new JTextField();
		textFieldremp2.setColumns(10);
		textFieldremp2.setBounds(277, 276, 86, 20);
		panel.add(textFieldremp2);
		
		textFieldremp3 = new JTextField();
		textFieldremp3.setColumns(10);
		textFieldremp3.setBounds(166, 308, 86, 20);
		panel.add(textFieldremp3);
		
		JButton btnSeach = new JButton("Search");
		btnSeach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id_eq = '\''+textFieldideq.getText()+'\'';
				
						
				Connection con;
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost/tournois","root","");
				
				Statement stm = con .createStatement();
				System.out.println("Recherche dans la base de donn¨¦e ...... ");
		        ResultSet rs1 = stm.executeQuery("select nom_equipe,entraineur_equipe,capitaine_equipe from equipe where id_equipe = "+id_eq+";");
				while(rs1.next()){
					
					 textFieldnomeq.setText(rs1.getString("nom_equipe"));
					 textFieldentraineq.setText(rs1.getString("entraineur_equipe"));
					 textFieldcapitaineq.setText(rs1.getString("capitaine_equipe"));
					 }
				ResultSet rs2 = stm.executeQuery("select nom_joueur from joueur where id_equipe = "+id_eq+";");
				String nom_joueur[];
				nom_joueur = new String[8];
				int i = 0;
				while(rs2.next()){
				    nom_joueur[i] = rs2.getString("nom_joueur");
					i++;
				}
				textFieldjoue1.setText(nom_joueur[0]);
				textFieldjoue2.setText(nom_joueur[1]);
				textFieldjoue3.setText(nom_joueur[2]);
				textFieldjoue4.setText(nom_joueur[3]);
				textFieldjoue5.setText(nom_joueur[4]);
				
				if(nom_joueur[5] != null){
					textFieldremp1.setText(nom_joueur[5]);
				}
				if(nom_joueur[6] != null){
					textFieldremp2.setText(nom_joueur[6]);
				}
				if(nom_joueur[7] != null){
					textFieldremp3.setText(nom_joueur[7]);
				}
				rs1.close();
				rs2.close();
				System.out.println("Recherche finit");
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("Erreur : "+e1);
				};	
			}
		});
		btnSeach.setBounds(201, 50, 131, 23);
		contentPane.add(btnSeach);
		btnSeach.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnSauvegarde = new JButton("Sauvegarde");
		btnSauvegarde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id_eq = '\''+textFieldideq.getText()+'\'';
				String nomeq = '\''+textFieldnomeq.getText()+'\'';
				String entrain ='\''+textFieldentraineq.getText()+'\'';
				String capitain = '\''+textFieldcapitaineq.getText()+'\'';
				
				String joue_1 = '\''+textFieldjoue1.getText()+'\'';
				String joue_2 = '\''+textFieldjoue2.getText()+'\'';
				String joue_3 = '\''+textFieldjoue3.getText()+'\'';
				String joue_4 = '\''+textFieldjoue4.getText()+'\'';
				String joue_5 = '\''+textFieldjoue5.getText()+'\'';
				
				String remp_1 = '\''+textFieldremp1.getText()+'\'';
				String remp_2 = '\''+textFieldremp2.getText()+'\'';
				String remp_3 = '\''+textFieldremp3.getText()+'\'';
				
				System.out.println("Modification .....");
				
				Connection con;
				try{
					con = DriverManager.getConnection("jdbc:mysql://localhost/tournois","root","");
					Statement stm = con .createStatement();
					
					stm.executeUpdate("Update equipe set nom_equipe = "+nomeq+",entraineur_equipe = "+entrain+", capitaine_equipe = "+capitain+" where id_equipe = "+id_eq+";");
					ResultSet res = stm.executeQuery("select id_joueur from joueur where id_equipe = "+id_eq+";");
					String id_joueur[];
					id_joueur = new String[8];
					int i = 0;
					while(res.next()){
						id_joueur[i] = res.getString("id_joueur");
						i++;
					}
					
					stm.executeUpdate("Update joueur set nom_joueur = "+joue_1+" , nom_equipe = "+nomeq+" where id_joueur = "+id_joueur[0]+";");
					stm.executeUpdate("Update joueur set nom_joueur = "+joue_2+" , nom_equipe = "+nomeq+" where id_joueur = "+id_joueur[1]+";");
					stm.executeUpdate("Update joueur set nom_joueur = "+joue_3+" , nom_equipe = "+nomeq+" where id_joueur = "+id_joueur[2]+";");
					stm.executeUpdate("Update joueur set nom_joueur = "+joue_4+" , nom_equipe = "+nomeq+" where id_joueur = "+id_joueur[3]+";");
					stm.executeUpdate("Update joueur set nom_joueur = "+joue_5+" , nom_equipe = "+nomeq+" where id_joueur = "+id_joueur[4]+";");
					
					if(id_joueur[5] != null){
						stm.executeUpdate("Update joueur set nom_joueur = "+remp_1+", nom_equipe = "+nomeq+" where id_joueur = "+id_joueur[5]+";");
					}else stm.executeUpdate("delete from joueur where id_joueur = "+id_joueur[5]+";");
					
					if(id_joueur[6] != null){
						stm.executeUpdate("Update joueur set nom_joueur = "+remp_2+" , nom_equipe = "+nomeq+" where id_joueur = "+id_joueur[6]+";");
					}else stm.executeUpdate("delete from joueur where id_joueur = "+id_joueur[6]+";");
					
					if(id_joueur[7] != null){
						stm.executeUpdate("Update joueur set nom_joueur = "+remp_3+", nom_equipe = "+nomeq+"  where id_joueur = "+id_joueur[7]+";");
					}else stm.executeUpdate("delete from joueur where id_joueur = "+id_joueur[7]+";");
					
					System.out.println("Modification finit");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("Erreur : "+e1);
				};
				
				
			}
		});
		btnSauvegarde.setBounds(27, 447, 119, 23);
		contentPane.add(btnSauvegarde);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(184, 447, 111, 23);
		contentPane.add(btnCancel);
	}
}
