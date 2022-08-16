import java.util.Scanner;
public class ex8 {
	public static void main (String[] args) {
		double hora,valor, salario;
		
		Scanner entrada = new Scanner(System.in);
		
		hora = entrada.nextDouble();
		valor = entrada.nextDouble();
		salario = valor * hora;
		
		System.out.println("Salario R$" + salario);
		
		
	}
}
