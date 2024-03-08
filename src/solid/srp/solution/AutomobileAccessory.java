package solid.srp.solution;

public class AutomobileAccessory {
    public boolean startAC(int temperature) {
        System.out.println("AC started with temperature " + temperature);
        return true;
    }

    public boolean stopAC(int temperature) {
        System.out.println("AC stopped");
        return true;
    }

}
