package InterfacesAndInheritance;

public class MountainBike extends Bicycle {
    private String suspension;
    public int seatHeight;

    public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType) {
        super(startCadence, startSpeed, startGear);
        this.setSuspension(suspensionType);
    }

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a " + getSuspension() + " suspension.");
    }
}
