package Comparators;
import Field.Wheat;

import java.util.Comparator;

    public class XSorter implements Comparator<Wheat> {
        @Override
        public int compare(Wheat wheat1, Wheat wheat2) {
            return wheat1.getX()-(wheat2.getX());
        }
}
