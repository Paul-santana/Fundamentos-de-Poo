
public class CuentaAhorro {
	private static double tasaInteresAnual;
    private double saldoAhorros; // cantidad deposito

    CuentaAhorro( int ahorro )
    {
        saldoAhorros = ahorro;
    }

    public double calcularInteresMensual()
    {   double interesMensual=( saldoAhorros * tasaInteresAnual / 12)/100;   
        return interesMensual;
    }

    public static void setTasaInteresAnual(double tasaInteresAnual1){
        tasaInteresAnual=tasaInteresAnual1; } 

    public static void main(String[] args) {
        double saldoAhorrador1,saldoAhorrador2,interesMensual;
        CuentaAhorro ahorrador1 = new CuentaAhorro(2000);
        CuentaAhorro ahorrador2 = new CuentaAhorro(3000);

        CuentaAhorro.setTasaInteresAnual(1); 

        saldoAhorrador1=ahorrador1.saldoAhorros;
        interesMensual=ahorrador1.calcularInteresMensual();
        System.out.println("El interés generado por ahorrador1 el primer mes \n con la tasa anual del 1% ha sido : "+interesMensual);
        System.out.println("Ahora su saldo es : " + (saldoAhorrador1+interesMensual));           
        saldoAhorrador1=saldoAhorrador1+interesMensual;

        saldoAhorrador2=ahorrador2.saldoAhorros;
        interesMensual=ahorrador2.calcularInteresMensual();
        System.out.println("El interés generado por ahorrador2 el primer mes \n con la tasa anual del 4% ha sido : "+interesMensual);
        System.out.println("Ahora su saldo es : " + (saldoAhorrador2+interesMensual));           
        saldoAhorrador2=saldoAhorrador2+interesMensual;

        CuentaAhorro.setTasaInteresAnual(2);
        interesMensual=ahorrador1.calcularInteresMensual();
        System.out.println("El interés generado por ahorrador1 el segundo mes \n con la tasa anual del 5% ha sido : "+interesMensual);
        System.out.println("Ahora su saldo es : " + (saldoAhorrador1+interesMensual));

        interesMensual=ahorrador2.calcularInteresMensual();
        System.out.println("El interés generado por ahorrador2 el segundo mes \n con la tasa anual del 5% ha sido : "+interesMensual);
        System.out.println("Ahora su saldo es : " + (saldoAhorrador2+interesMensual));
    }
}
