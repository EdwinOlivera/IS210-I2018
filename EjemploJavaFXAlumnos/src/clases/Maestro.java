package clases;

import java.util.ArrayList;

public class Maestro extends Persona {
	private double sueldo;
	private String codigoEmpleado;
	public Maestro(String nombre, String apellido, int edad, String genero, String identidad, Carrera carrera,
			ArrayList<String> clases, double sueldo, String codigoEmpleado) {
		super(nombre, apellido, edad, genero, identidad, carrera, clases);
		this.sueldo = sueldo;
		this.codigoEmpleado = codigoEmpleado;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	@Override
	public String toString() {
		return "Maestro [sueldo=" + sueldo + ", codigoEmpleado=" + codigoEmpleado + "]";
	}
}
