import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1 , num = 0 , numero_mayor =0;
		
		while ( c<=4) {
			System.out.println("Ingrese número"+c+":");
			num = sc.nextInt();
			
				if(num > numero_mayor)
					numero_mayor = num;
				
				c++;
						
		}
		System.out.println("El mayor es : "+numero_mayor);
	}

}
