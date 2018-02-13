
public class EjemploCadenas {
	public static void main(String args[]) {
		
		int valores[] = new int[5];
		valores[0] = 100;
		valores[1] = 200;
		valores[2] = 300;
		valores[3] = 400;
		valores[4] = 500;
		
		System.out.println("For normal: ");
		for(int i=0;i<valores.length;i++) {
			System.out.println("Valor " + i + "="+valores[i]);
		}
		System.out.println("For each: ");
		for (int valor : valores) {
			System.out.println("Valor: " + valor);
		}
		
		System.out.println("\"Hola\tMundo\"\nOtro texto en una linea diferente");
		System.out.println("D:\\Teach UNAH\\Programacion II\\2018-I\\Instructivos de clase\\Material Didactico");
	}
}
