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
}
