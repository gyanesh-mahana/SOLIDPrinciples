package solid.lsp.solution;

public abstract class Automobile implements IAutomobile {

    String regNo;
    String chassisNo;
    String brandName;
    String ownerName;

    public Automobile() {

    }

    public Automobile(String regNo, String chassisNo, String brand, String owner) {

        this.regNo = regNo;
        this.chassisNo = chassisNo;
        this.brandName = brand;
        this.ownerName = owner;
    }
}
