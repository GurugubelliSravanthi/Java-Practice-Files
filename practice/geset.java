class Wow {
  public String name;

  public String getMethod() {
    return name;
  }

  public void setMethod(String name) {
    this.name = name;
  }
}

public class geset {
  public static void main(String[] args) {
    Wow obj = new Wow();
    obj.setMethod("dolly");
    System.out.println(obj.getMethod());

  }
}
