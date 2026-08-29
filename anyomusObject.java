class A {

    public A() {
        System.out.println("in a object");
    }

    public void show() {
        System.out.println("in a method");
    }
}

public class anyomusObject {

    public static void main(String[] args) {

        // Anonymous object:
        // Object is created, but its reference is not stored in a variable.
        new A();


        // Anonymous object:
        // A new A object is created and show() is called immediately.
        new A().show();


        // Another NEW anonymous object is created.
        // It is a different object from all previous objects.
        new A();


        // Another NEW anonymous object is created.
        // show() is immediately called on this new object.
        new A().show();


        // Reference variable + actual object:
        // obj is the reference variable.
        // new A() creates the actual object.
        A obj = new A();


        // Calling show() using the reference variable.
        // The same object created above is used.
        obj.show();
    }
}