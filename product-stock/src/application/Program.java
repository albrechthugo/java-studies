package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner scan = new Scanner(System.in);

    int quantity;

    Product product;
    product = new Product();

    System.out.println("Enter product data");

    System.out.print("Name: ");
    product.name = scan.nextLine();

    System.out.print("Price: ");
    product.price = scan.nextDouble();

    System.out.print("Quantity: ");
    product.quantity = scan.nextInt();
    
    System.out.println(product);

    System.out.print("Enter the number of products to be added in stock: ");
    quantity = scan.nextInt();
    product.AddProducts(quantity);

    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = scan.nextInt();
    product.RemoveProducts(quantity);

  }
}
