import java.util.Scanner;
class hello{
  public int age;
  public int getMethod(){
    return age;
  }
  public void setMethod(int age){
this.age= age;
  }
}

public class thisDemo {
  public static void main(String[] args) {
    int n;
    hello oo = new hello();
    Scanner obj = new Scanner(System.in);
    System.out.println("enter your age :");
    n= obj.nextInt();
    oo.setMethod(n);

    System.out.println("your age is:"+oo.getMethod());
    
  }
  
}
