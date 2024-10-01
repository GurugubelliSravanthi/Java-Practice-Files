package Myinterface;
  class  A{
  public final void disp(){
    System.out.println("wow");
  }
}
class B extends A{
public void disp(){
  System.out.println("jiii");
}
}
public class fin {
  public static void main(String[] args) {  
    B obj = new B();
    obj.disp();
    
  }
  
}
