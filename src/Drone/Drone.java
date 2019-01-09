package Drone;

import Field.Field;
import Field.Wheat;

import java.util.HashMap;

public class Drone implements IDrone {

private String stringCoords;

    @Override
    public HashMap<String,Wheat> scanField(Field field, HashMap hashmap) {
        int grain;
        for (int x = 0; x < field.getFieldSizeX(); x++) {
            System.out.println();
            for (int y = 0; y < field.getFieldSizeY(); y++) {

                Wheat wheat = new Wheat(field.getFieldSizeX(),field.getFieldSizeY());
                String key=coordinatesToString(x,y);
                hashmap.put(key,wheat);
                System.out.print(wheat.getNumberOfGrain()+" ");
            }
        }
        return hashmap;


    }

    @Override
    public String coordinatesToString(int xCoord, int yCoord){
        stringCoords=xCoord+","+yCoord;
        return stringCoords;
    }

}

