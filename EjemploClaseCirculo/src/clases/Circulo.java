package clases;

/*
 * Modificadores
 * default: Miembros visibles dentro del mismo paquete
 * public: Miembros visibles desde cualquier lado
 * private: Miembros visibles solamente desde el interior de la clase. 
 * 
 * */

public class Circulo{
	private int x;
	private int y;
	private int diametro;
	private String color;
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double calcularArea(){
		return Math.PI * Math.pow((diametro/2),2);
	}
	
	void colorear(){		
	}
}

