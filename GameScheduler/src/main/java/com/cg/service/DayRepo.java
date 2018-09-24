package com.cg.service;

import com.cg.model.Player;

public interface DayRepo {
	public Player findByName();
	public Player findByGameName();
}
