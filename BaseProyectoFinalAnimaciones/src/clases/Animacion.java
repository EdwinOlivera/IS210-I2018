package clases;

import javafx.scene.shape.Rectangle;

public class Animacion {
	private String nombreAnimacion;
	private int frameActual=0;
	private double duracion;
	private int cantidadFrames;
	private Rectangle[] coordenadasImagenes;
	
	public Animacion(String nombreAnimacion,double duracion, Rectangle coordenadasImagenes[]){
		this.duracion = duracion;
		this.nombreAnimacion = nombreAnimacion;
		this.coordenadasImagenes = coordenadasImagenes;
		cantidadFrames = this.coordenadasImagenes.length;
	}
	
	public Rectangle calcularFrameActual(double time) {
        this.frameActual = (int)((time % (cantidadFrames * duracion)) / duracion);
        System.out.println(this.frameActual);
        return coordenadasImagenes[this.frameActual];
    }
}
