package clases;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Principal extends Application {
	private Scene escena;
	private Canvas canvas;
	private GraphicsContext graficos;
	private int x=0;
	private int y=0;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ventana) throws Exception {		
		inicializarComponentes(ventana);
		gestionarEventos();	
		dibujar();
		ventana.show();
	}
	
	public void inicializarComponentes(Stage ventana) {
		ventana.setTitle("Eventos JavaFX");
		Group root = new Group();
		escena = new Scene(root,500,500);
		canvas = new Canvas(500,500);
		graficos = canvas.getGraphicsContext2D();
		ventana.setScene(escena);
		root.getChildren().add(canvas);
	}
	
	public void dibujar() {
		graficos.fillRect(x, y, 50, 50);
	}
	
	public void gestionarEventos() {
		escena.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				
				if (event.getCode().toString().equals("RIGHT")) {
					System.out.println("Tecla: "+event.getCode().toString());
					x+=5;
				}
			}
			
		});
		escena.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				System.out.println("Se dio click a la escena: " + event.getButton().name());
			}
			
		});
	}

}
