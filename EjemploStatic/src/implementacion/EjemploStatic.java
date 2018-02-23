package implementacion;

import clases.PersonajeJuego;

public class EjemploStatic {

	public static void main(String[] args) {
		
		PersonajeJuego.nombreJuego = "Fifa";
		
		PersonajeJuego p = new PersonajeJuego();
		PersonajeJuego p1 = new PersonajeJuego();
		PersonajeJuego p2 = new PersonajeJuego();
		
		p.nombreJuego = "WOW";
		p1.nombreJuego = "Tetris";
		p2.nombreJuego = "Mario";
		
		System.out.println("P: " + p.nombreJuego);
		System.out.println("P1: " + p1.nombreJuego);
		System.out.println("P_2: " + p2.nombreJuego);
		System.out.println("Nombre clase: " + PersonajeJuego.nombreJuego);
		
	}

}
