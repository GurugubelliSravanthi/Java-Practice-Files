class fruits{
  int a;
  String names;

public fruits() {
  System.err.println("apple");
}
public fruits(int a) {
  System.out.println("your age is: "+a);
}
public fruits(int a , String names){
  System.out.println("your age:" +a+ "your name :"+names);
}
}
public class cons3 {
  public static void main(String[] args) {
   fruits ob = new fruits();
  }
}
