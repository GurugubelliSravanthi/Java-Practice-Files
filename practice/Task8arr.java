import java.util.Scanner;

class typesarray{
  int []hi = new int[5];

  public void inparr(){
  Scanner ofc = new Scanner(System.in);
  System.out.println("enter the size of aray:");
  for( int i=0;i<=4;i++){
  hi[i] = ofc.nextInt();
  }

  System.out.println("the array is: ");
  for(int i=0;i<=4;i++){
    System.out.println(hi[i]);
  }
  
  }
}
class asdf extends typesarray{
  String []foo = new String[5];

  public void strarr(){
    Scanner gh = new Scanner(System.in);
    System.out.println("enter the name of array : ");
    for(int i=0;i<=4;i++){
     foo[i] = gh.nextLine();
    }
    System.out.println("the array is :");
    for(int i=0;i<=4;i++){
    System.out.println(foo[i]);
  }
}
}


public class Task8arr {
  public static void main(String[] args) {
    asdf uu = new asdf();
    uu.inparr();
    uu.strarr();
  }
}
