package Comparators;
import Field.Wheat;

import java.util.Comparator;

public class YSorter implements Comparator<Wheat> {
    @Override
    public int compare(Wheat wheat1, Wheat wheat2) {
        return wheat1.getY()-(wheat2.getY());
    }
}
