package edu.dali.hotel.service.serviceImp;

import edu.dali.hotel.dao.RoomMapper;
import edu.dali.hotel.model.Room;
import edu.dali.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImp implements RoomService {

    @Autowired
    RoomMapper roomMapper;
    @Override
    public List<Room> getRoomList() {
        return roomMapper.getRoomList();
    }

    @Override
    public Room getRoomById(Integer id) {
        return roomMapper.getRoomById(id);
    }

    @Override
    public Integer update(Room room) {
        return roomMapper.update(room);
    }

    @Override
    public Integer addRoom(Room room) {
        return roomMapper.addRoom(room);
    }

    @Override
    public void deleteRoom(Integer id) {
        roomMapper.deleteRoom(id);
    }

    @Override
    public List<Room> searchRoomByName(String roomName) {
        return roomMapper.searchRoomByName(roomName);
    }
}
