package exercicio_if_else;

import java.util.Scanner;

public class exercicio_condicionamento_9 {

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
	


	System.out.println("Digite o valor do produto: ");
	Float value = sc.nextFloat();
	    
	
	float lucromenor = (value+((value*45)/100));
	float lucromaior = (value+((value*30)/100));


		    
	if(value < 20.00) {

		        System.out.println("O valor da venda é: "+lucromenor);

	}
	
	else {

		        System.out.println("O valor da venda é de: "+lucromaior);
		    }


		        }



		    }

	