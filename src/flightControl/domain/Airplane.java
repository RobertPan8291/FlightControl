package flightControl.domain;

public class Airplane {
    String id;
    public int capacity;

    public Airplane(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }

    public String getid(){
        return id;
    }

    public String toString(){
        return id + "(" + String.valueOf(capacity) + " capacity)";
    }



}
