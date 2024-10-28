class hi {
 private  int a;

 public int getmeth() {
   return a;
 }

 public void setmeth(int a) {
   this.a = a;
 }
 }
  class hlo extends hi {
    String app;

     hlo() {
      System.out.println("Default constuctor");
    }
 hlo(String apple) {
      System.out.println("esad");
      
    }
}

public class ExceptionEX {
      public static void main(String[] args) {
        // hlo obj = new hlo("tommy");
        hlo obj = new hlo();
  
      // System.out.println(obj.getmeth());
      }
    } 
  

