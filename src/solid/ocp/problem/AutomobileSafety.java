package solid.ocp.problem;

public class AutomobileSafety {

    public void raiseAlarm(String alarm) {
        System.out.println("!!!!!" + alarm + "!!!!!");
    }

    public void openAirBag() {
        System.out.println("Air Bag Opened");
    }

    public void applyHandBrake() {
        System.out.println("Hand Brake Applied");
    }

}
