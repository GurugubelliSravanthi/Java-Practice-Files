package Myinterface;

class animal{
  void happy(){
   System.out.println("it sounds to good");
  }
}
class duck extends animal{
  void happy(){
    super.happy();
     System.out.println("im cute animal");
    }
  }
  public class spr{
    public static void main(String[] args) {
      duck obj = new duck();
      obj.happy();
    }
  }
