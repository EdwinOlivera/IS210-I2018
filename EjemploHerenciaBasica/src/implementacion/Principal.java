package implementacion;

import clases.Alumno;

public class Principal {

	public static void main(String[] args) {
		Alumno a = new Alumno();
		a.setNombre("Juan");
		System.out.println("Nombre del alumno: " + a.getNombre());
	}

}
