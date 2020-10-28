package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Triangle x, y, higherArea;
    x = new Triangle();
    y = new Triangle();
    higherArea = new Triangle();

    System.out.println("Insira os dados do triângulo X :)");

    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Insira os dados do triângulo Y :)");

    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.area();
    double areaY = y.area();

    System.out.printf("Area X: %.2f%n", areaX);
    System.out.printf("Area Y: %.2f%n", areaY);

    higherArea.compareArea(areaX, areaY);
  }
}