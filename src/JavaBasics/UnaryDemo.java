package JavaBasics;

class UnaryDemo {

    public static void main(String[] args) {

        int result =  +1;                                      // result is now 1
        System.out.println(result);

        result--;                                              // result is now 0, decrease by 1
        System.out.println(result);

        result++;                                              // result is now 1, increase by 1
        System.out.println(result);

        result = -result;                                      // result is now -1, negates the value
        System.out.println(result);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
    }
}
