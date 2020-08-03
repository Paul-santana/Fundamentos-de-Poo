import javax.swing.JOptionPane;

public class CuentaBancaria {
	
	/*public void Datos() {
		char tipo_cuenta = 0;
		String tipo_cuenta1 = null;
		if(tipo_cuenta=='a' || tipo_cuenta=='A'){
	        tipo_cuenta1="AHORROS";
	    }
	    if(tipo_cuenta=='c'||tipo_cuenta=='C'){
	        tipo_cuenta1="CORRIENTE";
	    }
	    //FIN TIPO DE CUENTA EN DATOS
	    if(tipo_cuenta1=="CORRIENTE"){
	    String numerocta = ("");
		String titular = ("");
		String saldo = ("");
		JOptionPane.showMessageDialog(null,"El numero de cuenta es: "+numerocta+"\nEl nombre del titular es: "+titular+"\nEl tipo de cuenta es: "+tipo_cuenta1+"\nEl saldo disponible es de: "+saldo+"BsF\n");

}

}*/
	
	private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Constructor por defecto
    public CuentaBancaria() {
    }

    //Constructor con parámetros
    public CuentaBancaria(String nombre, String numeroCuenta, double tipoInteres, double saldo) {                         
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    //Constructor copia
    public CuentaBancaria(final CuentaBancaria c) {
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    //getters y setters
    public void setNombre(String s) {
        nombre = s;
    }

    public void setNumeroCuenta(String s) {
        numeroCuenta = s;
    }

    public void setTipoInteres(double n) {
        tipoInteres = n;
    }

    public void setSaldo(double n) {
        saldo = n;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    //método ingreso
    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    //método reintegro
    public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;                                                                         
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    //método transferencia
    public boolean transferencia(CuentaBancaria c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
}
