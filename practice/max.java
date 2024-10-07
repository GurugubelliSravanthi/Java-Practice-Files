
import java.util.Scanner;
public class max {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the 1st num");
    int a = sc.nextInt();//24
    System.out.println("enter the  2nd num ");
    int b = sc.nextInt();//27
    System.out.println("enter the 3 rd num");
    int c = sc.nextInt();//26
    
    if(a>b&&a>c){
System.out.println("a is big");
} else if (b > a && b > c) {
  System.out.println("b is big");
} else {
      System.out.println("c is big");
    }
  }
}
