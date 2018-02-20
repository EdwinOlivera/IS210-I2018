package implementacion;

import clases.Circulo;

public class Implementacion {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		//circulo.x = 10;
		circulo.setX(10);
		circulo.setY(15);
		circulo.setDiametro(30);
		
		System.out.println("X: " + circulo.getX());	
		System.out.println("Y: " + circulo.getY());
		System.out.println("Diametro: " + circulo.getDiametro());
		System.out.println("Area: " + circulo.calcularArea());		

	}

}
