public class ModelDuck extends Duck {
  // This class can work as a default duck.
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I'm a model duck");
  }
}
