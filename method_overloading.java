//method_overloading->Method overloading means having multiple methods with the same name but different parameters.

class load {
  public int add(int a, int b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public double add(double a, int b) {
    return a + b;
  }
}

public class method_overloading {
  public static void main(String[] args) {
    load a = new load();
    int first = a.add(4, 5);
    int sec = a.add(4, 5, 6);
    double thi = a.add(4.4, 2);
    System.out.println(first);
    System.out.println(sec);
    System.out.println(thi);
  }
}
