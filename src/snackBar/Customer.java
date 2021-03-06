package snackBar;

public class Customer {
  private static int maxID = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    maxID++;
    id = maxID;

    this.name = name;
    this.cash = cash;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCash() {
    return cash;
  }

  public void addCash(double cash) {
    this.cash += cash;
  }

  public void purchaseSnack(double cash) {
    this.cash -= cash;
  }
}