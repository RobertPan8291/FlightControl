package flightControl.ui;
import flightControl.logic.logic;
import flightControl.domain.*;
import java.util.*;
public class ui{
    static Scanner scanner = new Scanner(System.in);

    public static void asset(){
        String input = "";

        while(!input.equals("x")){
            System.out.println("Choose an action: ");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            input = scanner.nextLine();

            if(input.equals(String.valueOf(1))){
                String id;
                int capacity;

                System.out.print("Give the airplane id: ");
                id = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                capacity = Integer.valueOf(scanner.nextLine());

                logic.Addplane(id, capacity);
            }

            if(input.equals(String.valueOf(2))){
                String id;
                String departure;
                String destination;
                Boolean found;

                System.out.print("Give the airplane id: ");
                id = scanner.nextLine();
                System.out.print("Give the departure airport id: ");
                departure = scanner.nextLine();
                System.out.print("Give the target airport id: ");
                destination = scanner.nextLine();

                found = logic.Addflight(id, new Place(departure, destination));

                if(found = false){
                    System.out.println("Please enter a valid plane ID");
                }


            }
        }

    }


    public static void control(){
        String input = "";

        while(!input.equals("x")){
           System.out.println("Choose an action:");
           System.out.println("[1] Print airplanes");
           System.out.println("[2] Print flights");
           System.out.println("[3] Print airplane details");
           System.out.println("[x] Quit");

           input = scanner.nextLine();

            if(input.equals(String.valueOf(1))){
                logic.printallplane();
            }

            if(input.equals(String.valueOf(2))){
                logic.printallflight();
            }

            if(input.equals(String.valueOf(3))){
                String id;

                System.out.print("Give the airplane id: ");
                id = scanner.nextLine();

                logic.printplane(id);
            }
        }
    }


}
