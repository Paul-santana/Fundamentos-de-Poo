
public class MayorArreglo {

	public static void main(String[] args) {
		int [] numeros= new int [] {
				1,2,-5,7,9,90,54,65,0
		};
		
		int max = numeros [0];
		int posicion = -0;
		for(int i=0; i < numeros.length; i++) {
			if(max < numeros[i]) {
				max=numeros[i];
				posicion =-i;
				
		}
			
		
	}
		System.out.println("numeoro mayor" +max);
		System.out.println("posicion del n. mayor" + posicion);

	}

}
