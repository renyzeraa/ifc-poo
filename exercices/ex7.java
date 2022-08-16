import java.util.Scanner;
public class ex7 {
	public static void main(String[] args) {
		double lado;

		Scanner entrada = new Scanner(System.in);

		lado =  entrada.nextDouble();
		double area = lado * lado;

		System.out.println("area do quadrado " + area);
	}
}
