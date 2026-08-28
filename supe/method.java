// In Java, a method is simply a block of code that performs a specific task.

// package -> package supe; means:

// "This Java file belongs to a package/folder named supe."

// Therefore Java expects your file to be inside a folder called supe.

package supe;

class write{
  public void  pen(){
    System.out.println("i need a pen");
  }

  public String get_a_pen(int cost){
    if(cost>=10){
      // System.out.println("thanks, i got a pen");
      return "thanks, i got a pen";
    }else{
      // System.out.println("uhh , i don't have enough money to buy a pen");
      return "uhh , i don't have enough money to buy a pen";
    }
  }
}

public class method {
  public static void main(String[]args){
    write w= new write();
     w.pen();
     String s = w.get_a_pen(1);
    // System.out.println();
    System.out.println(s);
  }
}
