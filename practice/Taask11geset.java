class hii{
  public int a;
  public int getMethod(){
return a;

  }
  public void setMethod(int a){
   this.a=a;

  }
}
public class Taask11geset {
  public static void main(String[] args) {
    hii po = new hii();

    po.setMethod(8);
    System.out.println(po.getMethod());
    
  }
  
}
