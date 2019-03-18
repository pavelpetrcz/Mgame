package model;

public enum GameState {
    NEW,
            //new game, actual count of matches = initial count of matches at pile
    INPROGRESS,
            //there are some matches at pile but less than initial count
    FINISHED
            //pile has zero matches, game is over
}
