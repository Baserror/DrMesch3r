import Drone.Drone;
import Field.Field;
import Harvester.Boardcomputer;

import java.util.HashMap;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Field field = new Field(100, 100);
        Drone drone = new Drone();
        Boardcomputer boardcomputer = new Boardcomputer(field, drone);
        HashMap hashmap = drone.scanField(field, field.createField());
        System.out.println();
        System.out.println("Möchtest du die Körneranzahl einer bestimmten Pflanze wissen?(y/n)");
        Scanner scan = new Scanner(System.in);
        char choice = scan.next().charAt(0);

        boardcomputer.makeLists(drone, hashmap);


        if (choice == 'y') {
            System.out.println("Die X-Koordinate der Pflanze:");
            int x = scan.nextInt();
            System.out.println("Die Y-Koordinate der Pflanze:");
            int y = scan.nextInt();
            System.out.println("Deine ausgewählte Pflanze besitzt "
                    + boardcomputer.findNumberOfGrainByCoordinates(drone, x, y, hashmap) + " ");
        } else if (choice == 'n') {
            System.out.println("In Ordnung, ciao");
        } else {
            System.out.println("Du hättest ein y oder ein n eingeben sollen >:(");
        }


    }


}
