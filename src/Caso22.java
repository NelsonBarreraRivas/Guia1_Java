import java.util.Scanner;
public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese nombre del alumnno: ");
		String nombreA= sc.nextLine();
		System.out.print("Nota 1 : ");
		int nota1= sc.nextInt();
		System.out.print("Nota 2 : ");
		int nota2= sc.nextInt();
		System.out.print("Nota 3 : ");
		int nota3= sc.nextInt();
		
		int n1= nota1*20/100;
		int n2= nota2*30/100;
		int n3= nota3*50/100;
		
		int prom= n1 + n2 + n3;
		
		System.out.println("Nombre de alumno: "+nombreA);
		System.out.println("Promedio: "+prom);

	}

}
