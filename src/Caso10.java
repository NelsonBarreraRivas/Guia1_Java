import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Radio:");
		int radio= sc.nextInt();
		
		float pi= 3.1416f;
		int radio1= (int) Math.pow(radio, 2);
		float circulo= pi*radio1;
		float peri= 2*pi*radio;
		
		System.out.println("Área del círculo: "+circulo);
		System.out.println("Perímetro: "+peri);

	}

}
