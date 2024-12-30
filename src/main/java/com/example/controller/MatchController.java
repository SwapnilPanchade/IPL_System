package com.example.controller;

import com.example.model.Match;
import com.example.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MatchController {
    //todo this is for the match phase
    @Autowired
    private MatchService matchService;

    @PostMapping("/api/match")
    public String addMatch(@RequestBody Match match){
        return matchService.addMatch(match);
    }

    @GetMapping("/api/match")
    public ArrayList<Match> getAllMatches(){
        return matchService.getAllMatches();
    }

    @DeleteMapping("/api/match/{id}")
    public String deleteMatch(@PathVariable int id){
        return matchService.deleteMatch(id);
    }
}
