import java.util.Scanner;
public class ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double cm, m;
		
		System.out.println("Digite a adistancia em metros");
		m = input.nextDouble();
		
		System.out.println("Conversao para centimetros: "+(m*100));	
	}
}	
