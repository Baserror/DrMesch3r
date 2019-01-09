package Harvester;

public class Engine {
    double speed;
    boolean forwards;
    boolean engineOn;

    public void HarvesterOn(){
        engineOn=true;
        forwards=true;
    }
    public void HarvesterOff(){
        engineOn=false;
    }

    public void speedPlus(){
        speed += 1;
    }

    public void speedMinus(){
        speed -= 1;
    }

    public void goForward(){
        if (!forwards){
            forwards=true;
        }
    }

    public  void goBackward() {
        if (forwards) {
            forwards = false;
        }
    }





}
