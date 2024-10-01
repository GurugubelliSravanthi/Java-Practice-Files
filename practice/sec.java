import java.util.Scanner;
class how{
  String d [] = new String[5];
  public void inputStr(){
    Scanner s = new Scanner(System.in);
    System.out.println("enter 5 names");
    for( int i=0;i<=4;i++){

      d[i]=s.nextLine();

    }
  }
    public void output(){
      System.out.println("uh have entered ");
      for( int i=0;i<=4;i++){
        System.out.println(d[i]);

    }
  }
}
class dolly extends how{
  int s;

  public void helsi(){
    Scanner os = new Scanner(System.in);
    System.out.println("Enter your age");
    s=os.nextInt();
    if(s>18){
      System.out.println("major");
    }
    else{
      System.out.println("minor");
    }

  }

}

 class sec {
  public static void main(String[] args) {
    
    dolly objj = new dolly();
    objj.helsi();
    objj.inputStr();
    objj.output();
    
  }
}
