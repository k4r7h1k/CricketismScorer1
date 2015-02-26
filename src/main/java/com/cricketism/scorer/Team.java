package com.cricketism.scorer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Team {
    String name;
    public Team() {
        super();
        players = new HashMap<String, Integer>();
        // TODO Auto-generated constructor stub
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    int points;
    Map<String, Integer> players;
    public void addPlayer(String player,int points){
        players.put(player, points);
    }
    public void sortPlayers(){
        players = (LinkedHashMap<String, Integer>) MainClass.sortByComparator(players, false);
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public Map<String, Integer> getPlayers() {
        return players;
    }
    public void setPlayers(LinkedHashMap<String, Integer> players) {
        this.players = players;
    }
}
