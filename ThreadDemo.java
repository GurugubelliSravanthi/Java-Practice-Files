

// class akhil extends Thread {
//   public void run() {
//     for (int i = 1; i <= 3; i++) {
//       try {
//         Thread.sleep(1000);
//         System.out.println("priority:" + getPriority() + "name:" + getName());

//       } catch (Exception po) {
//         System.out.println("your code is wrong vrooo");

//       }
//     }//multiplr thre mul taks
//   }
// }

// public class thread {
//   public static void main(String[] args) {
//     akhil obj1 = new akhil();
//     akhil obj2 = new akhil();
//     akhil obj3 = new akhil();

//     obj1.setPriority(3);
//     obj2.setPriority(4);
//     obj3.setPriority(6);

//     obj1.setName("chuuu");
//     obj2.setName("ewwww");
//     obj3.setName("mewwww");

    
//     obj1.start();
//     obj2.start();
//     obj3.start();
//   }

// }

// class Akhil extends Thread {
//   public void run() {
//     for (int i = 0; i <= 3; i++) {
//       try {
//         Thread.sleep(1000);
//         System.out.println("Priority: " + getPriority() + " | Name: " + getName());
//       } catch (Exception e) {
//         System.out.println("Something went wrong");
//       }
//     }
//   }
// }

// public class ThreadDemo {
//   public static void main(String[] args) {
//     Akhil thread1 = new Akhil();
//     Akhil thread2 = new Akhil();
//     Akhil thread3 = new Akhil();

//     // Setting priority
//     thread1.setPriority(3);
//     thread2.setPriority(5);
//     thread3.setPriority(6);

//     // Setting thread names
//     thread1.setName("Mac");
//     thread2.setName("Linux");
//     thread3.setName("Windows");

//     // Starting the threads
//     thread1.start();
//     thread2.start();
//     thread3.start();
//   }
// }
class Dolly extends Thread {
  public void run() {
    for (int i = 0; i <= 3; i++) {
      try {
        Thread.sleep(1000);
        System.out.println("priority of :" +getPriority()+ "name:" +getName());
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Something went wrong error.....");
      }
    }

  }
}

public class ThreadDemo {
  public static void main(String[] args) {
    Dolly t1 = new Dolly();
    Dolly t2 = new Dolly();

    t1.setPriority(1);
    t2.setPriority(2);

    t1.setName("java");
    t2.setName("python");

    t1.start();
    t2.start();
  }
}