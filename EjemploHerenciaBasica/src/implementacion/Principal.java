package implementacion;

import clases.Alumno;

public class Principal {

	public static void main(String[] args) {
		Alumno a = new Alumno(
						"Juan","Perez",15,"M",
						"10064464","Ing Sistemas",
						null,
						"201512121221",
						70
				);

		
		System.out.println("Nombre del alumno: " + a.toString());
	}

}
