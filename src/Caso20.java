import java.util.Scanner;
public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese venta : ");
		int venta= sc.nextInt();
		
		int venta1= venta+venta*42/100;
		
		System.out.println("Incremento de la venta en 42% es: "+venta1);

	}

}
