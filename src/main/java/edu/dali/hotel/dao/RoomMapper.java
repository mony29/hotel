package edu.dali.hotel.dao;

import edu.dali.hotel.model.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper {
    List<Room> getRoomList();
    Room getRoomById (Integer id);
    Integer update(Room room);
    Integer addRoom(Room room);
    void deleteRoom(Integer id);
}
