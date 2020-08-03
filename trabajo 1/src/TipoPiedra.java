
public class TipoPiedra {

	public static void main(String[] args) {
		TipoDePiedra miTipoDePiedra = TipoDePiedra.Caliza;
		System.out.println("los tipos de piedras son");
		for (TipoDePiedra tmp:miTipoDePiedra.values()) {
			System.out.println(tmp.toString()+ "\t");}

		TipoDePiedra piedraUsuario1 = TipoDePiedra.Marmol;
		System.out.println("La Piedra elegida por el usuario es " + piedraUsuario1.toString() + "\n con un color"+
		piedraUsuario1.getColor() + "y con un peso especifico de " + piedraUsuario1.getPesoEspecifico() + "kg/m3");
		
		System.out.println("Un palet admite 2.27 m3 de volumen. A continuación el peso de los palets de las distintas piedras");
		
		for (TipoDePiedra tmp: TipoDePiedra.values() ) {

            System.out.println (tmp.toString() + " el palet pesa " + (2.27f*(float)tmp.getPesoEspecifico() ) + " kg");

        }
	}

	
	

}
