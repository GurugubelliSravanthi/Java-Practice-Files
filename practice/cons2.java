class uff{
  int age;
  String name;
  
  public uff() {
    System.out.println("hii");
  }
  public uff(int age){
    this.age=age;
    System.out.println("your age is:" +age);

  }
  public uff(int age, String name){
    this.age=age;
    this.name=name;
    System.out.println("your age is:" +age+ "your name is :" +name);
  }
}
public class cons2 {
  public static void main(String[] args) {
    uff aloo = new uff(21,"dolly");
    
  }

  
}
