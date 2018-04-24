package implementacion;
import java.util.ArrayList;
import java.util.HashMap;

import clases.Tile;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
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
	private ArrayList<Tile> tiles;

	private int[][] tilemap = {
			{3,1,1,1,1,2,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,3,1,1,1,1,2,0,0},
			{0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0}			
	};
	
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
	}
	
	public void crearObjetosJuego() {
		tiles = new ArrayList<Tile>();
		for (int i=0; i<tilemap.length; i++) {
			for (int j=0; j<tilemap[i].length; j++) {
				if (tilemap[i][j] != 0) {
					tiles.add(new Tile(j*70,i*70,"tilemap",tilemap[i][j]));
				}				
			}
		}
		
		//tile5 = new Tile(225,0,"tilemap",2);

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
		for (int i=0; i<tiles.size(); i++)
			tiles.get(i).pintar(graficos);
	}
	
	public void actualizar() {
		
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
