package controller;

import model.GameItem;
import view.RoundWindowContr;

public class TakeMatchesFlow {

    public void execute(int playerTake) {
        GameMethods game = new GameMethods();
        boolean finishedGame;
        GameItem instance = GameItem.getInstance();

        try {
            //user takes
            game.userTakeMatches(playerTake, instance.getPile());
            //set user as winner when after users take count of matches is zero at the pile
            game.setWinner(instance);
            //computer takes
            game.computerTakeMatches(instance.getPile(), instance.getGame());
            //check if the game is finished
            finishedGame = game.checkGameIsFinished(instance.getGame());
            RoundWindowContr round = new RoundWindowContr();
            if (finishedGame) {
                if (instance.getGame().isUserWinner()) {
                    String titleInfo = "Hra skončila.";
                    String headerInfo = "";
                    String contentInfo = "VÍTĚZSTVÍ! Právě jsi táhl poslední sirky na hromádce. A stáváš se vítězem.";
                    round.showConfirmation(titleInfo, headerInfo, contentInfo);
                } else {
                    String title = "Hra skončila.";
                    String header = "";
                    String content = "Bohužel počítač tě přelstil a táhl poslední sirky na hromádce. Zkus to znovu.";
                    round.showInformation(title, header, content);
                }
            }
        } catch (NegativeAmountException ex) {
            //user took too many matches
            RoundWindowContr alertToBigTake = new RoundWindowContr();
            alertToBigTake.showAlertToBigTake(ex.getTitle(), ex.getHeader(), ex.getContent());
        }
    }
}