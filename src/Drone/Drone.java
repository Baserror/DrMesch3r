package Drone;

import Field.Field;
import Field.Wheat;

import java.util.HashMap;

public class Drone implements IDrone {

private String stringCoords;

    @Override                                                                //aus Übung: Überschreiben
    public HashMap<String,Wheat> scanField(Field field, HashMap hashmap) {   //aus Übung: Datenstrukturen
        int grain;
        for (int x = 0; x < field.getFieldSizeX(); x++) {

            for (int y = 0; y < field.getFieldSizeY(); y++) {

                Wheat wheat = new Wheat(field.getFieldSizeX(),field.getFieldSizeY());   //aus Übung: ssoziation
                String key=coordinatesToString(x,y);                                    //für jedes Feld gibt es x * y viele Pflanzen
                hashmap.put(key,wheat);
                System.out.print(wheat.getNumberOfGrain()+" ");
            }
        }
        return hashmap;


    }

    @Override                                                                 //aus Übung: Überschreiben
    public String coordinatesToString(int xCoord, int yCoord){                //aus Übung: Sortieren und Suchen
        stringCoords=xCoord+","+yCoord;
        return stringCoords;
    }

}

