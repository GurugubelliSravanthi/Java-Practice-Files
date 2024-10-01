import java.util.Scanner;

class vari{
  int a ;
  String name;
  char sec;

  public void name(){
    Scanner obj = new Scanner(System.in);
    System.out.println("enter your integer");
     a = obj.nextInt();
    obj.nextLine();

    System.out.println("enter your name");
     name = obj.nextLine();

    System.out.println("enter your sec");
     sec = obj.next().charAt(0);

    System.out.println("ur interger is :"+a);
    System.out.println("ur name is:"+name);
    System.out.println("your sec is :"+sec);
  }

  }
public class Task1var {
  public static void main(String[] args) {
    vari oo = new vari();
    oo.name();
  }
  
}
