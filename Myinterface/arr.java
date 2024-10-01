package Myinterface;
import java.util.Scanner;


public class arr {
  public static void main(String[] args) {
    int arr[] = new int[6];
    Scanner s = new Scanner(System.in);
    for(int i=0; i<=5;i++)
    {
      System.out.println("enter your marks of this subj" + (i+1));
      arr[i] =s.nextInt();

    }
    for(int i=0; i<=5;i++)
    {
      System.out.println( arr[i]+  " ");
    }

  }
  
}
