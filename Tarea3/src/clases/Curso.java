package clases;

import java.util.ArrayList;

public class Curso {
	private String nombreCurso;
	private String descripcion;
	private Usuario instructor;
	private ArrayList<Usuario> estudiantes; // = new ArrayList<Usuario>();
	private String cupos;
	
	public Curso(String nombreCurso, String descripcion, Usuario instructor, ArrayList<Usuario> estudiantes,
			String cupos) {
		this.nombreCurso = nombreCurso;
		this.descripcion = descripcion;
		this.instructor = instructor;
		this.estudiantes = estudiantes;
		this.cupos = cupos;
	}

	public Curso() {
		///this.estudiantes = new ArrayList<Usuario>();
	}
	
	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getInstructor() {
		return instructor;
	}

	public void setInstructor(Usuario instructor) {
		this.instructor = instructor;
	}

	public ArrayList<Usuario> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Usuario> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getCupos() {
		return cupos;
	}

	public void setCupos(String cupos) {
		this.cupos = cupos;
	}
	
	public void agregarEstudiante(Usuario usuario) {
		if (this.estudiantes==null)
			this.estudiantes = new ArrayList<Usuario>();
		this.estudiantes.add(usuario);
	}

	public String toString() {
		return "Curso [nombreCurso=" + nombreCurso + ", descripcion=" + descripcion + ", instructor=" + instructor
				+ ", estudiantes=" + estudiantes + ", cupos=" + cupos + "]";
	}

}
