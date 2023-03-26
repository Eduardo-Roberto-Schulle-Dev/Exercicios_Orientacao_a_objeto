package Exercicio01;

import java.util.Scanner;

public class Numero_Maior{

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

		
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        if(num1 > num2) {
            System.out.println("O maior numero é: " + num1);
        } else {
            System.out.println("O maior numero é: " + num2);
        }

        

}


}