package view;

import controller.StartGameFlow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.GameItem;
import model.MatchesPile;

import java.io.IOException;

public class SetGameWindowContr {

    private StartGameFlow gameStart = new StartGameFlow();
    private GameItem gameObject;

    @FXML private TextField totalMatchesCountInput;
    @FXML private TextField maxMatchesRoundTakeInput;


    @FXML
    void handleStartGame(ActionEvent event) throws Exception {
        try {
            gameObject = gameStart.execute(Integer.parseInt(totalMatchesCountInput.getText()), Integer.parseInt(maxMatchesRoundTakeInput.getText()));

        } catch (Exception e) {
            System.out.println("Zadejte celé nezáporné číslo.");
        }

        try {
            Pane mySecPane = FXMLLoader.load(getClass().getResource("/roundWindow.fxml")); //new window resource
            Stage stage = new Stage();
            stage.setTitle("Hra"); //set name of window
            stage.setScene(new Scene(mySecPane));
            stage.initModality(Modality.WINDOW_MODAL); //new window behaves as modal

            //construtor of controller for new window
            RoundWindowContr roundWindow = new RoundWindowContr();
            Text text = new Text();
            MatchesPile pileOfMatches = gameObject.getPile();
            int actualCount = pileOfMatches.getActualMatchesCount(); //getting actual number of matches at pile
            text.setText(String.valueOf(actualCount));
            roundWindow.setactualPileCountText(text);



            stage.show();

        } catch (IOException e) {
            System.out.println("Interní chyba - nelze spustit hru.");
        }

    }

}