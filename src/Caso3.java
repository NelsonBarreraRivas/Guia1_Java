import java.util.Scanner; // Utilizar para la lectura
public class Caso3 {

	public static void main(String[] args) {
		// Instancia a la clase Scanner
		Scanner sc = new Scanner(System.in);
				
		// Declarar y asignar un valor a la variable
		float num1,num2= 0;
		// lectura de datos
		System.out.print("Ingrese el primer número:");
		num1 = sc.nextFloat();
		System.out.print("Ingrese el segundo número:");
		num2 = sc.nextFloat();
		
		// Salida de resultados
		
		System.out.println("Número ingresado:"+num1);
		System.out.println("Número ingresado:"+num2);
		
	}

}
