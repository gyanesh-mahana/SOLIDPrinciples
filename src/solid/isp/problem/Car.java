package solid.isp.problem;

public class Car extends Automobile implements IAirConditioner, ISafetyFeature {

    public Car() {
        super();
    }

    public Car(String regNo, String chassisNo, String brand, String owner) {
        super(regNo, chassisNo, brand, owner);
    }

    @Override
    public void start() {
        System.out.println("Car Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car Accelerated");
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
        System.out.println("Car Headlight is Turned On");
        return true;
    }

    @Override
    public boolean turnOffHeadlight() {
        System.out.println("Car Headlight is Turned Off");
        return true;
    }

    @Override
    public boolean startAC() {
        System.out.println("Car AC is Turned On");
        return true;
    }

    @Override
    public boolean stopAC() {
        System.out.println("Car AC is Turned Off");
        return true;
    }

    @Override
    public boolean setAC(int temperature) {
        System.out.println("Car AC set to temperature " + temperature);
        return true;
    }

    @Override
    public boolean shiftGear(int gearNumber) {
        System.out.println("Car Gear shifted to " + gearNumber);
        return true;
    }

    @Override
    public void raiseAlarm(String alarm) {
        System.out.println("!!!!" + alarm + "!!!!");
    }

    @Override
    public void openAirBag() {
        System.out.println("Car Airbag is Opened");
    }

    @Override
    public void applyHandBrake() {
        System.out.println("Car Handbrake Applied");
    }
}
