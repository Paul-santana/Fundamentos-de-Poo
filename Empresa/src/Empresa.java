import java.io.IOException;
import java.util.Scanner;

public class Empresa {
	
	final static int MAXIMO_EMPLEADOS = 20;
	private static int N = 0;
    static Empleados[] empleado = new Empleados[MAXIMO_EMPLEADOS];
    static int indice = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        double importe;
        Empleados e;
        leerEmpleado();
        if (numeroDeEmpleado() > 0) {
        	System.out.println("\n\nEmpleados introducidos: ");
            mostrar();
            
            e = empleadoQueMasCobra();
            System.out.println("\n\nEmpleado que más cobra:");
            System.out.println(e);
            System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());

            //calcular el empleado que menos cobra
            e = empleadoQueMenosCobra();
            System.out.println("\n\nEmpleado que menos cobra:");
            System.out.println(e);
            System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());
            ordenarPorSalario();
            System.out.println("\n\nEmpleados ordenados por salario:");
            mostrarEmpleadosYSalarios();

        }
    }
    
    

	private static int numeroDeEmpleado() {
		// TODO Auto-generated method stub
		return 0;
	}



	private static void leerEmpleado() {
		// TODO Auto-generated method stub
		
	}



	public static void leerEmpleados() throws IOException {
        Empleados e;
        String dni, nombre;
        double sueldoBase;
        
        do {
            System.out.print("Número de empleados? ");
            N = sc.nextInt();
        } while (N < 0 || N > MAXIMO_EMPLEADOS);
        for (int i = 1; i <= N; i++) {
            sc.nextLine(); //limpiar el intro
            System.out.println("Empleado " + i);
            System.out.print("Nif: ");
            dni = sc.nextLine();
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("Sueldo Base: ");
            sueldoBase = sc.nextDouble();
            e = new Empleados(dni); //crear una nueva instancia de empleado

            e.setNombre(nombre);
            e.setSueldoBase(sueldoBase);
            empleado[indice] = e; //se añade el empleado al array
            indice++;
        }
    }
	
	public static void mostrar() {
        for (int i = 0; i < indice; i++) {
            System.out.println(empleado[i]);
        }
    }
	
	public static int numeroDeEmpleados() {
        return indice;
    }

    //método que devuelve el empleado que más cobra
    public static Empleados empleadoQueMasCobra() {
        Empleados mayor = empleado[0];
        for (int i = 1; i < indice; i++) {
            if (empleado[i].calcularSueldo() > mayor.calcularSueldo()) {
                mayor = empleado[i];
            }
        }
        return mayor;
    }

    //método que devuelve el empleado que menos cobra
    public static Empleados empleadoQueMenosCobra() {
        Empleados menor = empleado[0];
        for (int i = 1; i < indice; i++) {
            if (empleado[i].calcularSueldo() < menor.calcularSueldo()) {
                menor = empleado[i];
            }
        }
        return menor;
    }
    
    public static void ordenarPorSalario() {

        int i, j;
        Empleados aux;
        for (i = 0; i < indice - 1; i++) {
            for (j = 0; j < indice - i - 1; j++) {
                if (empleado[j + 1].calcularSueldo() < empleado[j].calcularSueldo()) {
                    aux = empleado[j + 1];
                    empleado[j + 1] = empleado[j];
                    empleado[j] = aux;
                }
            }
        }
    }

    //método para mostrar los datos de cada empleado junto con su sueldo
    public static void mostrarEmpleadosYSalarios() {
        for (int i = 0; i < indice; i++) {
            System.out.println(empleado[i]);
            System.out.printf("Sueldo: %.2f € %n" , empleado[i].calcularSueldo());
        }
    }

}
