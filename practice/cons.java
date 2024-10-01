package practice;
class pop{
  String name;
int age;
char sec;

public pop(){
  System.out.println("call");

}
public pop(int age){
  this.age = age;
  System.out.println("your age : "+this.age);
}
public pop(int age,String name){
  this.age = age;
  this.name= name;
  System.out.println("age :" +age+" name : "+name);
}
public pop(int age,String name,char sec){
  this.age = age;
  this.name = name;
  this.sec=sec; 
  System.out.println("age :" +age+" name : "+name +  " sec  :" +sec);
}
}
public class cons {
  public static void main(String[] args) {
    pop ji = new pop(19,"dolly",'1');
  }
  
}
