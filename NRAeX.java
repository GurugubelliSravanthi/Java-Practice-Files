import java.util.Scanner;

public class NRAeX {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num");
    int a = sc.nextInt();
    System.out.println("Enter a num");
    int b = sc.nextInt();

    Add(a, b);

  }

  public static void Add(int a, int b){
    int c = a + b;
    System.out.println(c);
  }
}