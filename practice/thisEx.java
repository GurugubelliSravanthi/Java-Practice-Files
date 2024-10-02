class sravs {
  String name;

  public String getMethod() {
    return name;
  }

  public void setMethod(String name){
    this.name = name;
  }
}
public class thisEx {
  public static void main(String[] args) {
    sravs obj = new sravs();
    obj.setMethod("tomy");
    System.out.println(obj.getMethod());
  }
  
}
