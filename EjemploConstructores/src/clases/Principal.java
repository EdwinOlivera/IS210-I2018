package clases;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Alumno a = new Alumno("2006123132","Juan","Perez",25, "Sistemas",90);
		Alumno b = new Alumno();
		System.out.println("Ingrese un nombre: ");
		b.setNombre(entrada.next());
		System.out.println(a.obtenerInformacionAlumno());
		System.out.println(b.obtenerInformacionAlumno());
	}

}
