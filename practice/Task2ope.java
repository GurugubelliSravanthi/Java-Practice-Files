import java.util.Scanner;

public class Task2ope {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter an integr :");
    int a = obj.nextInt();
    System.out.println("enter your 2 integer:");
    int b = obj.nextInt();

    int c = a+b;
    int d = a-b;
    int e = a*b;
    int f = a/b;
    int g = a%b;

    System.out.println("addition is :"+c);
    System.out.println("subs is :"+d);
    System.out.println("mutlipl is :"+e);
    System.out.println("divisi is :"+f);
    System.out.println("remaim is :"+g);
  }
}

