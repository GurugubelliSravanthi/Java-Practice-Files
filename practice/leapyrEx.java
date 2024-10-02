
import java.util.Scanner;
public class leapyrEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the yr ");
    int year = sc.nextInt();
    if( (year % 4==0 )&& (year %100!=0||year %400==0)){
      System.out.println(year+"is leap year");
    } else {
      System.out.println("not a leap yr");
    }
  }
}
// 2016%4
// 2016!%100 || 2016%400
