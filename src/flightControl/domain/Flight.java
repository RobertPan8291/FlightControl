package flightControl.domain;

public class Flight {
    Airplane airplane;
    Place place;

    public Flight(Airplane airplane, Place place){
        this.airplane = airplane;
        this.place = place;
    }

    public String toString(){
        return airplane.getid() + "(" + String.valueOf(airplane.capacity) + " passengers)" + "(" + place.departure + "-" + place.destination + ")";
    }
}
