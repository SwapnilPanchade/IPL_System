package com.example.controller;

import com.example.model.Player;
import com.example.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PlayerController {
    //todo this is to make changes related to player


    @Autowired
    private PlayerService playerService;

    @PostMapping("/api/player")
    public String addPlayer(@RequestBody Player player){
        String status = playerService.addPlayer(player);
        return status;
    }

    @GetMapping("/api/player")
    public ArrayList<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @DeleteMapping("/api/player/{id}")
    public String deletePlayer(@PathVariable int id){
        return playerService.deletePlayer(id);
    }

    @PutMapping("api/player/{id}")
    public String updatePlayer(@PathVariable int id, @RequestBody Player player){
        return playerService.updatePlayer(id,player);
    }
}
