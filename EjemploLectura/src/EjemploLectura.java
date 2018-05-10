import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EjemploLectura {
	private ArrayList<Usuario> usuarios;
	public EjemploLectura() {
		usuarios = new ArrayList<Usuario>();
		try {
			BufferedReader archivoLectura = 
					new BufferedReader(new FileReader("archivo.txt"));
			String linea=""; 
			while((linea = archivoLectura.readLine())!=null) {
				String partes[] = linea.split(",");
				usuarios.add(new Usuario(partes[0],partes[1]));
			}	
		} catch (IOException e) {
			System.out.println("El archivo no existe");
		}
		
		mostrarInformacion();
	}
	
	public void mostrarInformacion() {
		for (int i=0; i<usuarios.size(); i++)
			System.out.println(usuarios.get(i).toString());
	}
	public static void main(String args[]) {
		new EjemploLectura();
	}
}
