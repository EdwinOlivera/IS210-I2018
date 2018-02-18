
public class EjemploMatriz {
	
	public static void main(String[] args) {
		int[][] matriz;
		matriz = new int[10][5]; 

		System.out.println("matriz.length: "+ matriz.length);
		
		//Asignar valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				matriz[i][j] = (i+1) * (j+1);
			}
		}

		//Imprimir valores
		/* for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				System.out.println("Elemento ["+i+"]["+j+"]: "+matriz[i][j]);
			}
		} */
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
