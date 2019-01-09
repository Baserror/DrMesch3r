package Field;

import java.util.HashMap;

public class Field implements IField {

    private int fieldSizeX;
    private int fieldSizeY;


    public Field (int fieldSizeX, int fieldSizeY) {
        this.fieldSizeX =fieldSizeX;
        this.fieldSizeY =fieldSizeY;
    }

    public void setup(){

    }

    public int RandomGrain(String stringCoords){
       int grain = (int)(Math.random() * 399) + 100;
       return grain;
    }


    public void createField (){







        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                                                                        //für diese Pflanze zufallsgrain erzeugen
                                                                        //grains in hashmap an stelle x/y schreiben
            }
        }

    }


    @Override
    public int getFieldSize() {
        int fieldSize = fieldSizeX*fieldSizeY;
        return fieldSize;
    }
}
