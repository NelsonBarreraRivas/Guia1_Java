import java.util.Scanner;
public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor de gasto : ");
		int gasto= sc.nextInt();
		
		int gasto1= gasto*12/100;
		System.out.println("Disminución del gasto en: "+gasto1);

	}

}
