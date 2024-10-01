import java.util.Scanner;

class jiii extends helsi {
  int a = 5;
  int b = 6;
  int c;

  public void hello() {
      c = a;
      a = b;
      b = c;

      System.out.println("a value is : " + a);
      System.out.println("b value is : " + b);
  }
}
class helsi {
  int n;

  public void baskin(){
    Scanner sa = new Scanner(System.in);
    System.out.println("enter a number: ");

    n = sa.nextInt();

    for(int i=1;i<=n;i++){

      System.out.println(i);

    }


    }
  }


public class Swap {
  public static void main(String[] args) {
      jiii obj = new jiii();
      obj.hello();
      
      obj.baskin();
  }
}


