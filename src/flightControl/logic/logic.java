package flightControl.logic;
import flightControl.domain.*;
import java.util.*;
public class logic {
    static ArrayList<Airplane> planelist = new ArrayList<>();
    static ArrayList<Flight> flightlist = new ArrayList<>();


    public static void Addplane(String id, int capacity) {
        planelist.add(new Airplane(id, capacity));
    }

    public static boolean Addflight(String id, Place place) {
        boolean found = false;
        for (Airplane i : planelist) {
            if (id.equals(i.getid())) {
                flightlist.add(new Flight(i, place));
                found = true;
            }
        }

        return found;
    }

    public static void printallplane() {
        for (Airplane i : planelist) {
            System.out.println(i);
        }
    }

    public static void printallflight() {
        for (Flight i : flightlist) {
            System.out.println(i);
        }
    }

    public static void printplane(String id) {
        Boolean found = false;

        for (Airplane i : planelist) {
            if (id.equals(i.getid())) {
                System.out.println(i);
                found = true;
            }
        }

        if(found = false){
            System.out.println("Plane not found");
        }
    }
}
