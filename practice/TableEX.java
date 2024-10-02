import java.util.Scanner;

public class TableEX {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter a num");
    int num = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println( num +" x " +i+" = "+num*i);
    }
  }
}
// 0,1=1,2,3,5,8,13,21,