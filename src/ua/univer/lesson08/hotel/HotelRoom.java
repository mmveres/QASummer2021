package ua.univer.lesson08.hotel;

public class HotelRoom extends AbstractRoom {
    private int number;
    private AbstractRoom hall;
    private AbstractRoom bathRoom;
    private AbstractRoom [] rooms;

    public HotelRoom(int number, String name, AbstractRoom ... rooms) {
        super(0, name);
        this.number = number;
        this.hall = new HallRoom(10);
        this.bathRoom = new BathRoom(7);
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public AbstractRoom getHall() {
        return hall;
    }

    public void setHall(AbstractRoom hall) {
        this.hall = hall;
    }

    public AbstractRoom getBathRoom() {
        return bathRoom;
    }

    public void setBathRoom(AbstractRoom bathRoom) {
        this.bathRoom = bathRoom;
    }

    public AbstractRoom[] getRooms() {
        return rooms;
    }

    public void setRooms(AbstractRoom[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public double getSquare() {
        return getSquareRoom()+hall.getSquare()+bathRoom.getSquare();
    }

    public double getSquareRoom(){
        double sum = 0;
        for (AbstractRoom room: rooms) {
            sum+=room.getSquare();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                " number=" + this.number +
                ", name=" + super.getName() +
                ", square=" + getSquare() +
                ", id=" + getCurrID() +
                "} " ;
    }
}
