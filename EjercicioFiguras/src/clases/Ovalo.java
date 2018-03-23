package clases;

import javafx.scene.canvas.GraphicsContext;

public class Ovalo extends Circulo{
	private int radio2;

	public Ovalo(int x, int y, int radio, int radio2) {
		super(x, y, radio);
		this.radio2 = radio2;
	}

	public int getRadio2() {
		return radio2;
	}

	public void setRadio2(int radio2) {
		this.radio2 = radio2;
	}
	
	@Override
	public void dibujar(GraphicsContext graphics) {
		graphics.strokeOval(this.x, this.y, 2*this.radio, 2*this.radio2);
	}
}
