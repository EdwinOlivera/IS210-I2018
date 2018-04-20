package clases;

import java.util.Arrays;

public class Alumno extends Persona{
	private String cuenta;
	private float promedio;	

	public Alumno(
			String nombre, 
			String apellido, 
			int edad, 
			String genero, 
			String identidad, 
			Carrera carrera,
			String[] clases, 
			String cuenta, 
			float promedio
	) {
		super(nombre, apellido, edad, genero, identidad, carrera, clases);
		this.cuenta = cuenta;
		this.promedio = promedio;
	}

	public Alumno() {}
	
	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public float getPromedio() {
		return promedio;
	}


	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public void matricular() {}
	
	public void cancelarAsignatura() {}

	@Override
	public String mostrarInformacion() {
		System.out.println("Se ejecuto el metodo de la clase Alumno");
		return super.mostrarInformacion()+cuenta +","+promedio;
	}

	@Override
	public String toString() {
		return "Alumno [cuenta=" + cuenta + ", promedio=" + promedio + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", genero=" + genero + ", identidad=" + identidad + ", carrera=" + carrera
				+ ", clases=" + Arrays.toString(clases) + "]";
	}

	

}
