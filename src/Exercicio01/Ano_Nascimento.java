package Exercicio01;

import java.util.Scanner;

public class Ano_Nascimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o dia do seu nascimento ");
		int anoNascimento = scan.nextInt(); 
		
		int idade = 2023 - anoNascimento;
		
		if (idade>=16) {
			
			System.out.println("Voce está autorizado a votar ");
		}else{
			
			System.out.println("Voce não autorizado a votar ");
		
			
		}
		
	
	}

}
