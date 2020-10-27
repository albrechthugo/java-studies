import javax.xml.transform.stream.StreamSource;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int higher = max(a, b, c);

    print(higher);
  }

  public static int max(int a, int b, int c) {
    if(a > b && a > c) {
      return a;
    } else if(b > c) {
      return b;
    } else {
      return c;
    }
  }

  public static void print(int value) {
    System.out.printf("Higher = %d%n", value);
  }

}
