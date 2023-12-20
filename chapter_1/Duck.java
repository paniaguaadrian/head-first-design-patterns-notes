/**
 * Duck super class
 * This class and the rest of files implements OO with Inheritance.
 */
public abstract class Duck {

  public void quack(String duckType) {
    System.out.println(duckType + " duck is quacking!");
  }

  public void swim(String duckType) {
    System.out.println(duckType + " duck is swimming!");
  }

  public void fly(String duckType) {
    System.out.println(duckType + " duck is flying!");
  }

  public abstract void display();

}