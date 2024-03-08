package solid.srp.solution;


public class Automobile {
    String regNo;
    String chassisNo;
    String brandName;
    String ownerName;

    public Automobile(String reg, String chassisNo, String brand, String owner) {
        this.regNo = reg;
        this.chassisNo = chassisNo;
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

}
