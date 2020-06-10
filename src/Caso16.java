import java.util.Scanner;
public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Horas trabajadas : ");
		int horasT= sc.nextInt();
		System.out.print("Tarifa por hora : ");
		float tarifa= sc.nextFloat();
		float sueldo= horasT*tarifa;
		float bono = sueldo*5/100;
		float total= sueldo + bono;
		float dolar= total/3.24f;
		
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Bono: "+bono);
		System.out.println("Sueldo total: "+total);
		System.out.println("Sueldo en dólares: "+dolar);

	}

}
