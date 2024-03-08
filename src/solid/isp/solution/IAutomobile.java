package solid.isp.solution;

public interface IAutomobile {
    public void start();

    public void stop();

    public void accelerate();

    public boolean applyBrake(String brakeType);

    public boolean blowHorn();

    public boolean turnOnHeadlight();

    public boolean turnOffHeadlight();

}
