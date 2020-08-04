
public class Empleados {
	private String nif;
    private String nombre;
    private double sueldoBase;
    
    public Empleados() {
    }

    //Constructor con un parámetro
    public Empleados(String nif) {
        this.nif = nif;
    }
    
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNif: ");
        sb.append(nif);
        sb.append("\nSueldo Base: ");
        sb.append(sueldoBase);
        return  sb.toString();
    }

	public Object calcularSueldo() {
		// TODO Auto-generated method stub
		return (1);
	}
}
