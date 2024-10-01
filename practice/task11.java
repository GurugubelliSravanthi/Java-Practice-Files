class Mango {
  int a;
  String name;

  
  public void fun() {
      System.out.println("joke");
  }

  public void fun(int a, String name) {
      System.out.println("Your age is: " + a + " and your name is: " + name);
  }
}

public class task11 {
  public static void main(String[] args) {
      Mango ohh = new Mango();
    
      ohh.fun(6, "doll"); 
  }
}
