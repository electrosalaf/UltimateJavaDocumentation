package NumbersAndStrings.Numbers;

import java.text.DecimalFormat;

public class FPAdder {
    public static void main(String[] args) {

        int numArgs = args.length;

        //  This program requires at least two arguments on the command line
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguements.");
        } else {
            double sum = 0.0;

            for (int i = 0; i < numArgs; i++) {
                sum += Double.valueOf(args[i]).doubleValue();
            }

            //  Format the sum
            DecimalFormat myFormatter = new DecimalFormat("###,###.##");
            String output = myFormatter.format(sum);

            //  Print sum
            System.out.println(sum);
        }
    }
}
