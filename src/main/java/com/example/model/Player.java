package com.example.model;

public class Player {
    //todo create player entity
    private int playerId;
    private String name;
    private int age;
    private String teamName;
    private String role;


    public Player() {

    }

    public Player(int playerId, String name, int age, String teamName, String role) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.teamName = teamName;
        this.role = role;
    }


    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", teamName='" + teamName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
