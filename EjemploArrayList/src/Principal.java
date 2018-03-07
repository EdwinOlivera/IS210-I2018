import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		int a = 5;
		Integer b = 6;
		String nombre = "Juan";
		//Ejemplo de un wrapper para hacer conversiones
		short x = b.shortValue();//Retorna un primitivo
		
		Integer.parseInt("5");//Retorna un primitivo
		Integer.valueOf("5");//Retorna un wrapper
		Short.parseShort("10");//Retorna un primitivo
		Short.valueOf("10");//Retorna un wrapper
		Double.parseDouble("4.5");//Retorna un primitivo
		Double.valueOf("4.5");//Retorna un wrapper
		
		
		
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		enteros.add(10);
		
		int[] arreglo = new int[5];
		//Clases de tipo coleccion:
		//ArrayList
		//LinkedList
		//List
		//HashMap
		//HashTable
		//ObservableList
		//Las colecciones no se pueden utilizar para tipos primitivos.
		//<Rawtype> = Receptáculos
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("Juan"); //0
		elementos.add("Pedro");//1
		elementos.add("Luis");//2
		elementos.add("Maria");//3
		elementos.add(4,"ElBrayan"); //4
	
		elementos.set(3, "Mario");
		elementos.remove(2);
		
		for(int i=0; i<elementos.size();i++)
			System.out.println("Elemento "+i +": " + elementos.get(i));
		
		
		//Foreach
		/*for(String nombre:elementos)
			System.out.println("Nombre: " + nombre);*/
		
		
	}

}
