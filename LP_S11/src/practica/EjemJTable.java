package practica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.plaf.metal.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class EjemJTable extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JTable table;
	private JButton btnInsertar;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiDefaultTheme");

		} catch (Exception e) {
			// TODO: handle exception
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemJTable frame = new EjemJTable();
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
	public EjemJTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 79, 414, 223);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Jugador", "Puntaje","Niveles"
			}
		));
		scrollPane.setViewportView(table);
		
		int numCola=table.getModel().getColumnCount();
		Object [] fila= new Object[numCola];
		fila[0]="Dominic";
		fila[1]="420";
		fila[2]="hard";
		((DefaultTableModel) table.getModel()).addRow(fila);
		
		DefaultTableModel modelo= new DefaultTableModel();
		JTable table= new JTable(modelo);
		
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.addMouseListener(this);
		btnInsertar.addActionListener(this);
		btnInsertar.setBounds(171, 11, 89, 23);
		contentPane.add(btnInsertar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnInsertar) {
			actionPerformedBtnInsertar(arg0);
		}
	}
	protected void actionPerformedBtnInsertar(ActionEvent arg0) {
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnInsertar) {
			mouseClickedBtnInsertar(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedBtnInsertar(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "sadas");
	}
}
