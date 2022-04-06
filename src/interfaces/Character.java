package interfaces;

public class Character {
  
  private int life;
  private int agility;
  private int damage;

  public Character(int life, int agility) {
    this.life = life;
    this.agility = agility;
    this.setDamage(1);
  }

  public int getLife() {
    return life;
  }

  public void setLife(int life) {
    this.life = life;
  }

  public int getAgility() {
    return agility;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }
  
}
