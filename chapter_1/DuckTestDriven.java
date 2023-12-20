public class DuckTestDriven {
  public static void main(String[] args) {
    MallardDuck mallard = new MallardDuck();
    mallard.swim("Mallard");
    mallard.display();
    mallard.quack("Mallard");

    RedheadDuck redhead = new RedheadDuck();
    redhead.swim("Mallard");
    redhead.display();
    redhead.quack("RedHead");
    redhead.fly("Mallard");

    RubberDuck rubber = new RubberDuck();
    rubber.swim("Rubber");
    rubber.display();
    rubber.quack("Rubber");
    rubber.fly("Rubber");
  }
}
