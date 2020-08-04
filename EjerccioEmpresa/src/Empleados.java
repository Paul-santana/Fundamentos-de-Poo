
public class Empleados extends Empresa {

	public String nombre;
	public int ident, CodArea;
	public int sueldo = 0;
	
	public Empleados(String nombre, int ident, int CodArea, int sueldo) {
		this.nombre= nombre;
		this.ident=ident;
		this.CodArea=CodArea;
		this.sueldo=sueldo;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getIdent() {
		return ident;
	}


	public void setIdent(int ident) {
		this.ident = ident;
	}


	public int getCodArea() {
		return CodArea;
	}


	public void setCodArea(int codArea) {
		CodArea = codArea;
	}


	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+this.nombre+ "Identidad: "+this.ident+"Cod.Area: "+this.CodArea+"Sueldo: "+this.sueldo;
	}


	public static void add(Empresa empleado) {
		
		
	}

	

}
