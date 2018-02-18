import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		String nombre;
		int a;
		int b;
		int suma;
		Scanner entrada; 
		entrada = new Scanner(System.in);
		System.out.print("Cual es su nombre: ");
		nombre = entrada.next();
		System.out.print("Ingrese un numero: ");
		a = entrada.nextInt();
		System.out.print("Ingrese otro numero: ");
		b = entrada.nextInt();
		suma = a + b;
		System.out.print("Hola " + nombre + ", la suma de los numeros que ingreso es: " + suma);		
		entrada.close();
	}

}
