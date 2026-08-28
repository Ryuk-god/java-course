public class mut_immut {

    public static void main(String[] args) {

        // =========================================================
        // 1. STRING
        // =========================================================

        // String is IMMUTABLE
        // Once a String object is created, its content cannot be changed.

        String s = new String("Vicky");

        System.out.println(s);
        // Output: Vicky


        // concat() does NOT change the existing String object.
        // It creates a NEW String object.

        s.concat(" Yadav");

        System.out.println(s);
        // Output: Vicky
        // Why?
        // Because we didn't store the new String anywhere.


        // We can store the NEW String back into s.

        s = s.concat(" Yadav");

        System.out.println(s);
        // Output: Vicky Yadav

        // IMPORTANT:
        // String is STILL immutable.
        // s is simply pointing to the new String object.


        // =========================================================
        // 2. STRINGBUILDER
        // =========================================================

        // StringBuilder is MUTABLE.
        // Its existing object can be changed.

        StringBuilder sb = new StringBuilder("Vicky");

        System.out.println(sb);
        // Output: Vicky


        // append() changes the SAME StringBuilder object.

        sb.append(" Yadav");

        System.out.println(sb);
        // Output: Vicky Yadav


        // We don't need:
        // sb = sb.append(" Yadav");
        //
        // because append() already modifies the existing object.


        // =========================================================
        // 3. STRINGBUFFER
        // =========================================================

        // StringBuffer is also MUTABLE.

        StringBuffer sbf = new StringBuffer("Vicky");

        System.out.println(sbf);
        // Output: Vicky


        // append() changes the SAME StringBuffer object.

        sbf.append(" Yadav");

        System.out.println(sbf);
        // Output: Vicky Yadav


        // StringBuffer is synchronized.
        // Therefore it is useful when multiple threads
        // need to work with the same StringBuffer object.


        // =========================================================
        // 4. OTHER STRINGBUILDER / STRINGBUFFER METHODS
        // =========================================================

        StringBuilder x = new StringBuilder("Hello");


        // append() → adds at the end

        x.append(" World");

        System.out.println(x);
        // Output: Hello World


        // insert() → adds at a particular position

        x.insert(5, " Java");

        System.out.println(x);
        // Output: Hello Java World


        // delete() → removes characters

        x.delete(5, 10);

        System.out.println(x);
        // Output: Hello World


        // reverse() → reverses the string

        x.reverse();

        System.out.println(x);
        // Output: dlroW olleH
    }
}