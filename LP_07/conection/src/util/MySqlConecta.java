package util;

import java.sql.*;

import javax.swing.JOptionPane;
public class MySqlConecta {
	
	public Connection getconectar(){
		
		Connection cn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdagenda","root","mysql");
			
			JOptionPane.showMessageDialog(null, "Conexion Existosa");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			JOptionPane.showInputDialog("null", "error");
		}
		return cn;
	}

}
