package com.example.dao;

import com.example.model.Team;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TeamDao {

    ArrayList<Team> teams = new ArrayList<>();

    public String addTeam(Team team){
     teams.add(team);
     return  "team successfully added to the Dao";
    }

    public ArrayList<Team> getAllTeams(){
        return teams;
    }

    public Team getTeamById(int teamId) {
        for(Team team : teams){
            if(team.getTeamId() == teamId) return team;
        }
        return null;
    }

    public String deleteTeamById(int id) {
        for(Team team:teams){
            if(team.getTeamId() == id){
                int i = teams.indexOf(team);
                teams.remove(i);
                return "The team is been removed successfully";
            }
        }
             return null;
    }


    public String updateTeamById(int id, Team team) {
        for(Team itratingTeams : teams){
            if(itratingTeams.getTeamId() == id){
                itratingTeams.setName(team.getName());
                itratingTeams.setCity(team.getCity());
                itratingTeams.setCoach(team.getCoach());
                return "Team successfully updated";
            }
        }
        return null;
    }
}
