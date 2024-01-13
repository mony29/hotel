package edu.dali.hotel.model;

public class Room {
    private Integer id;
    private String roomName;
    private String food;
    private String roomType;
    private String internet;
    private String roomPrice;
    private String bookingPrice;
    public Room(Integer id, String roomName, String food, String roomType, String internet, String roomPrice, String bookingPrice) {
        this.id = id;
        this.roomName = roomName;
        this.food = food;
        this.roomType = roomType;
        this.internet = internet;
        this.roomPrice = roomPrice;
        this.bookingPrice = bookingPrice;
    }

    public Room() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getBookingPrice() {
        return bookingPrice;
    }

    public void setBookingPrice(String bookingPrice) {
        this.bookingPrice = bookingPrice;
    }
}
