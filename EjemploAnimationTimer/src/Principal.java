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

public class Principal extends Application{
	private Scene escena;
	private Group root;
	private Canvas lienzo;
	private GraphicsContext graficos;
	private int x=50;
	private int y=50;
	
	private boolean derecha;
	private boolean izquierda;
	private boolean arriba;
	private boolean abajo;
	private String nombreImagen = "goku-nimbus.png";
	private Image imagen;
	
	
	public static void main(String[] args) {
		launch(args);
	}

	//HashMap
	@Override
	public void start(Stage ventana){
		cargarImagenes();
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
		imagen = new Image("goku-nimbus.png");
	}
	
	public void cicloPrincipal() {
		long tiempoInicial = System.nanoTime();
		AnimationTimer animationTimer = new AnimationTimer() {
			@Override
			public void handle(long tiempoActualNanoSegundos) {
				//double deltaT = tiempoActualNanoSegundos - tiempoInicial;
				//System.out.println("deltaT: "+deltaT);
				pintar();
				mover();
			}			
		};
		animationTimer.start();
	}
	
	public void pintar() {
		graficos.fillRect(0, 0, 500, 500);
		graficos.drawImage(imagen, x, y);
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
			}
			}
		});
	}
	
	public void mover() {
		if (derecha)
			x+=10;
		
		if (izquierda)
			x-=10;
		
		if (arriba)
			y-=10;
		
		if (abajo)
			y+=10;
		
		if (x>=500)
			x=-120;
		
		if (y>=500)
			y=-120;
		
	}

}
