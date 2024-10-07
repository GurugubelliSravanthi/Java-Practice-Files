package ArraysDemo;

import java.util.Scanner;
public class arry2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number :");
    int num = sc.nextInt();
    int[] arr = new int[num];
    System.out.println("enter" + num + "each");
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("your numbers are:");
    for (int i = 0; i < num; i++) {
      System.out.println(arr[i]);
    }
  }
}