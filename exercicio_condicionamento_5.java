package exercicio_if_else;

import java.util.Scanner;

public class exercicio_condicionamento_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leitor = new Scanner(System.in);
	
	float n1;
	
	System.out.print("Digite um número qualquer: ");
	n1 = leitor.nextFloat();
	
	if ( n1 % 2 ==0 ) {
		System.out.println("O número digitado é par!");
	}
	
	else
		System.out.println("O número digitado é ímpar!");
	
	
		
		
	}


}
