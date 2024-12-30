package com.example.service;


import com.example.dao.MatchDao;
import com.example.model.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class MatchService {


    @Autowired
    private MatchDao matchDao;


    public String addMatch(Match match) {

        return matchDao.addMatch(match);
    }

    public ArrayList<Match> getAllMatches() {
        return matchDao.getAllMatches();
    }

    public String deleteMatch(int id) {
        return matchDao.deleteMatch(id);
    }
}
