import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fecha {

	public static void main(String[] args) {
		
		 Date fechaActual = new Date(0);
	        System.out.println(fechaActual);
	        System.out.println("---------------------------------------------");
	        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	        System.out.println(" La fecha: "+formatoFecha.format(fechaActual));
	        
	        
	        Calendar fecha = Calendar.getInstance();
	        int año = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH) + 1;
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
	        
	        System.out.println("Fecha Actual: "+ dia + "/" + (mes) + "/" + año);
	        System.out.println("-------------Fecha desglosada----------------");
	        System.out.println("El año es: "+ año);
	        System.out.println("El mes es: "+ mes);
	        System.out.println("El día es: "+ dia);
	       
	}  
}	 