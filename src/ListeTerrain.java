import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.SystemColor;


public class ListeTerrain {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListeTerrain window = new ListeTerrain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListeTerrain() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 403, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] entetes = {"Prénom", "Nom"};
		Object[][] donnees = {
                {"Johnathan", "Sykes"},
                {"Nicolas", "Van de Kampf"},
                {"Damien", "Cuthbert"},
                {"Corinne", "Valance"},
                {"Emilie", "Schrödinger"},
                {"Delphine", "Duke"},
                {"Eric", "Trump"},
        };
		table = new JTable(donnees,entetes);
		table.setBackground(SystemColor.controlHighlight);
		//getContentPane().add(table.getTableHeader(), BorderLayout.NORTH);
        //getContentPane().add(table, BorderLayout.CENTER);
		table.setBounds(46, 50, 298, 140);
		frame.getContentPane().add(table);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new fenetreTerrain();
				frame.setVisible(false);
			}
		});
		btnRetour.setBounds(142, 11, 89, 23);
		frame.getContentPane().add(btnRetour);
	}
}
