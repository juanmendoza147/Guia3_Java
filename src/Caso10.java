import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nom1 = "",nom2 = "",nom3 = "",resp="S";
		float sb = 0,sn=0,alcanzado=0;
		int i = 0;
		float Smenor=0,Smayor=0,Tmayor=0;
		int n=0;
		float bonificacion = 0 , descu = 0;
		
		while(resp.equals("S")||resp.equals("s")) {
			i++;
			System.out.println("Datos del registro..:" + i);
			System.out.println("°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("Empleado..: ");
			String emple = sc.nextLine ();
			
			System.out.println("Horas trabajadas :");
			float h_trabajadas = sc.nextInt();
			
			System.out.println("Tarifa por hora : ");
			float t_hora = sc.nextInt();
			
			System.out.println("Minutos de tardanza : ");
			float min_tardanza = sc.nextInt();
			sb=h_trabajadas*t_hora;
			
			if(h_trabajadas<=50)
				bonificacion=0;
			else if(h_trabajadas > 50 && h_trabajadas<= 60)
				bonificacion = sb * 0.02f;
			else if(h_trabajadas > 60 && h_trabajadas<= 70)
				bonificacion = sb * 0.08f;
			else if(h_trabajadas > 70 && h_trabajadas<= 80)
				bonificacion = sb * 0.13f;
			else if(h_trabajadas > 80)
				bonificacion = sb * 0.15f;
			
			if(min_tardanza<=15)
				descu=0;
			else if (min_tardanza > 15 && min_tardanza <=30)
				descu= sb * ((0.03f/100))*min_tardanza;
			else if (min_tardanza > 30)
				descu= sb * ((0.5f/100)*min_tardanza);
			sn=sb+bonificacion-descu;
			alcanzado=h_trabajadas*100/80;
			sc.hasNextLine();
			
			System.out.println("°°°°°°°°°");
			System.out.println("Resultado");
			System.out.println("°°°°°°°°°°");
			System.out.println("Sueldo bruto: "+sb);
			System.out.println("Bonificacion: "+bonificacion);
			System.out.println("Descuento: "+descu);
			System.out.println("Sueldo neto: "+sn);
			System.out.println("Alcanzado: "+alcanzado+"%");
			System.out.println("¿Desea continuar?");
			resp=sc.nextLine();
			
			if (i==1) {
				Smenor = sn;
				nom2 = emple;}		
			if (sn > Smayor) {
				Smayor = sn;
				nom1 = emple;}
			if (sn < Smenor) {
				Smenor = sn;
				nom2 = emple;}	
			if (min_tardanza > Tmayor) {
				Tmayor=min_tardanza;
				nom3=emple;}
			if (alcanzado>90)
				n=n+1;}
	
		System.out.println("Resumen.....:");
		System.out.println("°°°°°°°°°°°°°°");
		System.out.println("Número de empleados: "+i);
		System.out.println("Sueldo neto mayor: "+Smayor+" pertenece a: "+nom1);
		System.out.println("Sueldo neto menor: "+Smenor+" pertenece a: "+nom2);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: "+nom3+"("+Tmayor+" min)");
		System.out.println("Cantidad de empleados con mas del 90% de la meta:"+n);	
			
		}
	}


