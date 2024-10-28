import java.util.Scanner;
public class posneg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int numbers = sc.nextInt();
    int add = numbers;
    int r = 0;

    while (numbers != 0) {
      int d = numbers % 10;
      r = r * 10 + d;
      numbers /= 10;
    }
    
      System.out.println("Reverse of this number is:"+r);
      if (add == r) {
      System.out.println("it is a palindrome");
    } else {
      System.out.println("not a palindrome");
    }
    }

  }

