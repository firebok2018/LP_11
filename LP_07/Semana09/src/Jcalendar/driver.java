package Jcalendar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda","root","mysql");
			
			Statement myStmt=myConn.createStatement();
			
			ResultSet myRs=myStmt.executeQuery("select*from PRODUCTO");
			
			while (myRs.next()) {
				System.out.println(myRs.getString("CATEGORIA")+", "+myRs.getString("NOMBRES"));
				
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error");
		}
	}

}
