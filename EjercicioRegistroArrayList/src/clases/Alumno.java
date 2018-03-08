package clases;

import java.util.Scanner;

public class Alumno {
	private String cuenta;
	private String nombre;
	private String apellido;
	private int edad;
	private String carrera;
	private float promedio;
	
	public Alumno(String cuenta, String nombre, String apellido, int edad, String carrera, float promedio) {
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.carrera = carrera;
		this.promedio = promedio;
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
	
	public String toString() {
		return cuenta + "\t" +  nombre + "\t" + apellido + "\t" +
				edad + "\t" + carrera + "\t" + promedio;
	}
	
	public void solicitarInformacion(Scanner entrada) {
		
		System.out.println("Cuenta "+((this.cuenta!=null)?"(Cuenta anterior: "+this.cuenta+")":""));
		/*if (this.cuenta!=null)
			System.out.println("(Cuenta anterior: "+this.cuenta+")");*/
		this.cuenta = entrada.next();
		
		System.out.println("Nombre "+((this.nombre!=null)?"(Nombre anterior: "+this.nombre+")":""));
		this.nombre = entrada.next();
		System.out.println("Apellido " + ((this.apellido!=null)?"(Apellido anterior:"+this.apellido+" )":""));
		this.apellido = entrada.next();
		System.out.println("Edad: ");
		this.edad = entrada.nextInt();
		System.out.println("Carrera: ");
		this.carrera = entrada.next();
		System.out.println("Promedio: ");
		this.promedio = entrada.nextFloat();
	}
}
