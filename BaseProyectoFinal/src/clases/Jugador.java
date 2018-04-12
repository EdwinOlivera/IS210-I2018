package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;

public class Jugador {
	private int x;
	private int y;
	private int velocidad;
	private String indiceImagen;
	
	public Jugador(int x, int y, int velocidad, String indiceImagen) {
		this.x = x;
		this.y = y;
		this.velocidad = velocidad;
		this.indiceImagen = indiceImagen;
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
		if (Juego.accion) {
			this.velocidad = 20;
			this.indiceImagen = "goku2";
		}else {
			this.velocidad = 10;
			this.indiceImagen = "goku1";
		}
		
		
		if (Juego.derecha)
			x+=velocidad;
		
		if (Juego.izquierda)
			x-=velocidad;
		
		if (Juego.arriba)
			y-=velocidad;
		
		if (Juego.abajo)
			y+=velocidad;
		
		if (x>=500)
			x=-120;
		
		if (y>=500)
			y=-120;
		
	}
	
	public void pintar(GraphicsContext graficos) {
		graficos.drawImage(Juego.imagenes.get(indiceImagen), x, y);
	}
}
