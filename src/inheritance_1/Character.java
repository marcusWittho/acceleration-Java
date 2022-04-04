package inheritance_1;

public class Character {
  private float life;
  private float strength;
  private float damage;

  public Character(float life, float strength, float damage) {
    setLife(life);
    setStrength(strength);
    setDamage(damage);
  }
  
  public float specialMove() {
    return getDamage() + 2;
  }

  public float getLife() {
    return life;
  }

  public void setLife(float life) {
    this.life = life;
  }

  public float getStrength() {
    return strength;
  }

  public void setStrength(float strength) {
    this.strength = strength;
  }

  public float getDamage() {
    return damage;
  }

  public void setDamage(float damage) {
    this.damage = damage;
  }
}
