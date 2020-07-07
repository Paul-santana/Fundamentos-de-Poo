
public class Numeromayor {
	
	public static void main(String[]args) {
	int n1 = 10;
	int n2 = 14;
	int n3 = 16;
	
	if(n1 > n2 && n1 > n3) {
		System.out.println(n1 + "es el mayor");
	} else if (n2 > n1 && n2 > n3) {
		System.out.println(n2 + "es el mayor");
	} else {
		System.out.println(n3 + "es el mayor");
	}
	
	}

}
