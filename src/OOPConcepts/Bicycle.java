package OOPConcepts;

class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed += increment;
    }

    void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void printState() {
        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
    }
}


class BicycleDemo {
    public static void main(String[] args) {

        //  Create two different Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //  Invoke methods on those objects
        bike1.changeCadence(90);
        bike1.speedUp(60);
        bike1.changeGear(2);
        bike1.applyBrakes(0);
        bike1.printState();

        bike2.changeCadence(80);
        bike2.speedUp(50);
        bike2.changeGear(3);
        bike2.changeCadence(60);
        bike2.speedUp(10);
        bike2.changeGear(4);
        bike2.printState();
    }
        }