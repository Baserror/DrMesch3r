package Harvester;

public class HarvestingReel {
    int RPM;


    boolean on;

    private void HarvestingReelOn() {
        on = true;
    }

    private void HarvestingReelOff() {
        on = false;
    }

    private void increasRPM() {
        RPM += 1;
    }

    private void decreaseRPM() {
        RPM -= 1;
    }

    public int getRPM() {
        return RPM;
    }

    public boolean isOn() {
        return on;
    }
}