package controltStatements;

import java.util.Scanner;

public class ifEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1 num:");
    int th1 = sc.nextInt();
    System.out.println("enter 2 num:");
    int th2 = sc.nextInt();
    System.out.println("enter 3 num");
    int th3 = sc.nextInt();

    if (th1 > th2 && th1 > th3) {
      System.out.println("the largest num is :" + th1);
    } else if (th2 > th1 && th2 > th3) {
      System.out.println("the largest num is:" + th2);
    } else {
      System.out.println("the largest num is " + th3);
    }
  }

}
