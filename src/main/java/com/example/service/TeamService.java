package com.example.service;

import com.example.dao.TeamDao;
import com.example.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TeamService {
    //todo this is the service class for IPL
    @Autowired
    private TeamDao teamDao;

    public String addTeam(Team team){
        String msg = teamDao.addTeam(team);
        return msg;
    }

    public ArrayList<Team> getAllTeams(){
        return teamDao.getAllTeams();
    }

    public Team getTeamById(int teamId) {
        return teamDao.getTeamById(teamId);
    }

    public String deleteTeamById(int id) {
        return teamDao.deleteTeamById(id);
    }


    public String updateTeamById(int id, Team team) {
        return teamDao.updateTeamById(id,team);
    }
}
