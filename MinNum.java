

import java.util.Scanner;

public class MinNum{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
    System.out.println("enter a number");
    int b = sc.nextInt();
    System.out.println("enter a number");
    int c = sc.nextInt();

    if (a < b && a < c) {
      System.out.println("A is small");
    } else if (b < a && b < c) {
      System.out.println("B is small");
    } else {
      System.out.println("c is small");
    }

  }
}
