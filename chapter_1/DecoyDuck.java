public class DecoyDuck extends Duck {

  @Override
  public void fly(String duckType) {
    System.out.println(duckType + " duck cannot fly!");
  }

  @Override
  public void quack(String duckType) {
    System.out.println(duckType + " duck cannot quack!");
  }

  @Override
  public void display() {
    System.out.println("Decoy duck looks like a decoy!");
  }

}
