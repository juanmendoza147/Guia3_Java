import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 0, aptos = 0 , edad = 0 ;
		String rpta = "S", nombre ="", estado = "";
		
		while (rpta.equals("S") || rpta.equals("s")) {
			c++;
			System.out.println("Datos del registro"+c);
			System.out.println("====================");
			
			System.out.println("Nombre");
			nombre = sc.nextLine();
			
			System.out.println("Edad");
			edad = sc.nextInt();
			
			if (edad >=18) {
				estado ="apto para votar";
				aptos++;
			}
			else
				estado = "Menor sde edad";
			System.out.println("Estaado "+estado);
			
			sc.hasNextLine();
			
			System.out.println("Desea continuar [s-n]");
			rpta =sc.nextLine();
		
	}

	}
}