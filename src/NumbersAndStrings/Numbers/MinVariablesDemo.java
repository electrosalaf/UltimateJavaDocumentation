package NumbersAndStrings.Numbers;

public class MinVariablesDemo {
    public static void main(String[] args) {

        //  Integers
        byte smallestByte = Byte.MIN_VALUE;
        short smallestShort = Short.MIN_VALUE;
        int smallestInt = Integer.MIN_VALUE;
        long smallestLong = Long.MIN_VALUE;

        //  Real numbers
        float smallestFloat = Float.MIN_VALUE;
        double smallestDouble = Double.MIN_VALUE;

        //  Other primitive types
        char aChar = 's';
        boolean aBoolean = false;

        //  Display them all
        System.out.println("The smallest byte value is " + smallestByte + ".");
        System.out.println("The smallest short value is " + smallestShort + ".");
        System.out.println("The smallest integer value is " + smallestInt + ".");
        System.out.println("The smallest long value is " + smallestLong + ".");

        System.out.print("The smallest float value is " + smallestFloat + ".");
        System.out.println("The smallest double value is " + smallestDouble + ".");

        if (Character.isLowerCase(aChar)) {
            System.out.println("The character " + aChar + " is lower case.");
        } else {
            System.out.println("The character " + aChar + " is upper case.");
        }
        System.out.println("The value of boolean is " + aBoolean + ".");
    }
}
