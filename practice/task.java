class sq{
  int a;
  public int getMethod(){
    return a * a;
  }
  public void setMethod(int a){
  this.a=a;
  }
  
}

class cube extends sq{
  int b;
  public int getMethod(){
    return b * b * b;
  }
  public void setMethod(int b){
    this.b=b;
  }
}
public class task {
  public static void main(String[] args) {
     sq objj = new cube();
     sq obj2 = new sq();
     obj2.setMethod(2);
     
     System.out.println("sq of the num is :" +obj2.getMethod());
    objj.setMethod(5);
   
    System.out.println("cube of the num is :" +objj.getMethod());
  }
  
}
