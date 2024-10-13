import java.util.Scanner;
public class palindromeEx {



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();//123
    int numbers = num;//123
    int r = 0;
// 123=num
    while (num != 0) {
      int d = num % 10;//123%10=3 //12%10=2 //1
      r = r * 10 + d;//0*10+3=3  //32//321
      num /= 10;//123/10=12 //1 // 0
    }
    if (numbers == r) {
      System.out.println("palindrome");
    } else {
      System.out.println("not a palindrome");
    }

  }
}
