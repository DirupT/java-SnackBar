package snackBar;

public class Main {

  private static void workWithData() {
    Customer customer1 = new Customer("Jane", 45.25);
    Customer customer2 = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    // Food vending machine
    Snack snack1 = new Snack("Chips", 36, 1.75, food.getId());
    Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, food.getId());
    Snack snack3 = new Snack("Pretzel", 30, 2.00, food.getId());

    // Drink vending machine
    Snack snack4 = new Snack("Soda", 24, 2.50, drink.getId());
    Snack snack5 = new Snack("Water", 20, 2.75, drink.getId());

    customer1.purchaseSnack(snack4.getCost(3));
    snack4.buySnack(3);
    System.out.println(customer1.getCash() + " " + snack4.getQuantity());

    customer1.purchaseSnack(snack3.getCost(1));
    snack3.buySnack(1);
    System.out.println(customer1.getCash() + " " + snack3.getQuantity());

    customer2.purchaseSnack(snack4.getCost(2));
    snack4.buySnack(2);
    System.out.println(customer2.getCash() + " " + snack4.getQuantity());

    customer1.addCash(10.00);
    System.out.println(customer1.getCash());

    customer1.purchaseSnack(snack2.getCost(1));
    snack2.buySnack(1);
    System.out.println(customer1.getCash() + " " + snack2.getQuantity());

    snack3.addQuantity(12);
    System.out.println(snack3.getQuantity());

    customer2.purchaseSnack(snack3.getCost(3));
    snack3.buySnack(3);
    System.out.println(customer2.getCash() + " " + snack3.getQuantity());
  }

  public static void main(String[] args) {
    workWithData();
  }
}