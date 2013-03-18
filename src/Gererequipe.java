import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Gererequipe extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gererequipe frame = new Gererequipe();
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
	public Gererequipe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 227, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnModifierUnquipe = new JButton("Modifier un \u00E9quipe");
		btnModifierUnquipe.setBounds(37, 90, 133, 23);
		contentPane.add(btnModifierUnquipe);
		
		JButton btnSupprimerUnquipe = new JButton("Supprimer un \u00E9quipe");
		btnSupprimerUnquipe.setBounds(37, 135, 133, 23);
		contentPane.add(btnSupprimerUnquipe);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(37, 179, 133, 23);
		contentPane.add(btnCancel);
		
		JButton btnNewButton = new JButton("Cr\u00E9er un \u00E9quipe");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Creerequipe();
				setVisible(false);
			}
		});
		btnNewButton.setBounds(37, 39, 133, 23);
		contentPane.add(btnNewButton);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
