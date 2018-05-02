package implementacion;
import java.util.ArrayList;
import java.util.HashMap;

import clases.Fondo;
import clases.Item;
import clases.Jugador;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Juego extends Application{
	private Scene escena;
	private Group root;
	private Canvas lienzo;
	private GraphicsContext graficos;
	
	public static boolean derecha;
	public static boolean izquierda;
	public static boolean arriba;
	public static boolean abajo;
	public static boolean accion;
	
	//Hashmap es una coleccion similar a ArrayList pero utiliza indices tipo objeto
	public static HashMap<String,Image> imagenes;
	private Jugador jugador;
	private Fondo fondo1;
	private Fondo fondo2;
	private ArrayList<Item> items;
	
	public static void main(String[] args) {
		launch(args);
	}

	//HashMap
	@Override
	public void start(Stage ventana){
		cargarImagenes();
		crearObjetosJuego();
		ventana.setTitle("Animation Timer");
		root = new Group();
		escena = new Scene(root,500,500);
		registrarEventos();
		lienzo = new Canvas(500,500);
		graficos = lienzo.getGraphicsContext2D();
		ventana.setScene(escena);
		root.getChildren().add(lienzo);
		cicloPrincipal();
		ventana.show();
	}
	
	public void cargarImagenes() {
		imagenes = new HashMap<String,Image>();
		//Utilizar la funcion put para almacenar un elemento en la coleccion
		imagenes.put("goku1", new Image("goku-nimbus.png"));
		imagenes.put("goku2", new Image("goku-ultra-instinto-nimbus.png"));
		imagenes.put("fondo1", new Image("background.jpg"));
		imagenes.put("fondo2", new Image("background2.jpg"));
		imagenes.put("tilemap", new Image("tilemap.png"));
		imagenes.put("item", new Image("item.png"));
	}
	
	public void crearObjetosJuego() {
		items = new ArrayList<Item>();
		jugador = new Jugador(50,50,10, "goku1");
		fondo1 = new Fondo(0,0,5,"fondo1");
		fondo2 = new Fondo((int)imagenes.get("fondo1").getWidth(),0,5,"fondo2");
		items.add(new Item(300,320,0,"item"));
		items.add(new Item(350,320,0,"item"));
		items.add(new Item(400,320,0,"item"));
		items.add(new Item(450,320,0,"item"));
		items.add(new Item(500,320,0,"item"));
	}
	
	public void cicloPrincipal() {
		long tiempoInicial = System.nanoTime();
		AnimationTimer animationTimer = new AnimationTimer() {
			@Override
			public void handle(long tiempoActualNanoSegundos) {
				//double deltaT = tiempoActualNanoSegundos - tiempoInicial;
				//System.out.println("deltaT: "+deltaT);
				pintar();
				actualizar();
				
			}			
		};
		animationTimer.start();
	}
	
	public void pintar() {
		graficos.fillRect(0, 0, 500, 500);
		fondo1.pintar(graficos);
		fondo2.pintar(graficos);
		jugador.pintar(graficos);
		for (int i=0; i<items.size();i++)
			items.get(i).pintar(graficos);
		graficos.setFont(new Font(30));
		graficos.fillText(String.valueOf(jugador.getPuntuacion()), 10d, 30d);
	}
	
	public void actualizar() {
		jugador.mover();
		fondo1.mover();
		fondo2.mover();
		cambiarFondos();
		
		for (int i=0; i<items.size();i++) {
			if (jugador.verificarColision(items.get(i)))
				items.remove(items.get(i));
			
		}
		
		for (int i=0; i<items.size();i++)
			items.get(i).mover();
		
	}
	
	public void cambiarFondos() {
		if (fondo2.getX() <= 0) {
			fondo1.setX((int)imagenes.get("fondo2").getWidth()+fondo2.getX());
		}
		
		if (fondo1.getX() <= 0) {
			fondo2.setX((int)imagenes.get("fondo1").getWidth()+fondo1.getX());
		}
	}
	public void registrarEventos() {
		escena.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode().toString()) {
					case "RIGHT":
						derecha = true;
						break;
					case "LEFT":
						izquierda = true;
						break;
					case "UP":
						arriba = true;
						break;
					case "DOWN":
						abajo = true;
						break;
					case "SPACE":
						accion = true;
						break;
				}
			}
		});
		
		escena.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode().toString()) {
				case "RIGHT":
					derecha = false;
					break;
				case "LEFT":
					izquierda = false;
					break;
				case "UP":
					arriba = false;
					break;
				case "DOWN":
					abajo = false;
					break;
				case "SPACE":
					accion = false;
					break;
			}
			}
		});
	}
}
