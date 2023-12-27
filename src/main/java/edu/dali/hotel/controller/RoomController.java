package edu.dali.hotel.controller;

import edu.dali.hotel.model.Room;
import edu.dali.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("/roomList")
    @ResponseBody
    public List<Room> getRoomList(){
        return roomService.getRoomList();
    }
}
