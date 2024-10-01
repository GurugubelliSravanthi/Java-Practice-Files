
package Myinterface;
import java.util.Scanner;
public class hdfc implements Sbi {
public void disparr(){
System.out.println("amount is low");
}  
public void inputarr(){
  int []a = new int[3];
  Scanner ik = new Scanner(System.in);
  System.out.println("Enter ur array :");
  for(int i=0;i<=2;i++){
  a[i] = ik.nextInt();
  }
  for(int i=0;i<=2;i++){
  System.out.println(a[i]);
  }
}
}
