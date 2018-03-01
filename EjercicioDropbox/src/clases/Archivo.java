package clases;

import java.util.Arrays;
import java.util.Scanner;

public class Archivo {
	private String nombreArchivo;
	private int tamanioBytes;
	private Usuario usuario;
	private Usuario[] usuarios;
	private String nombreCarpeta;
	private Fecha fechaModificacion;
	private Fecha fechaSubida;
	
	public Archivo(
			String nombreArchivo, 
			int tamanioBytes, 
			Usuario usuario, 
			Usuario[] usuarios, 
			String nombreCarpeta,
			Fecha fechaModificacion, 
			Fecha fechaSubida
		) {
		this.nombreArchivo = nombreArchivo;
		this.tamanioBytes = tamanioBytes;
		this.usuario = usuario;
		this.usuarios = usuarios;
		this.nombreCarpeta = nombreCarpeta;
		this.fechaModificacion = fechaModificacion;
		this.fechaSubida = fechaSubida;
	}

	public Archivo() {}
		
	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public int getTamanioBytes() {
		return tamanioBytes;
	}

	public void setTamanioBytes(int tamanioBytes) {
		this.tamanioBytes = tamanioBytes;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	public String getNombreCarpeta() {
		return nombreCarpeta;
	}

	public void setNombreCarpeta(String nombreCarpeta) {
		this.nombreCarpeta = nombreCarpeta;
	}

	public Fecha getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Fecha fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Fecha getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(Fecha fechaSubida) {
		this.fechaSubida = fechaSubida;
	}
	
	public boolean verificarTamanio() {
		if (this.tamanioBytes <= 500*1024*1024)
			return true;
		
		return false;
	}
	
	public boolean verificarExtension() {
		if (this.nombreArchivo.contains(".bat") || this.nombreArchivo.contains(".exe"))
			return false;
		
		return true;
	}
	
	public void ingresarInformacion(Scanner entrada) {
		do {
			System.out.println("Nombre archivo: ");
			this.nombreArchivo = entrada.next();
		}while(!this.verificarExtension());
		
		do {
			System.out.println("Tamaño en bytes: ");
			this.tamanioBytes = entrada.nextInt();
		}while(this.verificarTamanio() == false);
		
		this.usuario = new Usuario();
		this.usuario.ingresarInformacion(entrada);
		int cantidadUsuariosComparte =0;
		do {
			System.out.println("¿Con cuantos usuarios desea compartir el archivo?");
			cantidadUsuariosComparte = entrada.nextInt();
		}while (cantidadUsuariosComparte>5 && cantidadUsuariosComparte<0);
		
		usuarios = new Usuario[cantidadUsuariosComparte];
		for (int i = 0; i<this.usuarios.length; i++) {
			usuarios[i] = new Usuario();
			System.out.println("*Ingresar datos de usuario " +  (i+1));
			usuarios[i].ingresarInformacion(entrada);
		}
		System.out.println("Nombre carpeta: ");
		this.nombreCarpeta = entrada.next();
		
		do {
			System.out.println("Fecha de modificacion (DD-MM-YYYY): ");
			this.fechaModificacion = new Fecha(entrada.next());
		}while(this.fechaModificacion.verificarFecha() == false);
		
		do {
			System.out.println("Fecha de subida (DD-MM-YYYY): ");
			this.fechaSubida = new Fecha(entrada.next());
		}while(!this.fechaSubida.verificarFecha());
	}

	@Override
	public String toString() {
		return "Archivo [nombreArchivo=" + nombreArchivo + ", tamanioBytes=" + tamanioBytes + ", usuario=" + usuario.toString()
				+ ", usuarios=" + Arrays.toString(usuarios) + ", nombreCarpeta=" + nombreCarpeta
				+ ", fechaModificacion=" + fechaModificacion + ", fechaSubida=" + fechaSubida + "]";
	}
	
	
	
}
