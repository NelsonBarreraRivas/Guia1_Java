import java.util.Scanner;
public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Precio: ");
		float precio = sc.nextFloat();
		
		float importe1,importe2,importe3;
		importe1= cantidad * precio;
		importe2= importe1 / 3.24f;
		importe3 = importe1 / 3.75f;
		
		System.out.println("Importe en soles: "+importe1);
		System.out.println("Importe en dolares: "+importe2);
		System.out.println("Importe en euros: "+importe3);
		
		
		

	}

}
