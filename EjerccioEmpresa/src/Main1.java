import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.InlineView;

public class Main1 {
	private static ArrayList<Empresa> cargos = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion = 0;
		do {
			System.out.println("1.-Contratar empleado");
			System.out.println("2.-Dia de pago");
			System.out.println("Ingrese Opcion: ");
			opcion= sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Nombre: ");
				
				break;
				
			case 2:
				
				break;

			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion != 2);
	
		
	}
	
	
	public static void agregar(String nombre, int indent, int CodArea, Empleados empleado1) {
		
	}
	
	
	
	

}
