public class DuckCall {
  QuackBehavior quackBehavior;

  public DuckCall() {
  }

  public void performDuckCall() {
    quackBehavior.quack();
  }

  public void setQuackBehavior(QuackBehavior qb) {
    this.quackBehavior = qb;
  }
}
