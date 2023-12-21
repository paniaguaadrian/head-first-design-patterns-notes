public class DuckTestDriven {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    System.out.println("Mallard duck");
    mallard.performFly();
    mallard.performQuack();

    Duck redhead = new RedheadDuck();
    System.out.println("Redhead duck");
    redhead.performFly();
    redhead.performQuack();
  }
}
