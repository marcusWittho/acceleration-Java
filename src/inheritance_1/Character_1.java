package inheritance_1;

public class Character_1 extends Character {

  private float agility;
  
  public Character_1(float life, float strength, float damage) {
    super(life, strength, damage);
    setAgility(4);
  }

  public float getAgility() {
    return agility;
  }

  public void setAgility(float agility) {
    this.agility = agility;
  }

}
