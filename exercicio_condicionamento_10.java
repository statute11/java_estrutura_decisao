package exercicio_if_else;

import java.util.Scanner;

public class exercicio_condicionamento_10 {


	private static String sexo1 = "Masculino";
    private static String sexo2 = "Feminino";

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    System.out.println("Digite o sexo: ");
    String sexo = sc.nextLine();

    System.out.println("Digite a sua altura: ");
    Float altura = sc.nextFloat();

    float imcmasc = (float) ((72.7 * altura) - 58);
    float imcfem = (float) ((62.1 * altura) - 44.7);

    if(sexo.equals(sexo1)) 
    {

    System.out.println("O seu peso ideal é: "+imcmasc);

    }
    
    else if(sexo.equals(sexo2))
    {

    System.out.println("O seu peso ideal é: "+imcfem);
    }


            }



        }

  