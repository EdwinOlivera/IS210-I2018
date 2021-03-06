package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;

public class Tile {
	private int xImagen;
	private int yImagen;
	private int anchoImagen;
	private int altoImagen;
	//Coordenadas de en que parte del canvas se dibujara el tile
	private int x;
	private int y;
	private String indiceImagen;
	private int tipo; //1 
	
	public Tile(int xImagen, int yImagen, int anchoImagen, int altoImagen, int x, int y, String indiceImagen) {
		this.xImagen = xImagen;
		this.yImagen = yImagen;
		this.anchoImagen = anchoImagen;
		this.altoImagen = altoImagen;
		this.x = x;
		this.y = y;
		this.indiceImagen = indiceImagen;
	}
	
	
	public Tile(int x, int y, String indiceImagen, int tipo) {
		this.tipo = tipo;
		switch(this.tipo) {
			case 1: subImagen(491,558,70,70); break;
			case 2: subImagen(561,558,70,70); break;
			case 3: subImagen(560,698,70,70); break;	
		}
		
		this.x = x;
		this.y = y;
		this.indiceImagen = indiceImagen;
	}
	
	public void subImagen(int x, int y, int ancho, int alto) {
		this.xImagen = x;
		this.yImagen = y;
		this.anchoImagen = ancho;
		this.altoImagen = alto;
	}
	
	public int getxImagen() {
		return xImagen;
	}
	public void setxImagen(int xImagen) {
		this.xImagen = xImagen;
	}
	public int getyImagen() {
		return yImagen;
	}
	public void setyImagen(int yImagen) {
		this.yImagen = yImagen;
	}
	public int getAnchoImagen() {
		return anchoImagen;
	}
	public void setAnchoImagen(int anchoImagen) {
		this.anchoImagen = anchoImagen;
	}
	public int getAltoImagen() {
		return altoImagen;
	}
	public void setAltoImagen(int altoImagen) {
		this.altoImagen = altoImagen;
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
	public String getIndiceImagen() {
		return indiceImagen;
	}
	public void setIndiceImagen(String indiceImagen) {
		this.indiceImagen = indiceImagen;
	}
	
	public void pintar(GraphicsContext graficos) {
		graficos.drawImage(Juego.imagenes.get(indiceImagen), xImagen, yImagen, anchoImagen, altoImagen, x, y, anchoImagen, altoImagen);
	}
}
