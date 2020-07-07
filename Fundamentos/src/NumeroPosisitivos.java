import java.util.Scanner;

public class NumeroPosisitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int i=0; 
		while (i<5) {
			//i++;
			System.out.println("leer numero ("+ i + "):");
			int numero = in.nextInt();
			if(numero >0)
				System.out.println("Numero:"+ numero);
			i++;
		}
		
		
		
		//for (int i =0; i <10; i++) {
			//System.out.println(i);
			//System.out.println("leer numero ("+ i + "):");
		//int numero = in.nextInt();
		//if(numero >0)
			//System.out.println("Numero:"+ numero);
		//}

	}
		

}
