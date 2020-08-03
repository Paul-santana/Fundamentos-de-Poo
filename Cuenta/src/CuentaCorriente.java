
public class CuentaCorriente {
	private static double tasaInteresAnual;
    private double saldoCorriente; // cantidad deposito

    CuentaCorriente( int corriente )
    {
        saldoCorriente = corriente;
    }

    public double calcularInteresMensual()
    {   double interesMensual=( saldoCorriente * tasaInteresAnual / 12)/100;   
        return interesMensual;
    }

    public static void setTasaInteresAnual(double tasaInteresAnual1){
        tasaInteresAnual=tasaInteresAnual1; } 

    public static void main(String[] args) {
        double saldoAhorrador1,saldoAhorrador2,interesMensual;
        CuentaCorriente corriente1 = new CuentaCorriente(2000);
        CuentaCorriente corriente2 = new CuentaCorriente(3000);

        CuentaCorriente.setTasaInteresAnual(1); 

        saldoAhorrador1=corriente1.saldoCorriente;
        interesMensual=corriente1.calcularInteresMensual();
        System.out.println("El interés generado por ahorrador1 el primer mes \n con la tasa anual del 1% ha sido : "+interesMensual);
        System.out.println("Ahora su saldo es : " + (saldoAhorrador1+interesMensual));           
        saldoAhorrador1=saldoAhorrador1+interesMensual;

        saldoAhorrador2=corriente2.saldoCorriente;
        interesMensual=corriente2.calcularInteresMensual();
        System.out.println("El interés generado por ahorrador2 el primer mes \n con la tasa anual del 1% ha sido : "+interesMensual);
        System.out.println("Ahora su saldo es : " + (saldoAhorrador2+interesMensual));           
        saldoAhorrador2=saldoAhorrador2+interesMensual;

        CuentaCorriente.setTasaInteresAnual(2);
        interesMensual=corriente1.calcularInteresMensual();
        System.out.println("El interés generado por ahorrador1 el segundo mes \n con la tasa anual del 2% ha sido : "+interesMensual);
        System.out.println("Ahora su saldo es : " + (saldoAhorrador1+interesMensual));

        interesMensual=corriente2.calcularInteresMensual();
        System.out.println("El interés generado por ahorrador2 el segundo mes \n con la tasa anual del 2% ha sido : "+interesMensual);
        System.out.println("Ahora su saldo es : " + (saldoAhorrador2+interesMensual));
    }


}
