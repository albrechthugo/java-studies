package entities;

public class Product {
  public String name;
  public double price;
  public int quantity;

  public double TotalValueInStock() {
    return price * quantity;
  }

  public void AddProducts(int quantity) {
    this.quantity += quantity;
    System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", name, price, this.quantity, TotalValueInStock());
  }

  public void RemoveProducts(int quantity) {
    this.quantity -= quantity;
    System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", name, price, this.quantity, TotalValueInStock());
  }

  public String toString() {
    return "Product data: "
      + name
      + ", $"
      + String.format("%.2f", price)
      + ", "
      + quantity
      + " units, Total: $ "
      + String.format("%.2f", TotalValueInStock());
  }
}
