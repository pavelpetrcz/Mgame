package controller;

import model.GameItem;
import model.GameSettings;
import model.GameState;
import model.MatchesPile;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

public class GameMethods {

    /**
     * Take specific amount of matches from the pile
     * @param take number of matches that player can take
     * @param pile object with information about actual game
     */

    protected void userTakeMatches(Integer take, MatchesPile pile) throws NegativeAmountException {
        if (pile.getActualMatchesCount() >= take) {
            pile.setActualMatchesCount(pile.getActualMatchesCount() - take);
            changeGameStatus(GameItem.getInstance());
        } else {
            String title = "Pozor.";
            String header = "Táhnete příliš mnoho sirek.";
            String content = "Snižte počet tažených sirek.";
            throw new NegativeAmountException(title, header, content);
        }
    }

    /**
     *  Computer each round takes matches as well
     * @param pile object with info about round
     */
    protected void computerTakeMatches(MatchesPile pile, GameSettings gameSettings) {
        int computerTake = 0;
        int maximumTake = 0;
        int actualMatchesCount = 0;

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actualMatchesCount = pile.getActualMatchesCount() + 1;
        maximumTake = gameSettings.getMaximumTake();

        SecureRandom random = new SecureRandom();
        computerTake = random.nextInt();
        while (computerTake > pile.getActualMatchesCount() || computerTake < 0 || computerTake > maximumTake) {
            computerTake = random.nextInt(actualMatchesCount);
            System.out.println(computerTake);
        }
        pile.setActualMatchesCount(pile.getActualMatchesCount() - computerTake);
        changeGameStatus(GameItem.getInstance());
    }

    /**
     * @param game - current game settings
     * @return - return if the game is over
     */
    protected boolean checkGameIsFinished(GameSettings game) {
        return game.getState() == GameState.FINISHED;
    }

    /**
     * @param item - current game
     */
    protected void changeGameStatus(GameItem item) {
        if (item.getPile().getActualMatchesCount() <= 0) {
            item.getGame().setState(GameState.FINISHED);
        }
    }

    protected void setWinner(GameItem item) {
        if (item.getPile().getActualMatchesCount() == 0) {
            item.getGame().setUserIsWinner(true);
        } else {
            item.getGame().setUserIsWinner(false);
        }
    }
}