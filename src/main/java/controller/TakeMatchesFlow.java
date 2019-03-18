package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import model.GameItem;
import view.RoundWindowContr;

public class TakeMatchesFlow {

    public void execute(int playerTake) {
        GameMethods game = new GameMethods();
        boolean finishedGame;

        try {
            GameItem instance = GameItem.getInstance();
            //user takes
            game.userTakeMatches(playerTake, instance.getPile());
            //set user as winner when after users take count of matches is zero at the pile
            game.setWinner(instance);
            //computer takes
            game.computerTakeMatches(instance.getPile());
            //check game state
            finishedGame = game.checkGameIsFinished(instance.getGame());

            RoundWindowContr round = new RoundWindowContr();
            if (finishedGame) {
                if (instance.getGame().isUserWinner()) {
                    round.showAlertUserWon();

                } else {
                    round.showAlertComputerWon();
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }


    }
}
