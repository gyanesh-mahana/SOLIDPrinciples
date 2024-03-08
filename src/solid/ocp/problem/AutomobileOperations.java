package solid.ocp.problem;

public class AutomobileOperations {

    public boolean shiftGear(int gearNumber) {
        System.out.println("Gear shifted to " + gearNumber);
        return true;
    }

    public boolean accelerate() {
        System.out.println("Accelerated");
        return true;
    }

    public boolean applyBrake(String brakeType) {
        System.out.println("Brake applied " + brakeType);
        return true;
    }

    public boolean blowHorn() {
        System.out.println("Horn blown");
        return true;
    }

    public boolean wipeScreen() {
        System.out.println("Wiped the Screen");
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
