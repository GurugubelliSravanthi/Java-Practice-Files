abstract class A {
  
  abstract void dis();
  public void display() {
    System.out.println("hello");
  }
}

class B extends A {
  public void dis(){
System.out.println("hyy");
  }
}

public class abst {
  public static void main(String[] args) {
    A obj = new B();
    obj.dis(); 
    obj.display();
  }
}
