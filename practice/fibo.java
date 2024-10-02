public class fibo {
  public static void main(String[] args) {
    int n1 = 0, n2 = 1;
    for (int i = 1; i <= 10; i++) {
      int n3 = n1 + n2;
      
      System.out.println(n1);
      n1 = n2;
      n2 = n3;
    }
  }
}
// n3=n1+n2(0+1)=1;0,1,1,2
// n4=n2+n3(2+1)