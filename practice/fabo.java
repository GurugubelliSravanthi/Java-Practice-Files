package practice;

interface F {
  void febo();
}

class series implements F {
  public void febo() {
    int i;
    int n1 = 0;
    int n2 = 1;
    int n3;
    System.out.println(n1 + "" + n2);

    for (i = 1; i < 20; i++) {
      n3 = n1 + n2;
      System.out.println(+n3);
      n1 = n2;
      n2 = n3;
    }
  }
}

public class fabo {
  public static void main(String[] args) {
    F obj = new series();
    obj.febo();
  }
}