class calci{
  int num=5;
  public int add(int i,int j){
    System.out.println("initial  num value :"+ num);
    return i+j;
  }
}

public class stack_heap {
  public static void main(String[] args) {
      calci obj = new calci();
      calci obj1= new calci();
      int r1= obj.add(4,3);
      obj.num=8;
      System.out.println("value of r1 or obj after add i and j "+r1);
      System.out.println("update value of obj.num "+obj.num);
      System.out.println("object 2 value of num without update "+obj1.num);
  }
}
