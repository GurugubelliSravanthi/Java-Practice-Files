import java.util.Scanner;
class A {
  int age;

  public void get() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ur number");
    this.age = sc.nextInt();
  }

  public void set() {
    System.out.println("ur num is :"+ age);
  }
}

class B extends A {
  String name;

  public void meth() {
    System.out.println("dolly");
  }
}
public class inher {
  public static void main(String[] args) {
    B obj = new B();
    obj.get();
    obj.set();
    obj.meth();
  }
}
