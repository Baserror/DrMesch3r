package Harvester;

import java.util.*;

import Comparators.XSorter;
import Comparators.YSorter;
import Drone.Drone;
import Field.Field;
import Field.Wheat;
import Comparators.GrainSorter;


public class Boardcomputer{
    Field field;
    Drone drone;
    public Boardcomputer(Field field, Drone drone) {
        this.field = field;
        this.drone = drone;
    }


    public int findNumberOfGrainByCoordinates(Drone drone, int x, int y, HashMap hashmap){
        String key = drone.coordinatesToString(x,y);
        Wheat wheat = (Wheat) hashmap.get(key);
        return wheat.getNumberOfGrain();
    }

    public ArrayList HashmapToList(HashMap hashmap){

        ArrayList<Wheat> Wheat =new ArrayList<>();

        for (int x = 0; x < field.getFieldSizeX(); x++) {
            for (int y = 0; y < field.getFieldSizeY(); y++) {

                String key=drone.coordinatesToString(x,y);

                Wheat wheat = (Wheat) hashmap.get(key);

                Wheat.add(wheat);


            }
        }
        return Wheat;
    }

    public void createDscGrainList(Drone drone, HashMap hashmap){
        ArrayList<Wheat> SortedWheatByGrain=HashmapToList(hashmap);
        Collections.sort(SortedWheatByGrain, new GrainSorter());
    }

    public void createAscXCoordList(Drone drone, HashMap hashmap){
        ArrayList<Wheat> SortedWheatByX=HashmapToList(hashmap);
        Collections.sort(SortedWheatByX, new XSorter());
    }

    public void createAscYCoordList(Drone drone, HashMap hashmap){
        ArrayList<Wheat> SortedWheatByY=HashmapToList(hashmap);
        Collections.sort(SortedWheatByY, new YSorter());
    }
}
