import java.util.Scanner;
public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el primer monto: ");
		int monto1= sc.nextInt();
		System.out.print("Ingrese el segundo monto: ");
		int monto2= sc.nextInt();
		System.out.print("Ingrese el tercer monto: ");
		int monto3= sc.nextInt();
		
		int ejer= monto1/5+monto2*20/100;
		int ejer1=(monto3 + monto3*60/100)/2;
		int suma= monto1 + monto2 + monto3 ;
		int por= suma*8/100;
		int ejer2=suma-por;
		
		System.out.println("La quinta parte del primer monto más el 20% del segundo monto: "+ejer);
		System.out.println("La mitad del aumento en 60% del tercer monto: "+ejer1);
		System.out.println("Disminuya en 8% la suma de los tres montos: "+ejer2);

	}

}
