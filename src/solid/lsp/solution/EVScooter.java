package solid.lsp.solution;

public class EVScooter implements IAutomobile, IElectricVehicle {

    String regNo;
    String chassisNo;
    String brandName;
    String ownerName;

    public EVScooter(String regNo, String chassisNo, String brand, String owner) {
        this.regNo = regNo;
        this.chassisNo = chassisNo;
        this.brandName = brand;
        this.ownerName = owner;
    }

    @Override
    public void start() {
        System.out.println("EV Scooter Motor Started");
    }

    @Override
    public void stop() {
        System.out.println("EV Scooter Motor Stopped");
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

    @Override
    public void chargeBattery() {
        System.out.println("Battery Charged Fully for EV Scooter!");
    }

    @Override
    public void changeBattery() {
        System.out.println("Battery Changed EV Scooter");
    }
}
