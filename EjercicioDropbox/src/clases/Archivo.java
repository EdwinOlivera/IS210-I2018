package clases;

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
	
}
