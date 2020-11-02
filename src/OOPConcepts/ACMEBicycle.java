package OOPConcepts;

interface Radio {

    // Behaviour of the Radio Object
    void volumeHigh(int increment);

    void volumeLow(int decrement);

    void tuneIn(double newStation);

    void scanning(double newStation);

}

//  Use the keyword implements to use the interface declared above...
class TableRadio implements Radio {

    int currentVolume = 0;
    double tune = 0;
    double scan = 0;

    //  Compiler will now require that methods volumeHigh, volumeLow, tuneIn, and scanning
    //  all implemented. Compilation will fail if those methods are missing from this class.

    public void volumeHigh(int increment) {
        currentVolume += increment;
    }

    public void volumeLow(int decrement) {
        currentVolume -= decrement;
    }

    public void tuneIn(double newStation) {
        tune = newStation;
    }

    public void scanning(double newStation) {
        scan = newStation;
    }

    public void printState() {
        System.out.println();
    }
}

//  To compile the class Radio, you'll need to add public keyword to the beginning of the implemented interface methods.
