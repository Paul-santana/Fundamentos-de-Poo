
public class SumaVectores {

	public static void main(String[] args) {
		int[] v1 =new int[] {
				1,5,-8,-4,5,23,56,67
		};
		int[] v2 = new int[] {
				5,-6,3,-7,1,14,76,-7
		};
		int totalv1 =0 , totalv2=0;
		for(int i=0;i<v1.length;i++) {
			totalv1+= totalv1 + v1[i];
		}
		for(int i=0 ;i <v2.length;i++) {
			totalv2+= v2[i];			
		}
		if(totalv1< totalv2) {
			System.out.println("vector 1 es mayor"+ totalv1);
			
		}else if(totalv2 > totalv1) {
			System.out.println("vector 2 es meyor"+ totalv2);
		}else {
			System.out.println("vector 1 y 2 son juguales" + totalv1);
		}
	

	}

}
