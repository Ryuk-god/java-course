abstract class car {
  public abstract void drive();

  public void playmusic() {
    System.out.println("play music");
  }
}

class bmw extends car {

  public void drive() {
    System.out.println("driving..");
  }
}

public class abstact {
  public static void main(String[] args) {
    car obj = new bmw();
    obj.drive();
    obj.playmusic();
  }
}
