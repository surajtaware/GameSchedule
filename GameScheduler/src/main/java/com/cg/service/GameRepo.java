package com.cg.service;

import com.cg.model.Game;

public interface GameRepo {
public Game save(Game g);
public Game findName(String name);
}
