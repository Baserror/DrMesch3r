package Drone;

import Field.Field;
import Field.Wheat;

import java.util.HashMap;

public interface IDrone {                               //aus Übung: Schnittstelle
    HashMap<String,Wheat> scanField(Field field, HashMap hashmap);

    String coordinatesToString(int xCoord, int yCoord);
}
