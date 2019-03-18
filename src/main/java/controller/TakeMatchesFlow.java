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
            //computer takes
            game.computerTakeMatches(instance.getPile());
            //check game state
            finishedGame = game.checkGameIsFinished(instance.getGame());

            if (finishedGame) {
                RoundWindowContr round = new RoundWindowContr();
                round.showAlert();

                 /*       FXMLLoader.load(getClass().getResource("/roundWindow.fxml")); //new window resource
                Stage stage = new Stage();
                stage.setTitle("Hra"); //set name of window
                stage.getIcons().add(new Image("iconfinder_match_2799190.png"));
                stage.setScene(new Scene(mySecPane));
                stage.initModality(Modality.APPLICATION_MODAL); //new window behaves as modal
                stage.show();*/
            }

        } catch (Exception e) {
            System.out.println("Error");
        }


    }
}
