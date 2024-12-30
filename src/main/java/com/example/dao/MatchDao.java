package com.example.dao;

import com.example.model.Match;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MatchDao {

    ArrayList<Match> matches = new ArrayList<>();

    public MatchDao(){
        matches.add(new Match(1,"MI", "CSK", "22/02/2020", "Mumbai","CSK Won"));
        matches.add(new Match(2,"RCB", "CSK", "12/03/2024","Benglore","CSK Won"));
    }

    public String addMatch(Match match) {
        matches.add(match);
        return "Match added successfully";
    }

    public ArrayList<Match> getAllMatches() {
        return matches;
    }

    public String deleteMatch(int id) {
        for(Match match : matches){
            if(match.getMatchId() == id){
                matches.remove(match);
                return "Match deleted successfully ";
            }
        }
        return "Match with id not found";
    }
}
