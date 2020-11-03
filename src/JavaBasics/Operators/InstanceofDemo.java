/**
 * This can be used to check if an object is an instance of a class, an instance of a subsclass,
 *  or an instance of a class that implements a particular interface.
 *  KEEP IN MIND THAT NULL IS NOT AN INSTANCE OF ANYTHING!!!
 */

package JavaBasics.Operators;

class InstanceOfDemo {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Parent();

        System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
        System.out.println("obj1 instanceof myInterface: " + (obj1 instanceof myInterface));
        System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
        System.out.println("obj2 instanceof myInterface: " + (obj2 instanceof myInterface));
    }
}

class Parent { }

class Child extends Parent implements myInterface{}

interface myInterface { }