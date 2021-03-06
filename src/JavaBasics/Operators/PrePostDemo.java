/**
 * expr++ evaluates to original value.
 * ++expr evaluates to incremented value.
 */
package JavaBasics;

class PrePostDemo {
    public static void main(String[] args) {

        int i = 3;

        i++;
        System.out.println(i);                                 // prints 4

        ++i;
        System.out.println(i);                                 // prints 5

        System.out.println(++i);                              // prints 6

        System.out.println(i++);                              // prints 6

        System.out.println(i);                               // prints 7
    }

}
