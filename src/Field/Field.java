package Field;

import java.util.HashMap;

public class Field implements IField {

    private int fieldSizeX;
    private int fieldSizeY;

    public Field (int fieldSizeX, int fieldSizeY) {
        this.fieldSizeX =fieldSizeX;
        this.fieldSizeY =fieldSizeY;
    }
    @Override
    public HashMap createField () {
        return new HashMap();
    }

    public int getFieldSizeX() {
        return fieldSizeX;
    }

    public int getFieldSizeY() {
        return fieldSizeY;
    }
}
