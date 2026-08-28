@FunctionalInterface
interface A {

  int show(int i, int j);
  // void start();
}

// class B implements A{
// public void show(){
// System.out.println("hey you can do it ");
// }
// }

public class fundamentalInterface {
  public static void main(String[] args) {
    // A obj = (int i)->System.out.println("hey you can do it "+ i);
    // obj.show(5);

    A obj = (int i, int j) -> i + j;
    System.out.println(obj.show(5, 9));
  }
}
