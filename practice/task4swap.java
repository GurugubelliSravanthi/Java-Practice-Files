class okk {
  int a = 1;
  int b = 2;
  int c;

  public void wow() {
      c = a; 
      a = b; 
      b = c; 

      System.out.println("value of a is: " + a);
      System.out.println("value of b: " + b); 
  }
}

public class task4swap {
  public static void main(String[] args) {
      okk papa = new okk();
      papa.wow();
  }
}
