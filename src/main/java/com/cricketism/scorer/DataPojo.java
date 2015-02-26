package com.cricketism.scorer;

import java.util.ArrayList;
import java.util.Map;

public class DataPojo {
    private Map<String, Integer> players;
    private Map<String, Integer> standings;
    private ArrayList<String> errors;
    private ArrayList<String> manOfTheMatch;
    private ArrayList<Team> teams;
    public Map<String, Integer> getPlayers() {
        return players;
    }
    public void setPlayers(Map<String, Integer> players) {
        this.players = players;
    }
    public Map<String, Integer> getStandings() {
        return standings;
    }
    public void setStandings(Map<String, Integer> standings) {
        this.standings = standings;
    }
    public ArrayList<String> getErrors() {
        return errors;
    }
    public void setErrors(ArrayList<String> errors) {
        this.errors = errors;
    }
    public ArrayList<String> getManOfTheMatch() {
        return manOfTheMatch;
    }
    public void setManOfTheMatch(ArrayList<String> manOfTheMatch) {
        this.manOfTheMatch = manOfTheMatch;
    }
    public ArrayList<Team> getTeams() {
        return teams;
    }
    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
    
}
