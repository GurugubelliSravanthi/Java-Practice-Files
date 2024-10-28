// package controltStatements;

// public class forEx {
//   public static void main(String[] args) {
//     String name = "helcy";
//     for (int i = 1; i <= 100; i++) {
//       System.out.println(i +":"+ name);
//     }
//   }

// }
import java.util.Scanner;

public class forEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;

    while (num >= 0) {
      System.out.print("Enter a number: ");
      num = sc.nextInt(); 
      if (num >= 0) {
        System.out.println("You entered: " + num);
      }
    }

    System.out.println("Negative number entered. Exiting...");
  }
}
