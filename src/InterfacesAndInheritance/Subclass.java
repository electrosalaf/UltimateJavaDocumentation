package InterfacesAndInheritance;

public class Subclass extends Superclass {

    //  Override printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in superclass.");
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
    }
}
