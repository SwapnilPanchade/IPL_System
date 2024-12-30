package com.example.dao;

import com.example.model.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PlayerDao {

   ArrayList<Player> players = new ArrayList<>();

   public PlayerDao(){
       players.add(new Player(1,"Virat", 32, "RCB", "Captain"));
       players.add(new Player(2,"Rohit", 33, "MI", "Captain"));
   }

    public String addPlayer(Player player) {
     players.add(player);
     return "The player is added successfully";
    }

    public ArrayList<Player> getAllPlayers() {
        return players;
    }

    public String deletePlayer(int id) {
       for(Player player : players){
           if(player.getPlayerId() == id){
               players.remove(player);
               return "player found and deleted";
           }
       }
       return "player is not there please get all by get method";
    }


    public String updatePlayer(int id, Player player) {

       for(Player player1 : players){
           if(player1.getPlayerId() == id){
               player1.setPlayerId(player.getPlayerId());
               player1.setName(player.getName());
               player1.setAge(player.getAge());
               player1.setRole(player.getRole());
               return "player details updated successfully";
           }
       }
       return "Player with id not found";
    }
}
