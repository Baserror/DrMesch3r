package Field;

import java.util.Random;

public class Wheat implements IWheat {

    int numberOfGrain;
    int x;
    int y;

    public Wheat(int x, int y) {
        Random random = new Random();
        this.numberOfGrain = random.nextInt(399) + 100;
        this.x = x;
        this.y = y;
    }

    @Override
    public int getNumberOfGrain() {
        return numberOfGrain;
    }
}
