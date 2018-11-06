package vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import Controlador.*;
import entidad.LectorDTO;

public class Registro extends JFrame implements ActionListener {
	
	LectorDAO obj = new LectorDAO();

	private JPanel contentPane;
	private JLabel lblIdagenda;
	private JTextField txtID;
	private JLabel lblApellidos;
	private JTextField txtApellidos;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblDireccion;
	private JTextField txtDireccion;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JButton btnRegistrar;
	private JButton btnSalir;
	private JLabel lblMantenimientoDeAgenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblIdagenda = new JLabel("ID_Agenda");
		lblIdagenda.setBounds(66, 45, 84, 14);
		contentPane.add(lblIdagenda);
		
		txtID = new JTextField();
		txtID.setBounds(146, 42, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(66, 76, 46, 14);
		contentPane.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(146, 73, 226, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(66, 105, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(146, 104, 226, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(66, 142, 46, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(146, 139, 226, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(66, 177, 46, 14);
		contentPane.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(146, 170, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(89, 227, 89, 23);
		contentPane.add(btnRegistrar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(272, 227, 89, 23);
		contentPane.add(btnSalir);
		
		lblMantenimientoDeAgenda = new JLabel("Mantenimiento de Agenda");
		lblMantenimientoDeAgenda.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMantenimientoDeAgenda.setBounds(105, 11, 220, 14);
		contentPane.add(lblMantenimientoDeAgenda);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(arg0);
		}
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);
		}
	}
	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		
		System.exit(0);
	}
	protected void actionPerformedBtnRegistrar(ActionEvent arg0) {
		LectorDTO reg=new LectorDTO(0,txtApellidos.getText(),txtNombre.getText(),txtDireccion.getText(),Integer.parseInt(txtEdad.getText()));
		int valor=obj.registrar(reg);
		if(valor==1){
		JOptionPane.showMessageDialog(null, "Se ingreso el día");
		}else{
		JOptionPane.showMessageDialog(null, "Error");
		}
	
	}
}
