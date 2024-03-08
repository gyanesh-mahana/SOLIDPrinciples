package solid.ocp.solution;

public class AutomobileWithoutGear extends Automobile {

    public AutomobileWithoutGear(){

    }
    public AutomobileWithoutGear(String regNo, String chassisNo, String brand, String owner) {
        super(regNo, chassisNo, brand, owner);
    }

    @Override
    public int chargeBattery() {
        return 0;
    }

    @Override
    public boolean startAC(int temperature) {
        return false;
    }

    @Override
    public boolean stopAC(int temperature) {
        return false;
    }

    @Override
    public void playSong(String songName) {

    }

    @Override
    public void pauseSong() {

    }

    @Override
    public void stopSong(String songName) {

    }

    @Override
    public boolean shiftGear(int gearNumber) throws NoSuchMethodException {
        return false;
    }

    @Override
    public boolean wipeScreen() {
        return false;
    }

    @Override
    public void raiseAlarm(String alarm) {

    }

    @Override
    public void openAirBag() {

    }

    @Override
    public void applyHandBrake() {

    }
}
