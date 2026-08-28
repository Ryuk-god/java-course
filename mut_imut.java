public class mut_imut {
  public static void main(String[] args) {
      //mutable -> can be changed
    
      String s =new String("Vicky");
      s=s.concat("Yadav");

      // s=s.concat("hello"+s);
      System.out.println(s);
      // s.concat("yadav");  // new String created 
      // s=s.append("yadav");
      // System.out.println(s);
  }
}
