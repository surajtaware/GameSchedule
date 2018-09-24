package com.cg.model;

import java.util.List;

public class GameReport {
private String name;
private List<Player> players;
private List<Day> day;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Player> getPlayers() {
	return players;
}
public void setPlayers(List<Player> players) {
	this.players = players;
}
public List<Day> getDay() {
	return day;
}
public void setDay(List<Day> day) {
	this.day = day;
}
}
