import java.util.Scanner; // Utilizar para la lectura
public class Caso4 {
	
	public static void main(String[] args) {
		// Entrada de datos
		Scanner sc=new Scanner (System.in);
		System.out.print("Primer N�mero:");
		float n1= sc.nextFloat();
		
		System.out.print("Segundo N�mero:");
		float n2= sc.nextFloat();
		
		// Proceso
		float suma = n1 + n2;
		float resta= n1 - n2;
		float producto= n1 * n2;
		float resto_entero= n1 % n2;
		float division= n1 / n2;
		
		//salida
		
		System.out.println("RESULTADOS:");
		System.out.println("==========");
		System.out.println("Suma......."+ suma);
		System.out.println("Resta......."+ resta);
		System.out.println("Producto......."+ producto);
		System.out.println("Resto Entero......."+ resto_entero);
		System.out.println("Division......."+ division);
	}

}
