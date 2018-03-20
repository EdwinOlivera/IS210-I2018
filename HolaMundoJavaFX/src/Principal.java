

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Principal  extends Application{
	private Scene escena;
	private Group nodoPrincipal;
	private Canvas lienzo;
	private GraphicsContext graphics; 
	
	public static void main(String[] args) {
			launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		//Stage es la clase de JavaFX que hace referencia a una ventana.
		primaryStage.setTitle("Hola Mundo");
		primaryStage.setResizable(false);
		primaryStage.setOpacity(0.9);
		primaryStage.show();
		
		nodoPrincipal = new Group(); 
		escena = new Scene(nodoPrincipal,500,500);
		//Enlazar escena con la ventana.
		primaryStage.setScene(escena);
		
		//Espacio para dibujar
		lienzo = new Canvas(500,500);
		nodoPrincipal.getChildren().add(lienzo);
		
		//Clase con funciones especiales para dibujo.
		graphics = lienzo.getGraphicsContext2D();
		dibujar();
		
	}
	
	
	public void dibujar() {
		//Fill: Funciones para dibujar con relleno
		//Stroke: Funciones para dibujar contornos
		graphics.setFill(Color.RED);
		graphics.fillRect(0, 0, 500, 500);
		graphics.setFill(Color.BLACK);
		graphics.fillRect(50, 50, 400, 400);
		graphics.setFill(Color.WHITE);
		graphics.setFont(new Font("Calibri",50));
		graphics.fillText("Hola Mundo", 100, 100);
		graphics.drawImage(new Image("goku-nimbus.png"), 200, 200);
		graphics.drawImage(new Image("goku-nimbus.gif"), 200, 300);
	}

}
