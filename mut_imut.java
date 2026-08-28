public class mut_imut {
  public static void main(String[] args) {
      //mutable -> can be changed
      String s =new String("Vicky");
      s=s.concat("hello"+s);
      System.out.println(s);
      s.concat("yadav");
      System.out.println(s);
  }
}
