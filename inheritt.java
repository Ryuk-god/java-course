class cal{
  public int  add(int i,int j){
    return i+j;
  }
  public int sub(int i,int j){
    return i-j;
  }
}

class advCal extends  cal{
  public int mul(int i,int j){
    return i*j;
  }
  public int div(int i,int j){
    if(j>0){
      return i/j;
    }else{
      return 0;
    }
  }
}

class veryAdvCal extends advCal{
  public int power(int i,int j){
    return Math.powExact(i, j);
  }
}
// Inheritance is a feature of OOP where one class acquires the properties and methods of another class.

//  java only allow One class can have only one direct superclass.
// class c extend B 
// class c extend B,A; that is wrong give the error

// inherit should be single and also multi 
// cal -> advcal ->veryAdvCal

public class inheritt {
  public static void main(String[] args) {
      veryAdvCal obj = new veryAdvCal();
      int r1 = obj.add(10, 2);
      int r2 =obj.sub(10, 2);
      int r3= obj.mul(10, 2);
      int r4 =obj.div(10, 2);
      int r5 =obj.power(10, 2);
      System.out.println(r1 +" "+ r2);
      System.out.println(r3 +" "+ r4);
      System.out.println(r5);
  }
}
