public class Hotel {
    String hotelName;
    int rooms;
    double roomRates;

    public Hotel(String hotelName, int rooms, double roomRates) {
        this.hotelName = hotelName;
        this.rooms = rooms;
        this.roomRates = roomRates;
    }

    public double totalRevenue() {
        return rooms * roomRates;
    }
    public static void main(String[] args) {
        double hotelRevenue;
        Hotel hotel = new Hotel("Solmari Hotel", 20, 1500);
        hotelRevenue = hotel.totalRevenue();
        System.out.println("Hotel Name: " + hotel.hotelName + "\nRooms: " + hotel.rooms + "\nRoom Rate: " + hotel.roomRates + "\nTotal Revenue: " + hotelRevenue);
    }

}
