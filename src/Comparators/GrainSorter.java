package Comparators;

import Field.Wheat;

import java.util.Comparator;

public class GrainSorter implements Comparator<Wheat> {


    public int compare(Wheat wheat1, Wheat wheat2){

    return wheat2.getNumberOfGrain() -(wheat1.getNumberOfGrain());
    }

}