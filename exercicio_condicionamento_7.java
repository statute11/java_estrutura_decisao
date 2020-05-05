package exercicio_if_else;

import java.util.Scanner;

public class exercicio_condicionamento_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leitor1 = new Scanner(System.in);
	Scanner leitor2 = new Scanner(System.in);
	
	int idade1,idade2;
	String nome1,nome2;
	
	
	System.out.print("Digite o nome da primeira pessoa: ");
	nome1 = leitor1.next();
	
	System.out.print("Digite a idade da primeira pessoa: ");
	idade1 = leitor2.nextInt();
	
	System.out.print("Digite o nome da segunda pessoa: ");
	nome2 = leitor1.next();
	
	System.out.print("Digite a idade da segunda pessoa: ");
	idade2 = leitor2.nextInt();
	
	if ( idade1 > idade2) {
		System.out.println("Nome: " +nome1);
		System.out.println("Idade: " +idade1);	
	}
	else {
		System.out.println("Nome: " +nome2);
		System.out.println("Idade: " +idade2);
	}
	
	
	
	
	
	
	
	}

}
