package solid.ocp.problem;

public class Automobile {
    String regNo;
    String chasisNo;
    String ownerName;
    String brandName;

    public Automobile(){
        this.regNo = "";
        this.chasisNo = "";
        this.brandName = "";
        this.ownerName = "";
    }
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

}
