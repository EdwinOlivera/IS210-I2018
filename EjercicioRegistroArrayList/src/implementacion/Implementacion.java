package implementacion;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Alumno;

public class Implementacion {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		int opcion=0;
		do {
			System.out.println("1. Agregar un alumno\n"
					+ "2. Modificar un alumno\n"
					+ "3. Eliminar un alumno\n"
					+ "4. Mostrar registros\n"
					+ "0. Salir");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				//Crear una instancia del tipo alumno
				Alumno a = new Alumno();
				//Solitar la informacion
				a.solicitarInformacion(entrada);
				//Agregar la instancia al ArrayList
				alumnos.add(a);
				break;
			case 2:
				//Solicitar el indice que desea modificar
				System.out.println("¿Que registro desea modificar?");
				int indiceModificar = entrada.nextInt();
				Alumno alumnoSeleccionado = alumnos.get(indiceModificar);
				//Solitar de nuevo la informacion para el objeto seleccionado
				alumnoSeleccionado.solicitarInformacion(entrada);
				//Sustituir el objeto con set
				alumnos.set(indiceModificar, alumnoSeleccionado);
				break;
			case 4:
				System.out.println("----Alumnos Registrados----");
				for (Alumno alumno : alumnos) {
					System.out.println(alumno.toString());
				}
				break;
			default:
				break;
			}
		}while(opcion!=0);
		
		entrada.close();
	}
}
