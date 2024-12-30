package com.example.model;

public class Team {
    //todo class to create
    private int teamId;
    private String name;

    private String city;
    private String coach;


    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", coach='" + coach + '\'' +
                '}';
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Team(int teamId, String name, String city, String coach) {
        this.teamId = teamId;
        this.name = name;
        this.city = city;
        this.coach = coach;
    }

}
