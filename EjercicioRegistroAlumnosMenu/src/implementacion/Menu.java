package implementacion;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import clases.Alumno;

public class Menu {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion=0;
		int cantidadAlumnos;
		Alumno alumnos[]=null;
		
		do {
			System.out.println(
					"----------------------------------\n"+
					"1. Ingresar alumnos\n"
					+ "2. Mostrar información actual\n"
					+ "0. Salir"+
					"\n----------------------------------"
			);
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("¿Cuantos alumnos registrará?");
				cantidadAlumnos = entrada.nextInt();
				alumnos = new Alumno[cantidadAlumnos];
				for (int i = 0; i<alumnos.length; i++) {		
					alumnos[i] = new Alumno();
					System.out.println("------Ingresar los datos del alumno " + i +"----");
					alumnos[i].ingresarInformacion(entrada);	
				}
				break;
			case 2:
				if (alumnos==null || alumnos.length==0)
					System.out.println("No hay alumnos registrados");
				else {
					System.out.println("Datos registrados:");
					for (int i = 0; i<alumnos.length; i++) 
						System.out.println(alumnos[i].obtenerInformacionAlumno());
				}
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		}while(opcion!=0);
		
		System.out.println("Fin del programa");
		
		entrada.close();
	}

}
