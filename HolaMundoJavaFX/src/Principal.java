

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Principal  extends Application{

	public static void main(String[] args) {
			launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		//Stage es la clase de JavaFX que hace referencia a una ventana.
		primaryStage.setTitle("Hola Mundo");
		primaryStage.show();
		Group nodoPrincipal = new Group(); 
		Scene escena = new Scene(nodoPrincipal);
		//Enlazar escena con la ventana.
		primaryStage.setScene(escena);
		
		//Espacio para dibujar
		Canvas lienzo = new Canvas(500,500);
		nodoPrincipal.getChildren().add(lienzo);
		
		//Clase con funciones especiales para dibujo.
		GraphicsContext contexto = lienzo.getGraphicsContext2D();
	}

}
