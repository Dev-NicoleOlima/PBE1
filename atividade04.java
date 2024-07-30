package progamacao_backend;
import java.util.Scanner;
public class atividade04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
	   System.out.println("Qual o código da peça 1 ?");
	   int codigo = sc.nextInt();
	   
	   System.out.println("Qual a quantidade? ");
	   int qntd = sc.nextInt();
	   
	   System.out.println("Qual o valor unitário de cada peça? ");
	   int valor = sc.nextInt();
	   
	   System.out.println("Qual o código da peça 2 ?");
	   int codigo2 = sc.nextInt();
	   
	   System.out.println("Qual a quantidade? ");
	   int qntd2 = sc.nextInt();
	   
	   System.out.println("Qual o valor unitário de cada peça? ");
	   int valor2 = sc.nextInt();
	          
	          
	   System.out.println("O valor total é: "+ (qntd*valor+qntd2*valor2));
	   
	   
		
	}

}
