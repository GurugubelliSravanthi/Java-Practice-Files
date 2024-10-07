import java.util.Scanner;

public class RAeX {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num");
int a = sc.nextInt();
System.out.println("enter 2 num");
int b = sc.nextInt();
int c = Add(a, b);
  System.out.println(c);
    
  }
public static int Add(int a,int b){
  int c = a+b;
  return c;
}
}
