package snackBar;

public class Snack {
  private static int maxID = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingID;

  public Snack(String name, int quantity, double cost, int vendingID) {
    maxID++;
    id = maxID;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingID = vendingID;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return cost;
  }

  public double getCost(int quantity) {
    return cost * quantity;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getVendingID() {
    return vendingID;
  }

  public void setVendingID(int vendingID) {
    this.vendingID = vendingID;
  }

  public int getQuantity() {
    return quantity;
  }

  public void addQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void buySnack(int quantity) {
    this.quantity -= quantity;
  }
}