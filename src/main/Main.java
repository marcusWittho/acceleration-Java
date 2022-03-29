package main;

import JavaClasses.Livro;

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

    System.out.println("\n==============================\n\n");

    Livro livro = new Livro("Livrão", 89);
    System.out.println("Exemplo de utilização de classes com construtor, getters e setters");
    System.out.println("-----------------------------------");
    System.out.println("Título: " + livro.getTitle());
    System.out.println("Total de páginas: " + livro.getPages());
    System.out.println("-----------------------------------\n");

    livro.setPages(0);
    System.out.println("Total de páginas atualizado: " + livro.getPages());
    System.out.println("-----------------------------------\n");

    livro.setPages(100);
    System.out.println("Total de páginas atualizado: " + livro.getPages());

    System.out.println("\n==============================\n\n");
  }
}
