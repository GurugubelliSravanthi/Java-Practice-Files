package controltStatements;

import java.util.Scanner;

public class switchEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a num(1-3):");
    int week = sc.nextInt();
    switch (week) {
      case 1:
        System.out.println("sun");
        break;
      case 2:
        System.out.println("mon");
        break;
      case 3:
        System.out.println("tue");
        break;
      default:
        System.out.println("invalid");

    }

  }
}
