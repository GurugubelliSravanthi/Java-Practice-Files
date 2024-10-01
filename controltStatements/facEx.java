package controltStatements;

import java.util.Scanner;

public class facEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a num:");
    int num = sc.nextInt();
    int factorial = 1;
    for (int i = 1; i <= num; i++) {
      factorial = factorial * i;
    }
    System.out.println("the fact of " + num + "is" + factorial);
  }

}
