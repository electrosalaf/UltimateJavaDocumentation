/**
 * The difference between do-while: do-while evaluates its expression at the bottom.
 * Statements within the do block are always executed at least once.
 */

package JavaBasics.ControlFlowStatements;

class DoWhileDemo {
    public static void main(String[] args) {

        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}

