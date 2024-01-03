package edu.dali.hotel.service;

import edu.dali.hotel.model.Room;

import java.util.List;

public interface RoomService {
    List<Room> getRoomList();
    Room getRoomById (Integer id);
    Integer update(Room room);
}
