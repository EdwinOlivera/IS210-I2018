package clases;

import java.util.HashMap;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;

public class Jugador {
	private int x;
	private int y;
	private int velocidad;
	private String indiceImagen;
	private int puntuacion = 0;
	private int ancho;
	private int alto;
	private int vidas=2;
	
	private int xImagen;
	private int yImagen;
	private int anchoImagen;
	private int altoImagen;
	private HashMap<String, Animacion> animaciones;
	private String animacionActual;
	private int orientacion = 1;//1: Viendo hacia la derecha, -1 Viendo hacia la izquierda
	
	public Jugador(int x, int y, int velocidad, String indiceImagen, String animacionActual) {
		animaciones = new HashMap<String, Animacion>();
		this.x = x;
		this.y = y;
		this.animacionActual =  animacionActual;
		this.velocidad = velocidad;
		this.indiceImagen = indiceImagen;
		inicializarAnimaciones();
		//this.ancho = (int)Juego.imagenes.get(this.indiceImagen).getWidth();
		//this.alto = (int)Juego.imagenes.get(this.indiceImagen).getHeight();
	}
	
	
	public void inicializarAnimaciones() {
		Rectangle[] coordenadasCorrer = {
				new Rectangle(13, 229, 75,68),
				new Rectangle(100,229, 75,68),
				new Rectangle(171,229, 75,68),
				new Rectangle(230,229, 75,68),
				new Rectangle(287,224, 75,73),
				new Rectangle(423,229, 75,68),
				new Rectangle(500,229, 75,68),
				new Rectangle(576,229, 75,68),
				new Rectangle(640,229, 75,68),
				new Rectangle(699,229, 75,68),
				new Rectangle(764,229, 75,68),
				new Rectangle(836,229, 75,73),
				new Rectangle(907,229, 75,68)
			};
		
		animaciones.put("correr",new Animacion("correr",0.07,coordenadasCorrer));
		
		Rectangle[] coordenadasDescanso = {
				new Rectangle(26, 16, 63,73),
				new Rectangle(89,16, 63,73),
				new Rectangle(154,16, 63,73),
				new Rectangle(226,16, 63,73)
			};
		
		animaciones.put("descanso",new Animacion("descanso",0.07,coordenadasDescanso));
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
			this.indiceImagen = "megaman";
		}else {
			this.velocidad = 3;
			this.indiceImagen = "megaman";
		}
		
		this.animacionActual = "descanso";
		if (Juego.derecha) {
			x+=velocidad;
			this.animacionActual = "correr";
			this.orientacion = 1;
		}
		
		if (Juego.izquierda) {
			x-=velocidad;
			this.animacionActual = "correr";
			this.orientacion = -1;
		}
		
		/*if (Juego.arriba)
			y-=velocidad;
		
		if (Juego.abajo)
			y+=velocidad;*/
		
		if (x>=500)
			x=-120;
		
		if (y>=500)
			y=-120;
		
	}
	
	public void actualizarAnimacion(double time) {
		Rectangle rectanguloActual = animaciones.get(animacionActual).calcularFrameActual(time);
		this.xImagen = (int)rectanguloActual.getX();
		this.yImagen = (int)rectanguloActual.getY();
		this.anchoImagen = (int)rectanguloActual.getWidth();
		this.altoImagen = (int)rectanguloActual.getHeight();
	}
	
	public void pintar(GraphicsContext graficos) {		
		graficos.drawImage(Juego.imagenes.get(indiceImagen), xImagen, yImagen, anchoImagen, altoImagen, x, y, (orientacion)*anchoImagen, altoImagen);
		//graficos.strokeRect(this.x+20, this.y, (this.anchoImagen-30), this.altoImagen);
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public Rectangle obtenerRectangulo() {
		return new Rectangle(this.x+20, this.y, this.anchoImagen-30, this.altoImagen);
	}
	
	public void agregarPuntuacion(int puntuacion) {
		this.puntuacion+=puntuacion;
	}
	
	public boolean verificarColision(Item item) {
		if (obtenerRectangulo().intersects(item.obtenerRectangulo().getBoundsInLocal()) && !item.isCapturado()) {
			item.setCapturado(true);
			/*
			 if (item instanceof Vida)
				agregarVida();
			else if (item instanceof Moneda)
				agregarPuntuacion();
			*/
			
			agregarPuntuacion(1);
			System.out.println("Colisionaron");
			
			return true;
		}
		
		return false;
	}
	
	
}
