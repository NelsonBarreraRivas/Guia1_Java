import java.util.Scanner;
public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de aprobados: ");
		int apro = sc.nextInt();
		System.out.println("Número de desaprobados: ");
		int desa= sc.nextInt();
		System.out.println("Número de retirados: ");
		int reti= sc.nextInt();
		float suma= apro + desa +reti;
		float aproba= 100*apro/suma;
		float desapro= 100*desa/suma;
		float retira= 100*reti/suma;
		 
		System.out.println("Aprobados: "+aproba);
		System.out.println("Desaprobados: "+desapro);
		System.out.println("Retirados: "+retira);
	}

}
