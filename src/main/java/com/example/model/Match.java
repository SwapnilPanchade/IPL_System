package com.example.model;

public class Match {
    //todo this class is to create Match class

    private int matchId;
    private String team1;
    private String team2;
    private String dateOfMatch;
    private String location;
    private String result;

    public Match() {


    }


    public Match(int matchId, String team1, String team2, String dateOfMatch, String location, String result) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
        this.dateOfMatch = dateOfMatch;
        this.location = location;
        this.result = result;
    }


    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getDateOfMatch() {
        return dateOfMatch;
    }

    public void setDateOfMatch(String dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", dateOfMatch='" + dateOfMatch + '\'' +
                ", location='" + location + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
