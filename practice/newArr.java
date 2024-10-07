



import java.util.Scanner;
public class newArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers");
    
    int arr[] = new int[3];
    for(int i=0;i<3;i++){
      arr[i]=sc.nextInt();
    }

    for(int i=0;i<3;i++){
    System.out.println(arr[i]);
    }

  }
  
}
