package practica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class registroSearch extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNomAPE;
	private JTextField textField;
	private JTable table;
	private DefaultTableModel modelo;
	private JButton btnEjecutar;
	private TableRowSorter trsfiltro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registroSearch frame = new registroSearch();
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
	public registroSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseNombreY = new JLabel("Ingrese nombre y apellido");
		lblIngreseNombreY.setBounds(34, 26, 288, 14);
		contentPane.add(lblIngreseNombreY);
		
		
		txtNomAPE = new JTextField();
		txtNomAPE.setBounds(34, 51, 326, 20);
		contentPane.add(txtNomAPE);
		txtNomAPE.setColumns(10);
		txtNomAPE.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e){
				String x= (txtNomAPE.getText());
				txtNomAPE.setText((x));
				repaint();
				filtro();
			}
		});
		
		
		
		JLabel lblIngresId = new JLabel("ingres ID");
		lblIngresId.setBounds(34, 83, 46, 14);
		contentPane.add(lblIngresId);
		
		textField = new JTextField();
		textField.setBounds(34, 108, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnEjecutar = new JButton("Ejecutar");
		btnEjecutar.addActionListener(this);
		btnEjecutar.setBounds(191, 91, 89, 23);
		contentPane.add(btnEjecutar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 148, 648, 244);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		modelo=new DefaultTableModel();
		modelo.addColumn("ID");
		modelo.addColumn("Apellido");
		modelo.addColumn("Nombre");
		modelo.addColumn("Direecion");
		modelo.addColumn("Edad");
		modelo.addColumn("Fecha Nacimiento");
		table.setModel(modelo);
		listar();
		TableRowSorter trsfiltro = new TableRowSorter(table.getModel());
		 table.setRowSorter(trsfiltro);
	}

	private void listar() {
		// TODO Auto-generated method stub
		modelo.setRowCount(0);
		String a[]={"1","Alcazar","Manuel","Calle Tucuman","25","2018-08-23"};
		String b[]={"2","Gonzales","Patricia","Av. independencia","33","2018-01-05"};
		String c[]={"3","Gonzales","Sergio","URb. Bancarios","23","2015-08-23"};
		String d[]={"4","Holguin","Rachel","Calle Moquegua","35","2014-10-30"};
		String f[]={"5","Salas","Dominic","Av. goyeneche","41","2014-12-02"};
		
		modelo.addRow(a);
		modelo.addRow(b);
		modelo.addRow(c);
		modelo.addRow(d);
		modelo.addRow(f);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEjecutar) {
			actionPerformedBtnEjecutar(arg0);
		}
	}
	protected void actionPerformedBtnEjecutar(ActionEvent arg0) {
		String ape=txtNomAPE.getText();

		
	}
	
	public void filtro() {
		String filtro = txtNomAPE.getText();
		trsfiltro.setRowFilter(RowFilter.regexFilter(txtNomAPE.getText(), 0));
		}
}
