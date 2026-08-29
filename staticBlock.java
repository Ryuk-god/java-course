class mobile{
  String brand;
  int price;

  static String name ;

  static{
    name = "smartphone";
    System.out.println("I'm in the static block");
  }

  //constructor
  public mobile(){
    brand="";
    price=200;
    System.out.println("in the constructor");
  }

  public void show(){
    System.out.println(brand + price + name);
  }
}
public class staticBlock {
  public static void main(String[] args)  throws ClassNotFoundException {
    Class.forName("mobile"); // it's run the class 

    mobile obj =new mobile();
    obj.brand="apple";
    // obj.price = 2000;
    // obj.name="+1";
    obj.show();

  }
}
