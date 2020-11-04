/**
 * A labeled break statement terminates outermost switch, for, while, or do-while statement.
 * The break statement terminates the labeled statement; it does not transfer the flow of the control to the label
 */
package JavaBasics.ControlFlowStatements;

class BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8},
                { 622, 127, 77, 955}
        };
        int searchFor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.print("Found " + searchFor + " at " + i + ", " + j);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }
}

