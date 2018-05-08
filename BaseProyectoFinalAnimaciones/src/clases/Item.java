package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;

public class Item {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int velocidad;
	private String indiceImagen;
	private boolean capturado;
	
	
	public Item(int x, int y, int velocidad, String indiceImagen) {
		this.x = x;
		this.y = y;
		this.velocidad = velocidad;
		this.indiceImagen = indiceImagen;
		this.ancho = (int)Juego.imagenes.get(this.indiceImagen).getWidth();
		this.alto = (int)Juego.imagenes.get(this.indiceImagen).getHeight();
	}
	
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

	public void mover() {
		
	}
	
	public Rectangle obtenerRectangulo() {
		return new Rectangle(this.x, this.y, this.ancho, this.alto);
	}
	
	public void pintar(GraphicsContext graficos) {
		if (this.capturado)
			return;
		
		graficos.strokeRect(this.x, this.y, this.ancho, this.alto);
		graficos.drawImage(Juego.imagenes.get(indiceImagen), x, y);
	}

	public boolean isCapturado() {
		return capturado;
	}

	public void setCapturado(boolean capturado) {
		this.capturado = capturado;
	}
}
