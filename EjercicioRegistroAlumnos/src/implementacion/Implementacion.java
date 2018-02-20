package implementacion;

import java.util.Scanner;

import clases.Alumno;

public class Implementacion {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//tipoDato nombreArreglo[] = new TipoDato[tamaño];
		/*int enteros[] = new int[20];*/
		Alumno alumnos[] = new Alumno[3];//Aqui no se esta instanciando, solo se reserva espacio en memoria para 3 objetos del tipo Alumno
		//Instanciar cada uno de los elementos del arreglo
		/*for (int i = 0; i<alumnos.length; i++)
			alumnos[i] = new Alumno();*/
		
		
		for (int i = 0; i<alumnos.length; i++) {
			
			alumnos[i] = new Alumno();
			System.out.println("------Ingresar los datos del alumno " + i +"----");
			System.out.print("Ingrese su cuenta: ");
			alumnos[i].setCuenta(entrada.next());
			System.out.print("Ingrese su nombre: ");
			alumnos[i].setNombre(entrada.next());
			System.out.print("Ingrese su apellido: ");
			alumnos[i].setApellido(entrada.next());
			System.out.print("Ingrese su edad: ");
			alumnos[i].setEdad(entrada.nextInt());
			System.out.print("Ingrese su carrera: ");
			alumnos[i].setCarrera(entrada.next());
			System.out.print("Ingrese su promedio: ");
			alumnos[i].setPromedio(entrada.nextFloat());	
		}
		
		
		System.out.println("Datos registrados:");
		for (int i = 0; i<alumnos.length; i++) 
			System.out.println(alumnos[i].obtenerInformacionAlumno());
		
		entrada.close();
	}
}
