package clases;

import java.util.ArrayList;
import java.util.Arrays;

public class Persona extends Object{
	protected String nombre;
	protected String  apellido;
	protected int edad;
	protected String genero;
	protected String identidad;
	protected Carrera carrera;
	protected ArrayList<String> clases;
	
	public Persona(String nombre, String apellido, int edad, String genero, String identidad, Carrera carrera,
			ArrayList<String> clases) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.identidad = identidad;
		this.carrera = carrera;
		this.clases = clases;
	}
	
	public Persona() {}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public ArrayList<String> getClases() {
		return clases;
	}

	public void setClases(ArrayList<String> clases) {
		this.clases = clases;
	}

	public void aprobar() {}
	public void reprobar() {}
	
	public String mostrarInformacion() {
		System.out.println("Se ejecuto el metodo de la clase Persona");
		return nombre + ","+apellido +","+carrera;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", identidad=" + identidad + ", carrera=" + carrera + ", clases=" + clases + "]";
	}
	
	
}
