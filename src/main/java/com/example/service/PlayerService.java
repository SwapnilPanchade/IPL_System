package com.example.service;

import com.example.dao.PlayerDao;
import com.example.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public String addPlayer(Player player) {

        String status = playerDao.addPlayer(player);
        return status;
    }

    public ArrayList<Player> getAllPlayers() {
        return playerDao.getAllPlayers();
    }

    public String deletePlayer(int id) {
        return playerDao.deletePlayer(id);
    }


    public String updatePlayer(int id, Player player) {
        return playerDao.updatePlayer(id,player);
    }
}
