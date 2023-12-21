public class DuckTestDriven {
  public static void main(String[] args) {
    // Duck mallard = new MallardDuck();
    // System.out.println("Mallard duck");
    // mallard.performFly();
    // mallard.performQuack();

    Duck model = new ModelDuck();
    model.performFly(); // cannot fly here
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly(); // Fly like a rocket
  }
}
