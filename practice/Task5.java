import java.util.Scanner;

public class Task5 {
  public static void main(String[] args) {
    int a;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a number to check it is divi by 5 or not :");
      a = obj.nextInt();

    if(a % 5==0){
      System.out.println("it is divisible by 5 ");
    } else{
      System.out.println("it is not divisble by 5 ");
    }
  }
}
