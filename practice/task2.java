class one{
  int a;
   public int  getMeth(){
    return a * a;
   }
   public void setMeth( int a){
    this.a=a;
   }
}
class two extends one{
  int b;
  public int getMeth(){
    return b * b * b;
  }
  public void setMeth(int b){
    this.b=b;
  }
}
public class task2 {
  public static void main(String[] args) {
    one hlo = new two();
    one hii = new one();
    hlo.setMeth(4);
    System.out.println("cube of this num is:" +hlo.getMeth());
    hii.setMeth(5);
    System.out.println("Square of this:"+hii.getMeth());

    
  }
  
}
