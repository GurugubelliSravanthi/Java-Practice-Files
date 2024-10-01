class tango extends Thread {
  public void run() {
    for (int i = 1; i <= 3; i++) {
      try {
        Thread.sleep(1000);
        System.out.println("priority:" + getPriority() + " name: " + getName());

      } catch (Exception ob) {
        System.out.println(ob.getMessage());
      }
    }
  }
}

public class thred {
  public static void main(String[] args) {
    tango t1 = new tango();
    tango t2 = new tango();

    t1.setPriority(1);
    t2.setPriority(2);

    t1.setName("helcy");
    t2.setName("tommy");

    t1.start();
    t2.start();

  }
}