package ArraysDemo;

import java.util.Scanner;

public class stringArr {
  public static void main(String[] args) {
    String arr[] = { "helcy" };
    String arr1[] = { "min" };
    String arr2[] = new String[3];

    for (int i = 0; i < arr.length; i++) {
      arr2[i] = arr[i] + arr1[i];
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr2[i]);

      // String fu[] = new String[10];

      // Scanner sc = new Scanner(System.in);
      // System.out.println("enter the size ");
      // int n = sc.nextInt();
      // System.out.println("enter the names");
      // for (int i = 0; i < n; i++) {
      // fu[i] = sc.nextLine();
      // }
      // System.out.println("array is :");
      // for (int i = 0; i < n; i++) {
      // System.out.println(fu[i]);
      // }

    }

  }
}
