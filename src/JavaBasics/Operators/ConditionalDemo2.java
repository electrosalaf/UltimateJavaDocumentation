/**
 * Ternary opeator evaluates to if-then-else.
 * If someCondition is true , assign value1 to result, otherwise assign value2 to result.
 */
package JavaBasics.Operators;

class ConditionalDemo2 {

    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}
