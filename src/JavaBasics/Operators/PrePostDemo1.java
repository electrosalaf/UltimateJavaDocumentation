package JavaBasics.Operators;

class PrePostDemo1 {
    public static void main(String[] args) {

        int i = 3;
        i++;
        System.out.println(i);          // prints 4
        ++i;
        System.out.println(i);          // prints 5
        System.out.println(++i);        // prints 6, evaluates to incremented value.
        System.out.println(i++);        // prints 6, evaluates to original value.
        System.out.println(i);          // prints 7
    }
}
