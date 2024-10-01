import java.util.Scanner;
public class meth{

  public static void main(String[] args) {
    
    hii();

    hlo("hello");

    int g=jasm();
    System.out.println("mutliplication of 2 num: "+g);

    
int a;
int b;
Scanner objj = new Scanner(System.in);
System.out.println("enter 2 num :");
a = objj.nextInt();
b = objj.nextInt();
int c = ramo(a,b);
  System.out.println("sub of 2 num :"+c);

   }

public static void hii(){    // no arg no retu
System.out.println("oo");
System.out.println("ii");

}
//retu nd arg
public static void hlo(String a ){
  System.out.println(a);

}
//ret but no arg

public static int jasm(){
  int gt;
  int gy;
  Scanner obj = new Scanner(System.in);
  System.out.println("enter 2 num:");
gt= obj.nextInt();
gy= obj.nextInt();
  int go = gt*gy;
 

  return go;
}

//no ret but arg

public static int ramo(int a, int b){

  int c= a-b;

  return c;
 
}
}