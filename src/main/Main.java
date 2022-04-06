package main;

import JavaClasses.Livro;

import ConditionalsAndRepetitions.LoopFor;
import ConditionalsAndRepetitions.LoopWhile;
import VarAndTypes.Variables;
import abstractClass.SubClasseAbstrata;
import inheritance_1.Character_1;
import interfaces.Enemy;
import interfaces.Player;
import polymorphism.SubClass;

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
    
    Character_1 char_1 = new Character_1(1.0f, 2.0f, 3.0f); 
    System.out.println("Exemplo de utilização de herança");
    System.out.println("-----------------------------------");
    System.out.println("Life do novo char: " + char_1.getLife());
    System.out.println("strength do novo char: " + char_1.getStrength());
    System.out.println("Damage do novo char: " + char_1.getDamage());
    System.out.println("Agility do novo char: " + char_1.getAgility());

    System.out.println("\n==============================\n\n");
    
    SubClass subclass = new SubClass();
    System.out.println("Exemplo de utilização do Polimorfismo");
    System.out.println("-----------------------------------");
    subclass.SuperClassMethod();
    
    System.out.println("\n==============================\n\n");
    
    SubClasseAbstrata subClasseAbstrata = new SubClasseAbstrata();
    System.out.println("Exemplo de utilização de classes abstratas");
    System.out.println("-----------------------------------");
    subClasseAbstrata.concreteMethod();
    subClasseAbstrata.abstractMethod();

    System.out.println("\n==============================\n\n");
    
    Player player = new Player(10, 3);
    Enemy enemy = new Enemy(10, 2);
    System.out.println("Exemplo de utilização de interface");
    System.out.println("-----------------------------------");
    
    System.out.println("Player life: " + player.getLife());
    System.out.println("Player agility: " + player.getAgility());
    System.out.println("Player damage: " + player.getDamage());
    player.specialDamage();

    System.out.println("\nEnemy life: " + enemy.getLife());
    System.out.println("Enemy agility: " + enemy.getAgility());
    System.out.println("Enemy damage: " + enemy.getDamage());
    enemy.specialDamage();
  }
}
