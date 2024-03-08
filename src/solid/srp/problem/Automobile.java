package solid.srp.problem;

/**
 * Single Responsibility Principle
 * Problem Implementation
 */
public class Automobile {
    String regNo;
    String chasisNo;
    String ownerName;
    String brandName;

    public Automobile(String reg, String chasis, String brand, String owner) {
        this.regNo = reg;
        this.chasisNo = chasis;
        this.brandName = brand;
        this.ownerName = owner;
    }

    public boolean startEngine() {
        System.out.println("Starting the Engine");
        return true;
    }

    public boolean stopEngine() {
        System.out.println("Stopping the Engine");
        return true;
    }

    public boolean shiftGear(int gearNumber) {
        System.out.println("Gear shifted to " + gearNumber);
        return true;
    }

    public void raiseAlarm(String alarm) {
        System.out.println("!!!!!" + alarm + "!!!!!");
    }

    public boolean applyBrake(String brakeType) {
        System.out.println("Brake applied " + brakeType);
        return true;
    }

    public boolean blowHorn() {
        System.out.println("Horn blown");
        return true;
    }

    public void playSong(String songName) {
        System.out.println("Song played " + songName);
    }

    public boolean wipeScreen() {
        System.out.println("Wiped the Screen");
        return true;
    }

    public boolean startAC(int temperature) {
        System.out.println("AC started with temperature " + temperature);
        return true;
    }

    public boolean stopAC(int temperature) {
        System.out.println("AC stopped");
        return true;
    }

    public boolean turnOnHeadlight() {
        System.out.println("Headlight ON");
        return true;
    }

    public boolean turnOffHeadlight() {
        System.out.println("Headlight OFF");
        return true;
    }

}
