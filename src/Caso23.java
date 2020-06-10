import java.util.Scanner;
public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese nombre del producto: ");
		String nombreP= sc.nextLine();
		System.out.print("Precio : ");
		int precio= sc.nextInt();
		System.out.print("Cantidad : ");
		int cantidad= sc.nextInt();
		
		int impor= precio*cantidad;
		int igv= impor*18/100;
		int desc= impor*3/100;
		int total= impor-desc+igv;
		
		System.out.println("Nombre del producto: "+nombreP);
		System.out.println("Cantidad del producto: "+cantidad);
		System.out.println("Total a pagar: "+total);

	}

}
