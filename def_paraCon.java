class Human{
  private String name;
  private int age;

  
  public Human() {    // these is the default constructor
    name="vicky";
    age=20;
  }

    public Human(int age, String name) {   // these is the parameterized constructor
        this.age = age;
        this.name = name;
    }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  
}
public class def_paraCon {
  public static void main(String[] args) {
      Human obj=new Human();
      System.out.println(obj.getAge() + obj.getName());
      obj.setAge(21);
      obj.setName("Vicky Yadav");
      System.out.println(obj.getAge() + obj.getName());

  }
}
