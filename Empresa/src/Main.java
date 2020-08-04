import java.util.ArrayList;

public class Main {
	
	public static double getToalSaldo(Arraylist<CuentaBnacaria>cuentas) {
		double saldo = 0;
		for(int i =0; i<ceuntas.size();i++) {
			CuentaBancaria cta =cuentas.get(i);
			if(cta instanceof CuentaCorriente) {
				CuentaCorriente ctaCorriente = (CuentaCorriente) cta;
			}
			else if (cta instanceof CuentaCorriente) {
				CuentaCorriente ctaCorriente=(CuentaCorriente)cta;
			}
			saldo += cta.getsaldo();
		}
		return saldo;
	}
	
	public static void main(String[]args) {
		CuentaAhorro[]cuentas =new CuentaAhorro[10];
		
		ArrayList<CuentaBancaria> cuentas = new Arraylist<>();
		
		CuentaAhorro cta1 = new CeuntaAhorro();
		CuentaBancaria cta2 = new CuentaCorriente();
		cta1.deposito(800);
		cta2.deposito(500);
		
		cuentas.add(cta1);
		cuentas.add(cta2);
		
		System.out.println();
	
	}

}
