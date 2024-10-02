class helcy {
  int a;

  public void meth() {

    System.out.println("helo");
  }
}

class min extends helcy {
  int b;

  public void meth1(){
    System.out.println("iku");
  }
}
public class sininher {
  public static void main(String[] args) {
    min obj = new min();
    obj.meth();
    obj.meth1();
  }
}
