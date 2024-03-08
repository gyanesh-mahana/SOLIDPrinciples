package solid.isp.solution;

public class Bike extends Automobile implements IGearBox {

    public Bike() {
        super();
    }

    public Bike(String regNo, String chassisNo, String brand, String owner) {
        super(regNo, chassisNo, brand, owner);
    }

    @Override
    public void start() {
        System.out.println("Bike Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Bike Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike Accelerated");
    }

    @Override
    public boolean applyBrake(String brakeType) {
        System.out.println(brakeType + " Brake Applied");
        return true;
    }

    @Override
    public boolean blowHorn() {
        System.out.println("Horn Blown");
        return true;
    }

    @Override
    public boolean turnOnHeadlight() {
        System.out.println("Bike Headlight is Turned On");
        return true;
    }

    @Override
    public boolean turnOffHeadlight() {
        System.out.println("Bike Headlight is Turned Off");
        return true;
    }

    @Override
    public boolean shiftGear(int gearNumber) {
        System.out.println("Bike Gear shifted to " + gearNumber);
        return true;
    }

}
