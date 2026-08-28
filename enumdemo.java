enum laptop{
  macbook(2000),xps(1200),acer(2000),hp(1500);

  private int price;

  private laptop() {
    price = 200;
  }

  private laptop(int price){
    this.price =price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
}

public class enumdemo {
  public static void main(String[] args) {
     laptop lap=laptop.macbook;
    	System.out.println(lap+ " : "+lap.getPrice());

      for(laptop l : laptop.values()){
        System.out.println("lap have : "+ l + " and the price is:  "+l.getPrice() );
      }
  }

}
