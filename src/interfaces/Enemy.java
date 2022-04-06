package interfaces;

public class Enemy extends Character implements SpecialMove {

  public Enemy(int life, int agility) {
    super(life, agility);
  }

  @Override
  public void specialDamage() {
    System.out.println("Enemy used special move!!");
    System.out.println("Double damage " + (this.getDamage() + 1));
  }
  
}
