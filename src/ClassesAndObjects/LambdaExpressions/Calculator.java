package ClassesAndObjects.LambdaExpressions;

public class Calculator {

    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {

        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a -b;
        System.out.println("40 + 2 = " + myApp.operateBinary(40,2, addition));
        System.out.println("20 - 2 = " + myApp.operateBinary(20, 2, subtraction));
    }
}
