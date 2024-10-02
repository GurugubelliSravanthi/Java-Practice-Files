

import java.util.Scanner;
public class GradeEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the marks of 3 subj");
    int m1 = sc.nextInt();
    int m2 = sc.nextInt();
    int m3 = sc.nextInt();
    int total = m1 + m2 + m3;
    int avg = total / 3;
    System.out.println("total marks" + total);
    System.out.println("avg"+avg);
    }
  }
  

