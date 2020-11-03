/**
 * &  bitwise AND.
 * ^  bitwise exclusive OR.
 * |  bitwise inclusive OR.
 * ~  Unary bitwise complement operator that inverts a bit pattern.
 * << Signed left shift.
 * >> Signed right shift.
 * >>> Unsigned right shift operator shifts a zero into the leftmost position.
 * THE BIT PATTERN IS GIVEN BY THE LEFT-HAND OPERAND && RIGHT-HAND OPERAND REPRESENTS THE NUMBER OF POSITION TO SHIFT
 */
package JavaBasics;

class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;

        // prints 2
        System.out.println(val & bitmask);
    }
}
