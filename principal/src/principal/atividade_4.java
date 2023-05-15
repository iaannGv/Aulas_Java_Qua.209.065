package principal;

import java.util.Scanner;

public class atividade_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		System.out.println("No primeiro bimestre a nota foi:");
		nota1 = leia.nextDouble ();
		
		System.out.println("No segundo bimestre a nota foi");
		nota2 = leia.nextDouble ();
		
		System.out.println("No terceiro terceiro a nota foi ");
		nota3 = leia.nextDouble ();
		
		System.out.println("No quarto bimestre a nota foi ");
		nota4 = leia.nextDouble ();
		
		System.out.println("A soma desses períodos foram: " + (nota1 + nota2 + nota3 + nota4));
	

	}

}
