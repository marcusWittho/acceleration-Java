package main;

import ConditionalsAndRepetitions.LoopFor;
import ConditionalsAndRepetitions.LoopWhile;
import VarAndTypes.Variables;

public class Main {
	public static void main(String[] args) {
	
		Variables phrase = new Variables();
		System.out.println("\nVariáveis e concatenação com StringBuilder");
		System.out.println("--------------------------------------------");
		phrase.makeString();

		System.out.println("\n==============================\n\n");
		
		LoopFor triangle = new LoopFor();
		System.out.println("Manipulação de matriz");
		System.out.println("---------------------");
		triangle.makeTriangle();
		
		System.out.println("\n==============================\n\n");
		
		LoopWhile register = new LoopWhile();
		System.out.println("Exemplo de utilização do laço while");
		System.out.println("-----------------------------------");
		register.inscriptions();
	}
}
