package exercicio_if_else;

import java.util.Scanner;

public class exercicio_condicionamento_8 {

	private static String senha = "AEDB";
	
	public static void main(String[] args) {
		

	Scanner leitor = new Scanner(System.in); 



         System.out.println("Digite a senha: ");
         String senha_digitada = leitor.nextLine();

            if(senha_digitada.equals(senha)) {

                System.out.println("Acesso permitido");

       }
            else {
                System.out.println("Você não tem acesso ao sistema.");
            }
       
	
	}
	

    }

