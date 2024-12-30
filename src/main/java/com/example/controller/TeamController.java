package com.example.controller;

import com.example.model.Team;
import com.example.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
//@RequestMapping("/api")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/api/teams")
    public String addTeam(@RequestBody Team team){
        String msg = teamService.addTeam(team);

        return msg;
    }


    @GetMapping("/api/teams/all")
    public ArrayList<Team> getAllTeams(){
        return  teamService.getAllTeams();
    }

    @DeleteMapping("/api/deleteteam")
    public String deleteTeamById(@RequestParam int id){
        return teamService.deleteTeamById(id);
    }



    @PutMapping("/api/updateteam")
    public String updateTeamById(@RequestParam int id , @RequestBody Team team){
       return teamService.updateTeamById(id,team);
    }

    @GetMapping("/api/team")
    public Object getTeamById(@RequestParam  int id ){

        Team team = teamService.getTeamById(id);
        if(team != null){
            return team;
        }
        else return "Team not found";
    }


}
