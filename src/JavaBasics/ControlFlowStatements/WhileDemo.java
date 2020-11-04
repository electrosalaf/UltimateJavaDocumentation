/**
 * The while statement evaluates expression, which must return a boolean value.
 * The while statement tests the expression, continues execution until expression evaluates to false.
 */
package JavaBasics.ControlFlowStatements;

class WhileDemo {
    public static void main(String[] args) {

        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
