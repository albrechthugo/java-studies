package entities;

public class Triangle {
  public double a;
  public double b;
  public double c;

  public double area() {
    double p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  public void compareArea(double areaX, double areaY) {
    if(areaX > areaY) {
      System.out.println("Higher area: " + areaX);
    } else {
      System.out.println("Higher area: " + areaY);
    }
  }
}
