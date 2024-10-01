import java.util.Scanner;


public class Task3if {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter your age:");
    int a = obj.nextInt();

    if(a>=18){
      System.out.println("your are eligible for vote");
    } else {
      System.out.println("your not eligible");
    }
  }
  
}
