// super()->super() is used inside a subclass constructor to call the constructor of its immediate superclass (parent class).

// this()->this() is used inside a constructor to call another constructor of the same class.

class A{
  public A(){
    System.out.println("in A constructor");
  }
  public A(int n){
    System.out.println(n);
  }
}

class B extends A
{
  
  public B(){
    super();
    System.out.println("in B constructor");
  }
  public B(int n){
     super(n);
    System.out.println(n);
  }

  public B(double d){
     this();
    System.out.println(d);
  }

}
public class this_super_method {
  public static void main(String[] args) {
      // A obj = new A();
      B obj1=new B();
      obj1 = new B(5);
      
      
  }
}
