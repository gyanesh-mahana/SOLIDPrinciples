package solid.lsp.problem;

public abstract class Automobile {
    String regNo;
    String chassisNo;
    String brandName;
    String ownerName;

    public Automobile() {
        this.regNo = "";
        this.chassisNo = "";
        this.brandName = "";
        this.ownerName = "";
    }

    public Automobile(String reg, String chassis, String brand, String owner) {
        this.regNo = reg;
        this.chassisNo = chassis;
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

    public boolean turnOnHeadlight() {
        System.out.println("Headlight ON");
        return true;
    }

    public boolean turnOffHeadlight() {
        System.out.println("Headlight OFF");
        return true;
    }

    public abstract int chargeBattery();

    public abstract boolean startAC(int temperature);

    public abstract boolean stopAC(int temperature);

    public abstract void playSong(String songName);

    public abstract void pauseSong();

    public abstract void stopSong(String songName);

    public abstract boolean shiftGear(int gearNumber) throws NoSuchMethodException;

    public abstract boolean wipeScreen();

    public abstract void raiseAlarm(String alarm);

    public abstract void openAirBag();

    public abstract void applyHandBrake();

}
