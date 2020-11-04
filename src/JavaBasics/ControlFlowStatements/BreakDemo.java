/**
 * This program search for the number 12 in the array.
 * The break statement terminates the for loop when the value is found.
 * The control flow then transfers to the statement after the for loop.
 */
package JavaBasics.ControlFlowStatements;

public class BreakDemo {
    public static void main(String[] args) {

        int[] arrayOfInts = {
                32, 87, 3, 589,
                12, 1076, 2000,
                8, 622, 127};
        int searchFor = 12;

        int i;
        boolean foundIt = false;

        for (i=0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }
}
