package clases;

import javafx.scene.canvas.GraphicsContext;

public class Cuadrado extends Figura{
	protected int lado1;
	
	
	public Cuadrado(int x, int y, int lado1) {
		super(x, y);
		this.lado1 = lado1;
	}

	@Override
	public void dibujar(GraphicsContext graphics) {
			graphics.strokeRect(this.x, this.y, lado1, lado1);
	}
}
