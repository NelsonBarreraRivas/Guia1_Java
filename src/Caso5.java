import java.util.Scanner; 
public class Caso5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer N�mero:");
		float n1= sc.nextFloat();
		
		System.out.print("Segundo N�mero:");
		float n2= sc.nextFloat();
		
		float promedio= (n1+n2)/2;
		float aumento= n1+n1*20/100;
		float dismi= n2-n2*30/100;
		
		//salida
		
		System.out.println("RESULTADOS:");
		System.out.println("==========");
		System.out.println("Promedio................"+promedio);
		System.out.println("N�mero Aumentado........"+aumento);
		System.out.println("N�mero Disminuido......."+dismi);

	}

}
