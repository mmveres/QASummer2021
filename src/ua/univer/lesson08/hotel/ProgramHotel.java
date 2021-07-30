package ua.univer.lesson08.hotel;

public class ProgramHotel {
    public static void main(String[] args) {
        HotelRoom h1 = new HotelRoom(1,"DBL",new Room(10), new Room(15));
        HotelRoom h2 = new HotelRoom(2,"SNG",new Room(14));
        HotelRoom h3 = new HotelRoom(3,"TRP",new Room(10), new Room(15), new Room(8));
        HotelRoom h4 = new HotelRoom(4,"SNG",new Room(16));

        AbstractRoom [] hotelRooms = {h1,h2,h3,h4};

        for (var room: hotelRooms) {
            System.out.println(room);
        }

        for (var room: hotelRooms) {
            if (room instanceof HotelRoom)
                System.out.println(((HotelRoom)room).getHall());
        }
    }
}
