import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploEscritura {
	public EjemploEscritura(){
		//Flujos basados en caracteres
		try {
			//for(int i=0; i<1000;i++) {
				BufferedWriter archivo = new BufferedWriter(new FileWriter("archivo.txt",true));
				archivo.write("Juan,25\n");
				archivo.close();
			//}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Flujos basados en bytes
		//Flujos basados en objetos
		//Archivos de acceso aleatorio
	}
	
	public void metodo() {
		System.out.println("Metodo");
	}
	public static void main(String[] args) {
		new EjemploEscritura();
	}
	
}
