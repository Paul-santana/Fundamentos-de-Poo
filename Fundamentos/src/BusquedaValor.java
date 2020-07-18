import java.util.Scanner;

public class BusquedaValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		System.out.println("leer numero:");
		Scanner in= new Scanner (System.in);
		numero =in.nextInt();
		
		int[] numeros= new int[5];
		
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=100;
		numeros[3]=1000;
		numeros[4]=10000;
		
		int posicion =-1;
		for(int i = 0; i<numeros.length;i++) {
			if(numero==numeros[i]) {
				posicion =i;
			}
		}
		if(posicion !=-1) {
			System.out.println("El numero fue encontrado es:"+ posicion);
			
		}
				
	}

}
