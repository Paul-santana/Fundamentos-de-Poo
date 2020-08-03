
public enum TipoDePiedra {
	
	Caliza("rusticas",1200),
	Marmol("Patron natural",1423),
	Pizarra("", 1325),
	Cuarzita("", 1466);
	
	private final String color;
	private final int pesoEspecifico;
	
	TipoDePiedra(String color, int pesoEspecifico){
		this.color = color;
		this.pesoEspecifico = pesoEspecifico;
		
	}

	
	public String getColor() {return color;}
	public int getPesoEspecifico() {return pesoEspecifico;}
}
