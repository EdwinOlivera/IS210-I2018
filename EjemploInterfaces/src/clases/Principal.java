package clases;

import interfaces.SerVivo;

public class Principal {
	
	public Principal() {
		Humano u = new Humano();
		
		SerVivo sv = new SerVivo() {

			@Override
			public void vivir() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void morir() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void reproducir() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
		//Esto es equivalente al bloque anterior, con la salvedad de 
		//que se ahorro la creacion de un archivo
		NuevaClase nc = new NuevaClase();
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
