

class comp {
  String name = null;

  public void meth() {
    try {
      System.out.println(name.length());
    } catch (NullPointerException po) {
      System.out.println(po.getMessage());
    }

  }
}

public class exce {
  public static void main(String[] args) {
    comp hhh = new comp();
    hhh.meth();

    int x;
    int a = 10;
    int b = 5;
    int c = 20;
    try {
      x = 100 / 0;
      System.out.println(x);
    } catch (ArithmeticException A) {
      System.out.println(A.getMessage());
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

  }

}
