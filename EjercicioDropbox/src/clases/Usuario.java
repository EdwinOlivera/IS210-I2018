//Clase Plain Old Java Object (POJO)

package clases;

public class Usuario {
	private String nombreUsuario;
	private String correoElectronico;
	
	public Usuario(String nombreUsuario, String correoElectronico) {
		this.nombreUsuario = nombreUsuario;
		this.correoElectronico = correoElectronico;
	}
	
	public Usuario() {}

	public boolean verficarCorreo() {
		if (this.nombreUsuario.contains("@") && (this.nombreUsuario.indexOf("@")==this.nombreUsuario.lastIndexOf("@")))
			return true;
			
		return false;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", correoElectronico=" + correoElectronico + "]";
	}
		
}
