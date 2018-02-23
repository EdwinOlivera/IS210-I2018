package clases;

import java.util.Scanner;

public class Alumno {
	private String cuenta;
	private String nombre;
	private String apellido;
	private int edad;
	private String carrera;
	private float promedio;
	
	public Alumno(
			String cuenta,
			String nombre,
			String apellido,
			int edad,
			String carrera,
			float promedio
	) {
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.carrera = carrera;
		this.promedio = promedio;
		System.out.println("Se ejecuto el constructor");
	}
	
	public Alumno() {}
	
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
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
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public float getPromedio() {
		return promedio;
	}
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	
	public String obtenerInformacionAlumno() {
		return cuenta + "\t" +  nombre + "\t" + apellido + "\t" +
				edad + "\t" + carrera + "\t" + promedio;
	}
	
	public void ingresarInformacion(Scanner entrada) {
		System.out.print("Ingrese su cuenta: ");
		setCuenta(entrada.next());
		System.out.print("Ingrese su nombre: ");
		setNombre(entrada.next());
		System.out.print("Ingrese su apellido: ");
		setApellido(entrada.next());
		System.out.print("Ingrese su edad: ");
		setEdad(entrada.nextInt());
		System.out.print("Ingrese su carrera: ");
		setCarrera(entrada.next());
		System.out.print("Ingrese su promedio: ");
		setPromedio(entrada.nextFloat());
	}
}
