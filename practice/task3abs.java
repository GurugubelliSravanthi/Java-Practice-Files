abstract class college{
abstract void checklist();

}
class student1 extends college{
  public void checklist(){
    int a = 20;
    System.out.println(a);
  }
}
class student2 extends college{
  public void checklist(){
int a = 30;
System.out.println(a);
  }
}
public class task3abs{
  
  public static void main(String[]args){
    college obj = new student2();
    obj.checklist();
  }
}
