package Exercicio01;

import java.util.Scanner;

public class Qual_idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner scan= new Scanner(System.in);
		   
		   System.out.println("Digite o ano do seu nascimento ");
			int anoNascimento = scan.nextInt(); 
			
			int idade = 2023 - anoNascimento;
			
			System.out.println("Sua idade e "+idade);

	}

}
