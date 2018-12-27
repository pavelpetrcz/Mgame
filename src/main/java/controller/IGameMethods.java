package controller;

import model.MatchesPile;

public interface IGameMethods {

    MatchesPile userTakeMatches(Long take, MatchesPile pile);

    MatchesPile computerTakeMatches(MatchesPile pile);











}
