package controltStatements;

import java.util.Scanner;

public class sumEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }

    System.out.println("the sum is" + sum);
  }

}
