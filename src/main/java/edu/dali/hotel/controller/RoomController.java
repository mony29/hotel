package edu.dali.hotel.controller;

import edu.dali.hotel.model.Room;
import edu.dali.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("/roomList")
    @ResponseBody
    public List<Room> getRoomList() {
        return roomService.getRoomList();
    }

    @GetMapping("/to/room-list-page")
    public String toRoomListPage(ModelMap modelMap) {
        List<Room> roomList = roomService.getRoomList();
        modelMap.addAttribute("rooms", roomList);
        return "room-list";
    }

    @RequestMapping("/{edit_page}")
    public String edit(Integer id, ModelMap modelMap){
        Room room = roomService.getRoomById(id);
        modelMap.addAttribute("room", room);
        return "room-edit";
    }

    @PostMapping("/update")
    public String update(Room room){
        roomService.update(room);
        // 返回到房间列表
        return "redirect:/rooms/to/room-list-page";
    }
}
