import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1 :");
		int n1= sc.nextInt();
		
		System.out.print("Ingrese lado 2 :");
		int n2= sc.nextInt();
		
		int area = n1*n2;
		int peri = n1*2+n2*2;
		
		System.out.println("Área del rectangulo: "+area);
		System.out.println("Perimetro del rectangulo: "+peri);

	}

}
