import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c= 1, suma = 0;
		
		System.out.println("Ingrese n�mero :");
		int num = sc.nextInt();
		
		while (c <= num) {
			suma += c; // suma = suma + c;
			c++;
		}
		System.out.println("La sumatoria es :"+ suma);
	}

}
