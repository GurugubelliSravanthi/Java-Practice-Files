package ArraysDemo;

import java.util.Scanner;

public class intArrDemo {
  public static void main(String[] args) {
    int arr[] = new int[50];
    int arr1[] = { 1, 2, 3 };
    int arr2[] = { 4, 5, 6 };
    int arr3[] = new int[3];
    for (int f = 0; f < arr3.length; f++) {
      arr3[f] = arr1[f] + arr2[f];
    }
    for (int f = 0; f < arr3.length; f++) {
      System.out.println("sum of the array" + arr3[f]);
      // for (int f = 0; f < arr.length; f++) {
      // System.out.println();
      // Scanner sc = new Scanner(System.in);
      // System.out.println("enter the size");

      // int size = sc.nextInt();
      // System.out.println("enter the elements:");
      // for (int i = 0; i < size; i++) {
      // arr[i] = sc.nextInt();
      // }
      // System.out.println("the array is :");
      // for (int i = 0; i < size; i++) {
      // System.out.println(arr[i]);

      // }

    }
  }
}
