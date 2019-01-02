package controller;

import model.GameState;
import model.MatchesPile;

public interface IGameMethods {

    MatchesPile userTakeMatches(Integer take, MatchesPile pile);

    MatchesPile computerTakeMatches(MatchesPile pile);

    boolean checkStatusGame(GameState settings);












}
