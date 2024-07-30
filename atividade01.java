package progamacao_backend;
import java.util.Scanner;
public class atividade01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("informe um número inteiro: ");
		int num1 = sc.nextInt();
		
		
		System.out.println("informe outro número inteiro: ");
		int num2 = sc.nextInt();
		
		System.out.println(" A soma entre eles resulta em: "+(num1+num2));

	}

}
