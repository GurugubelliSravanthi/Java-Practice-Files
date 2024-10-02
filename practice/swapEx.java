import java.util.Scanner;
public class swapEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1 num");
    int a = sc.nextInt();
    System.out.println("enter 2 num");
    int b = sc.nextInt();
    System.out.println("before swapping a" + a + ",b" + b);
    int c;
    c=a;
    a=b;
    b=c;
    System.out.println("after swapping a"+a+",b"+b);

  }
}
