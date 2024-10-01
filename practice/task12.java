class butter{
  int a ;
  String name;
   
    butter(){
    System.out.println("hello");
  }
    butter(int a){
      System.out.println(a);
  }
  butter(int a , String name){
    System.out.println("age is:"+a+ "name is:"+name);
  }
}
public class task12 {
  public static void main(String[] args) {
    butter obj = new butter(5,"dolly");
    
  }
}
