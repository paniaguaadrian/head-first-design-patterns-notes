/**
 * Duck super class
 * This class and the rest of files implements OO with Inheritance.
 */
public abstract class Duck {

  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void swim(String duckType) {
    System.out.println(duckType + " duck is swimming!");
  }

  public abstract void display();

  // We created these setters so we can set and change the behavior of the duck in
  // his quack and fly actions.
  public void setFlyBehavior(FlyBehavior fb) {
    this.flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    this.quackBehavior = qb;
  }

}