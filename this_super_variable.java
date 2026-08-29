class A extends Object{
  int num=1;
}
class B extends A{
  int num=2;
  public int getValue(){
    int num=3;
    // return num;  // this give the output of nearest num 3
    return this.num; // this give the output of subclass 2
      // return super.num;  // this give the output of superclass 1
  }
}

public class this_super_variable {
  public static void main(String[] args) {
    B obj=new B();
    System.out.println(obj.getValue());
  }
}