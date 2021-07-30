package ua.univer.lesson08.hotel;

public abstract class AbstractRoom {

    static int id = 0;
    private int currID;
    private String name;
    private double square;

    public AbstractRoom(double square, String name){
        currID = ++id;
        this.square = square;
        this.name = name;
    }

    public AbstractRoom(double square){
        this(square, "room");
    }

    public AbstractRoom(String name){
        this(0, name);
    }

    public AbstractRoom(){
        this(0);
    }
    public int getCurrID() {
        return currID;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
       return this.square;
    }


    @Override
    public String toString() {
        return "currID=" + currID;
    }
}
