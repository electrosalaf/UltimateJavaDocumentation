package NumbersAndStrings.Numbers;

public class ValueOfDemo {
    public static void main(String[] args) {

        // This program requires two arguments on the command line
        if (args.length == 2) {
            //  Convert strings to numbers
            float a = (Float.valueOf(args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue();

            //  Do some arithmetic
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.print("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("This program requires two command-line arguments.");
        }
    }
}
