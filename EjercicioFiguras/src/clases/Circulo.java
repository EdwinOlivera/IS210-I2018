package clases;

import javafx.scene.canvas.GraphicsContext;

public class Circulo extends Figura{
	public int radio;

	public Circulo(int x, int y, int radio) {
		super(x, y);
		this.radio = radio;
	}

	@Override
	public void dibujar(GraphicsContext graphics) {
		graphics.strokeOval(this.x, this.y, 2*this.radio, 2*this.radio);		
	}	
}
