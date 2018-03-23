package clases;

import javafx.scene.canvas.GraphicsContext;

public class Rectangulo extends Cuadrado{
	private int lado2;

	public Rectangulo(int x, int y, int lado1, int lado2) {
		super(x, y, lado1);
		this.lado2 = lado2;
	}
	
	@Override
	public void dibujar(GraphicsContext graphics) {
		graphics.strokeRect(this.x, this.y, this.lado1, this.lado2);
	}
	
}
