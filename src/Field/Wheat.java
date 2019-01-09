package Field;

import java.util.Random;

public class Wheat implements IWheat {

    int numberOfGrain;
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Wheat(int x, int y) {
        Random random = new Random();
        this.numberOfGrain = random.nextInt(399) + 100;
        this.x = x;
        this.y = y;
    }

    @Override                                               //aus Übung: Überschreiben
    public int getNumberOfGrain() {
        return numberOfGrain;
    }
}
