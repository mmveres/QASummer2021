package ua.univer.lesson08.hotel;

public class HallRoom extends AbstractRoom{
    public HallRoom(double square, String name) {
        super(square, name);
    }

    public HallRoom(double square) {
        this(square, "hall");
    }
}
