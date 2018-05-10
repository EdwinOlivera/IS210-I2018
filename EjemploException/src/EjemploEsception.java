import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class EjemploEsception {
	public EjemploEsception() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numerador: ");
		int numerador = entrada.nextInt();
		System.out.println("Denominador: ");
		int denominador = entrada.nextInt();
		int resultado;
		int[] arreglo = new int[2];
		try {
			resultado = numerador/denominador;
			System.out.println("Resultado: " + resultado);
			arreglo[100]=4;
		}catch(ArithmeticException e) {
			System.out.println("Ocurrio un error");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No se puede acceder al indice");
		}finally {
			System.out.println("Esta instruccion siempre se ejecutara");
		}
		
	
		try {
			funcionQueNecesitaUnTryCatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void funcionQueNecesitaUnTryCatch() throws Exception{
		System.out.println("Esta es la funcion");
	}
	
	public static void main(String[] args) {
		new EjemploEsception();
	}

}
