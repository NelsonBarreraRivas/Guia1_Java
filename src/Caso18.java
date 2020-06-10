import java.util.Scanner;
public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa base del triangulo : ");
		int lado1= sc.nextInt();
		System.out.print("Ingresa altura del triangulo : ");
		int lado2= sc.nextInt();
		int area= lado1*lado2/2;
		int pita= (int) Math.pow(lado1*lado1+lado2*lado2, 0.5f);
		int peri= lado1+lado2+pita;
		
		System.out.println("Área del triangulo: "+area);
		System.out.println("Perimetro del triangulo: "+peri);

	}

}
