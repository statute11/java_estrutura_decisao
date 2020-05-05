package exercicio_if_else;

import java.util.Scanner;

public class exercicio_condicionamento_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		float n1;
		
		System.out.print("Digite um número qualquer: ");
		n1 = leitor.nextFloat();
		
		if ( n1 > 20 ) 
			System.out.print(n1);
	
		else 
			System.out.print("Não foi possível mostrar o número.");
		
		
		
		
		
	}

}
