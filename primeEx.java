// n=5
// counter=0
// 5%1==0 T c=1
// 5%2==0 f
// 5%3==0 f
// 5%4==0 f
// 5%5==0 T c=2
// n=6
// c =0
// 6%1==0 t
// 6%2==0 t
// 6%3==0 t
// 6%4==0 f
// 6%5==0 f 
// 6%6==0 t
import java. util.Scanner;
public class primeEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a numer");
    int num = sc.nextInt();//3
    int c = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) { //3%1 ==0 //3%2 ==0 //3%3==0
      
        c++; //1 //2
      }
    }
    if (c == 2) {
      System.out.println("it is prime");
    } else {
      System.out.println("not a prime");
    }
  }
}