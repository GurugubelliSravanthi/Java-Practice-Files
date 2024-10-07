import java.util.Scanner;
public class nrnaEXX {
  public static void main(String[] args) {
    addNum();

  }

  public  static void addNum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first num");
    int one = sc.nextInt();
    System.out.println("enter second num");
    int two = sc.nextInt();
    int three = one + two;

    System.out.println("addition of two numbers = " + three);
  }
}
