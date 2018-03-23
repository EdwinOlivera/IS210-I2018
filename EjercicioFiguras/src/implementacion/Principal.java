package implementacion;

import java.util.ArrayList;

import clases.Circulo;
import clases.Cuadrado;
import clases.Figura;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Principal extends Application{
	private Scene scene;
	private Group root;
	private Canvas lienzo;
	private GraphicsContext graphics;
	private ArrayList<Figura> figuras;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage){
		crearFiguras();
		stage.setTitle("Figuras");
		
		root = new Group();
		scene = new Scene(root, 600,600);
		stage.setScene(scene);
		lienzo = new Canvas(600,600);
		graphics = lienzo.getGraphicsContext2D();
		root.getChildren().add(lienzo);
		
		for(int i=0;i<figuras.size();i++)
			figuras.get(i).dibujar(graphics); //Poli(Varias)morfismo (Forma)
		
		stage.show();
	}
	
	public void crearFiguras() {
		figuras = new ArrayList<Figura>();
		figuras.add(new Circulo(100,150,50));
		figuras.add(new Circulo(150,200,50));
		figuras.add(new Circulo(200,250,50));
		figuras.add(new Circulo(250,300,50));
		figuras.add(new Circulo(300,350,50));
		
		figuras.add(new Cuadrado(300,300,150));
		figuras.add(new Cuadrado(300,300,200));
	}

}
