public class RubberDuck extends Duck {

  @Override
  public void fly(String duckType) {
    System.out.println(duckType + " duck cannot fly!");
  }

  @Override
  public void quack(String duckType) {
    System.out.println(duckType + " duck is Squawking!");
  }

  @Override
  public void display() {
    System.out.println("Rubber duck looks like a rubber!");
  }

}
