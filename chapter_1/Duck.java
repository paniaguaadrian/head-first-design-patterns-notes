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

}