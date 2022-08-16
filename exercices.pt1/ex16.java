import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		int latas;
		
		double galao_l=3.6,lata_l= 18,area, rende_litro = 6,valor_lata= 80,valor_galao =25;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a area em metros");
		area = entrada.nextDouble();
		
		double total=  (area /(lata_l* rende_litro));
		double total_g=  (area /(galao_l* rende_litro));
		
		if(  total % 2 > 0) {	
			total = (int)total +1; 
		}
		if(  total_g % 2 > 0) {	
			total_g = (int)total_g +1; 
		}
		double pagar = valor_lata * total;
		double pagar_galao = valor_galao * total_g;
		
		System.out.println("Realizar compra em: \n1)latas ou \n2)galão: \n3)Geral:");
		int escolha =  entrada.nextInt();
		
		switch(escolha) {
			case 1:
				System.out.println("Total de latas: "+ total);
				System.out.println("Total a Pagar: "+  pagar);
				break;
			case 2:
				System.out.println("Total de Galões: "+ total_g);
				System.out.println("Total a Pagar: "+ pagar_galao);
				break;
				
			default:
				System.out.println("Total de latas: "+ total);
				System.out.println("Total a Pagar: "+  pagar);
				System.out.println("Total de Galões: "+ total_g);
				System.out.println("Total a Pagar: "+ pagar_galao);
		
		}
		
	}

}
