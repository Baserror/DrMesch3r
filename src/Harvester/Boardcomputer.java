package Harvester;

import java.util.*;
import java.util.Collection;

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

    public void makeLists(Drone drone, HashMap hashmap){


        ArrayList<Wheat> SortedWheatByGrain =new ArrayList<>();

        for (int x = 0; x < field.getFieldSizeX(); x++) {
            for (int y = 0; y < field.getFieldSizeY(); y++) {

                String key=drone.coordinatesToString(x,y);

                Wheat wheat = (Wheat) hashmap.get(key);

                SortedWheatByGrain.add(wheat);


            }
        }

        Collections.sort(SortedWheatByGrain, new GrainSorter());


    }


}
