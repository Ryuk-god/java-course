// A static variable is a variable declared using the static keyword. It belongs to the class rather than to individual objects, so only one copy is created and shared by all objects of that class.

class newModel{
  String brand;
  int price;
  static String name;

  public void show(){
    System.out.println("Brand: "+brand + "price: "+price + "name: "+name);
  }

  public static void show1(newModel obj){
    System.out.println("Brand: "+obj.brand + "price: "+obj.price + "name: "+name);
  }
}
class mobile{
  String brand;
  int price;
  static String name;

  public void show(){
    System.out.println("Brand: "+brand + " price: "+price + " name: "+name);
  }

  public static void show2(mobile obj){
    System.out.println("Brand: "+obj.brand + " price: "+obj.price + " name: "+name);
  }

}

public class staticMethod {
  public static void main(String[] args) {
    mobile.name ="smartphone";
    
      mobile obj1 = new mobile();
      obj1.brand="apple";
      obj1.price=2000;

    newModel obj2=new newModel();
    obj2.brand="samsung";
    obj2.price= 1999;

    newModel.name = "+1";

    newModel.show1(obj2);
    obj1.show();

    obj2.show();
    mobile.show2(obj1);
  }
}
