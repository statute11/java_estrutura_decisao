package exercicio_if_else;

import java.util.Scanner;

public class exercicio_condicionamento_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leitor = new Scanner(System.in);
	
	float n1,n2;
	
	System.out.print("Digite um número qualquer: ");
	n1 = leitor.nextFloat();
	
	System.out.print("Digite um outro número qualquer: ");
	n2 = leitor.nextFloat();
	
	if( n1 > n2 ) {
		System.out.println(n1);
		System.out.println(n2);
	}		
	else {
		System.out.println(n2);
		System.out.println(n1);
	}
		
			
		
	}

}
