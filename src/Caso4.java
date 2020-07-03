import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c= 1, multi = 1;
		
		System.out.println("Ingrese número :");
		int num = sc.nextInt();
		
		while (c <= num) {
			multi *= c; // suma = suma + c;
			c++;
		}
		System.out.println("La sumatoria es :"+ multi);
	}

}