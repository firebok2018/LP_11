package Controlador;

import java.sql.Connection;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import entidad.LectorDTO;
import util.MySqlConecta;

public class LectorDAO {
	
	public int registrar(LectorDTO reg){

		int valor=-1;
		Connection cn=null;
		PreparedStatement pstm=null;

		try{
		//1. Establecer la conexión
		cn=new MySqlConecta().getconectar();

		//2. Instrucción sql
		String sql="Insert Into tb_agenda values(null,?,?,?,?)";

		//3. Indicar la sentencia sql al objeto pstm
		pstm=cn.prepareStatement(sql);

		//4. Pasar los parametros
		pstm.setString(1, reg.getApellidos());
		pstm.setString(2, reg.getNombres());
		pstm.setString(3, reg.getDireccion());
		pstm.setInt(4, reg.getEdad());

		//5. Ejecutar la sentencia sql
		valor=pstm.executeUpdate();

		}catch(Exception e){
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "NOT Registrer");
		}

		return valor;
		}

}
