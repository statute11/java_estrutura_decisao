package exercicio_if_else;

import java.util.Scanner;

public class exercicio_condicionamento_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		int n1,n2,r;
		
		System.out.print("Digite um n�mero inteiro: ");
		n1 = leitor.nextInt();
		
		System.out.print("Digite um outro n�mero inteiro: ");
		n2 = leitor.nextInt();
		
		r = n1 + n2;
		
		if ( r > 10 )
			System.out.print(r);
		
		else
			System.out.print("N�o foi poss�vel mostrar o n�mero.");
		
				
		
		
		
		
		
	}
	

}
