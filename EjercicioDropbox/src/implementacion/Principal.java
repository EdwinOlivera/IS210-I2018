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
		int cantidadArchivos;
		System.out.println("¿Cuantos archivos desea ingresar?");
		cantidadArchivos = entrada.nextInt();
		
		archivos = new Archivo[cantidadArchivos];
		 for (int i=0; i<archivos.length; i++) {
			 archivos[i] = new Archivo();
			 
		 }
		
	}

}
