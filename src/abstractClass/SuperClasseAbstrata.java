package abstractClass;

public abstract class SuperClasseAbstrata {
  protected String message;
  
  public abstract void abstractMethod();
  
  public void concreteMethod() {
    System.out.println("Eu sou o método concreto da superClasseAbstrata.");
  }
}
