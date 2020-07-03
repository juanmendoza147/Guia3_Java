import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Ingrese número : ");
		n = sc.nextInt();
		
		int i = 1;
		int s = 0;
		
		while ( i <= n ) {
			s+=i;
			i++;
		}
		System.out.println("La sumatoria de " + n + " es : " + s);
	}
	

}
