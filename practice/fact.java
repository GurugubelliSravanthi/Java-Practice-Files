import java.util.Scanner;

public class fact{
public static void main(String[] args) {
    Scanner o = new Scanner(System.in);
    System.out.println("Enter your num:");
    int n = o.nextInt();
    int f=1;
    for(int i=n;i>=1;i--){
        f=f*i;

    }
    System.out.println("fact of this num: "+f);
}
}