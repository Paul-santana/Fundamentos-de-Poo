//Uso de constructor, variable de instancia y un metodo.
enum Transporte{
	COCHE(60), CAMION(50), AVION(600), TREN(70), BARCO(20);
	private int velocidad; //velocidad típica de cada transporte
	
	//Añadir un constructor
	Transporte(int s){velocidad=s;}
	// Añadir metodo
	int getVelocidad(){return velocidad;}
}
public class Numerador {
	class Enumerados{
		public void main (String[] args) {
			Transporte tp;
			//Mostrar la velocidad de un avion
			System.out.println("La velocidad típica para un avion es:"+ Transporte.AVION.getVelocidad()+"millas por hora.\n");
			
			// Mostrar todas las velocidades y transportes
			System.out.println("todas las velocidades de transporte:");
			for (Transporte t:Transporte.values())
				System.out.println(t + ": velocidad típica es" + t.getVelocidad()+"millas por hora.");
			
		}
	}

}
