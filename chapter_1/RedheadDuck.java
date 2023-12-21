public class RedheadDuck extends Duck {

  public RedheadDuck() {
    quackBehavior = new Squeak();
    flyBehavior = new FlyNoWay();
  }

  @Override
  public void display() {
    System.out.println("Redhead duck looks like a redhead! ");
  }

}
