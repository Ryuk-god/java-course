// make a static variable so we cannot define to each object personally the things
class mobile{
  String brand;
  int price;

  static String name;

  public void show(){
    System.out.println("Brand: "+brand + " Price: "+price + " " +name);
  }
}

public class staticVariable {
  public static void main(String[] args) {

    mobile.name = "smartphone";
      mobile obj1= new mobile();
      obj1.brand ="APPLE";
      obj1.price = 2000;
      obj1.name = "smartphone";

      mobile obj2= new mobile();
      obj2.brand = "One plus";
      obj2.price = 1200;
      obj2.name = "+1";

      mobile.name = "smartphone";

      // these prove the last static variable is give that is for the all 
      obj1.show();
      obj2.show();

  }
}
