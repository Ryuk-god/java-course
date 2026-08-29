// A constructor is a special member of a class that is automatically called when an object is created. It is mainly used to initialize the object's data.

class human{
  String name;
  int age;
  public human(){
    name="vicky";
    age=20;
  }
  public void show(){
    System.out.println(name +" "+ age);
  }
}
public class constructor {
  public static void main(String[] args) {
      human obj = new human();
      obj.show();
  }
}
