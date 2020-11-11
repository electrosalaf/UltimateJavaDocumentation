/**
 * Note that an inner class can exist only within an instance of the outer class.
 * An inner class has direct access to the fields and members of its enclosing class.
 * To instantiate an inner class, you must first instantiate an outer class.
 * You can create an object of the outer class with the syntax in the next line:
 * OuterClass outerObject = new OuterClass
 * You can create an inner object within the outer object with the syntax in the next line:
 * OuterClass.InnerClass innerObject = outerObject.new InnerClass();
 */
package ClassesAndObjects.NestedClasses;

public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel (int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel f1 = st.new FirstLevel();
        f1.methodInFirstLevel(23);
    }
}
