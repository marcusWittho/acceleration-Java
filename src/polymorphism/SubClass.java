package polymorphism;

public class SubClass extends SuperClass {

  @Override
  public void SuperClassMethod() {
    System.out.print("Fui chamado da SubClass. ");
    super.SuperClassMethod();

    System.out.println("Eu sou o método da SuperClass, mas fui alterado aqui na SubClass :)");
  }
}
