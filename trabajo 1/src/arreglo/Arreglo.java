package arreglo;
import java.util.Scanner;
public class Arreglo {
		public static void ordenarArreglo(int s[], int LIMITE) {
		int i, j, aux;
		for(i=0; i < s.length - 1; i++) {
			for(j=0; j < s.length - 1; j++) {
				if(s[j+1]< s[j]) {
					aux=s[j+1];
					s[j+1]=s[j];
					s[j]=aux;
				}
			}
		}
	}
	
	public static void mostrarArreglo(int s[], int LIMITE) {
		for(int indice = 0; indice<LIMITE; indice++) {
			System.out.println("Datos en casilla"+ indice+ ":"+ s[indice]);

		}
	}
	
	public static void ingresarArreglo(int s[], int LIMITE) {
		Scanner entrada = new Scanner(System.in);
		int indice, numero;
		for(indice = 0; indice < LIMITE ;indice++)
		{
			System.out.println("Ingrese dato en casilla"+ indice + ":");
			numero= entrada.nextInt();
			s[indice]= numero;
		}
	}
	
	//llenar datos al vector con numeros aleatorios entre 0 y 100
	public static void cargarArreglo(int s[], int LIMITE) {
		for ( int i=0;i<s.length;i++) {
			  int aleatorio = (int) (Math.random()*100)+1;
			  s[i] = aleatorio;
		}
	}
	
	public static void consultarDato(int s[]) {
		Scanner entrada = new Scanner(System.in);
		boolean encontrado  = false;
		int posicion = -1, indice = 0;
		int dato_buscar;
		System.out.println("CONSULTA DE DATOS INDIVIDUAL");
		System.out.println("---------------------- \n");
		System.out.println("Ingrese datos a busca:r");
		dato_buscar = entrada.nextInt();
		while (indice < s.length && encontrado == false) {
			if(s [indice] == dato_buscar) {
				posicion = indice;
				encontrado = true;
			}
			indice++;
		}
		if(encontrado ==true)
			System.out.println("EL Dato" + dato_buscar + "");
		else
			System.out.println("EL DATO NO SE ENCUNTRE EN EL VECTOR...");
	}
		
	public static void menu(int s[], int LIMITE) {
	System.out.println("MENU PRINCIPAL");
	System.out.println("**********");
	System.out.println("1. cargar vector");
	System.out.println("2. ordenar vector");
	System.out.println("3. mostrar vector");
	System.out.println("4. consultar datos individuales");
	System.out.println("5. salir");
	System.out.println("Digite opcion");
	Scanner entrada = new Scanner (System.in);
	int opcion = entrada .nextInt();
	switch (opcion) {
	case 1: cargarArreglo (s, LIMITE); menu(s,LIMITE);break;
	case 2: ordenarArreglo (s, LIMITE); menu(s,LIMITE);break;
	case 3: mostrarArreglo (s, LIMITE); menu (s,LIMITE);break;
	case 4: consultarDato (s); menu (s, LIMITE);break;
	}
}
	
	public static void main(String[]args) {
		final int Max=20;
		int []sueldos;
		sueldos = new int[Max];
		
	}
	
}


