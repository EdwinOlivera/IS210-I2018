package implementacion;

import java.util.Scanner;

import clases.Archivo;

public class Principal {

	public static void main(String[] args) {
		/*Fecha f  =new Fecha("12-15-2002");
		if (f.verificarFecha())
			System.out.println("Fecha correcta");
		else
			System.out.println("Fecha incorrecta");*/
		Scanner entrada = new Scanner(System.in);
		Archivo[] archivos;
		int opcion;
		int cantidadArchivos;
		System.out.println("¿Cuantos archivos desea ingresar?");
		cantidadArchivos = entrada.nextInt();
		
		archivos = new Archivo[cantidadArchivos];
		 for (int i=0; i<archivos.length; i++) {
			 archivos[i] = new Archivo();
			 archivos[i].ingresarInformacion(entrada);
		 }
		
		 do {
			System.out.println("1. Mostrar informacion\n"
					+ "2. Salir");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("--------Archivos registrados-------");	
				for(int i=0; i< archivos.length; i++) {
						System.out.println(archivos[i].toString());
					}
				break;
			case 2:
					System.out.println("Fin del programa");
				break;
			default:
				break;
			}
		 }while(opcion!=2);
	}

}
