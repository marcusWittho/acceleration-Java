package interfaces;

public class Player extends Character implements SpecialMove {

  public Player(int life, int agility) {
    super(life, agility);
  }

  @Override
  public void specialDamage() {
    System.out.println("Player used special move!!");
    System.out.println("Double damage " + (this.getDamage() + 1));
  }
  
}
