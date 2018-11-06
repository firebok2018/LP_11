package entidad;

public class LectorDTO {
	
	private int codigo;
	private String apellidos;
	private String nombres;
	private String direccion;
	private int edad;
	
	
	public LectorDTO(int codigo, String apellidos, String nombres, String direccion, int edad) {
		super();
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.direccion = direccion;
		this.edad = edad;
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	
	
	

}
