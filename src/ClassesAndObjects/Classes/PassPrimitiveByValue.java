/**
 * This program passes primitive data type into its method by value.
 * Any changes to the value of the parameter exists only within the scope of the method.
 * Also, reference data types such as objects, are also passed as arguments into methods by value.
 * When the method returns, the passed-in reference still references the same object as before.
 * Value of the object's field can be changed in the method, with proper access level.
 */
package ClassesAndObjects.Classes;

public class PassPrimitiveByValue {
    public static void main(String[] args) {

        int x = 3;

        //  Invoke passMethod() with x as argument
        passMethod(x);

        //  Print x to see if its value changed
        System.out.println("After invoking passMethod, x = " + x);
    }

    //  Change parameter in passMethod()
    public static void passMethod(int p) {
        p = 10;
    }
}
