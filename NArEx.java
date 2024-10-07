import java.util.Scanner;

public class NArEx {
  public static void main(String[] args) {
    int a;
    a = Add();
    System.out.println(a);
  }

  public static int Add() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num");
    int a = sc.nextInt();
    System.out.println("Enter a num");
    int b = sc.nextInt();
    int c = a + b;

    return c;
  }
}
