import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0,apts = 0, noapts = 0;
		float valor1 = 0 , valor2 = 0 , valor3 = 0, promedio = 0, porcen = 0 , mayor = 0 , menor = 0;
		
		String rpta="S" ,std= "",nom1= "", nom2 = "";
		
		while (rpta.equals("S") || rpta.equals("s")) {
			i++;
			System.out.println("°°°°°°°°°°°");
			System.out.println("Registro " + i);
			System.out.println("°°°°°°°°°°°°");
			
			System.out.println("Ingrese nombre del estudiante : ");
			String nom = sc.nextLine();
			
			System.out.println("Ingrese la nota 1 : ");
			int nota1 = sc.nextInt();
			System.out.println("Ingrese la nota 2 : ");
			int nota2 = sc.nextInt();
			System.out.println("Ingrese la nota 3 : ");
			int nota3 = sc.nextInt();
			
			System.out.println("Asistencia [1 - 12] : ");
			int asisten = sc.nextInt();
			
			valor1 = (float)( nota1 * 0.2) ;
			valor2 = (float) (nota2 * 0.3) ;
			valor3 = (float) (nota3 * 0.5);
			
			promedio = valor1 + valor2 + valor3;
			porcen = asisten * 100 / 12;
			if (promedio>=13 && porcen>=70) {
				std="Obtiene cetificado";
				apts++;
			}else {
				std ="Sin certificado";
				noapts++;
			}
		
			System.out.println("Estado : "+std);
			sc.nextLine();
			
			System.out.println("°°°°°°°°°");
			System.out.println("Resultado");
			System.out.println("°°°°°°°°°");
			System.out.println("Asisecia "+ porcen +" %");
			System.out.println("Estado :"+std);
			System.out.println("Promedio :"+ promedio);
			System.out.println("¿Desea Continuar ...? ");
			rpta= sc.nextLine();
			
				if ( i==1 ) {
					menor = promedio;
					nom2 = nom;
				}if (promedio > mayor) {
					mayor = promedio;
					nom1=nom;
				}if (promedio<menor) {
					menor = promedio;
					nom2=nom;
				}
				
		}
		
		System.out.println("========");
		System.out.println("Resultado");
		System.out.println("=========");
		System.out.println("N°de participante :"+i);
		System.out.println("Número de alumnos certificados: "+apts);
		System.out.println("Número de alumnos sin certificado: "+noapts);
		System.out.println("Promedio mayor : "+ mayor +" pertenece a: "+nom1);
		System.out.println("Promedio menor : "+ menor +" pertenece a: "+nom2);
	}

}
