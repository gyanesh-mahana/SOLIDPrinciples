package solid.lsp.solution;

public class Scooter extends Automobile {
    public Scooter() {
        super();
    }

    public Scooter(String regNo, String chassisNo, String brand, String owner) {
        super(regNo, chassisNo, brand, owner);
    }

    @Override
    public void start() {
        System.out.println("Scooter Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Scooter Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Scooter Accelerated");
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
        System.out.println("Scooter Headlight is Turned On");
        return true;
    }

    @Override
    public boolean turnOffHeadlight() {
        System.out.println("Scooter Headlight is Turned Off");
        return true;
    }

    @Override
    public boolean shiftGear(int gearNumber) {
        try {
            throw new NoSuchMethodException();
        } catch (NoSuchMethodException e) {
            System.out.println("Gear feature is not Available in Scooter");
        }
        return false;
    }

}
