package exercicio_if_else;

import java.util.Scanner;

public class exercicio_condicionamento_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leitor = new Scanner(System.in);
	
	
	float pesoA,pesoB,pesoC,DefProvaA,DefProvaB,DefProvaC,somapeso,result,provaA,provaB,provaC;
	
	pesoA = 2;
	pesoB = 3;
	pesoC = 5;
	somapeso = pesoA + pesoB + pesoC;

	
	System.out.print("Digite a nota da prova A: ");
	provaA = leitor.nextFloat();
	
	System.out.print("Digite a nota da prova B: ");
	provaB = leitor.nextFloat();
	
	System.out.print("Digite a nota da prova C: ");
	provaC = leitor.nextFloat();
	
	DefProvaA = provaA*pesoA;
	DefProvaB = provaB*pesoB;
	DefProvaC = provaC*pesoC;
	result = (DefProvaA + DefProvaB + DefProvaC)/somapeso;
	

	if(result >= 7.0) 
    {
        System.out.println("O aluno está aprovado!");
    }else{
        System.out.println("O aluno está de recuperação!");
    }
	
	
	
		
	}

}
