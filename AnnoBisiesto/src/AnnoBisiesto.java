import java.util.Scanner;

	public class AnnoBisiesto {
		
		public static void main(String[] args) {
	
//Impresión de captura de año
			
	Scanner bisiesto=new Scanner(System.in);
		int anio;
		System.out.println("Ingresa el año");
		anio=bisiesto.nextInt();
		
//Creación de la decisión
		
		if (anio%4==0 && anio%100!=0 || anio%400==0)
	
//Imprimir valor verdadero
	
	System.out.println("True");
		else System.out.println("false");

	}
}