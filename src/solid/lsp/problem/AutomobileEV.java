package solid.lsp.problem;

public class AutomobileEV extends Automobile {
    @Override
    public int chargeBattery() {
        System.out.println("Battery Charged");
        return 100;
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
