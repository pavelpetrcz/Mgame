package view;

import controller.StartGameFlow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class SetGameWindowContr {

    private StartGameFlow gameSetum = new StartGameFlow();

    @FXML private TextField totalMatchesCountInput;
    @FXML private TextField maxMatchesRoundTakeInput;

    @FXML
    void handleStartGame(ActionEvent event) throws Exception {
        try {
            gameSetum.execute(Integer.parseInt(totalMatchesCountInput.getText()), Integer.parseInt(maxMatchesRoundTakeInput.getText()));

        } catch (Exception e) {
            System.out.println("Zadejte celé nezáporné číslo.");
        }

        try {
            Pane mySecPane = FXMLLoader.load(getClass().getResource("/roundWindow.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Hra");
            stage.setScene(new Scene(mySecPane));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.show();
        } catch (IOException e) {
            System.out.println("Interní chyba - nelze spustit hru.");
        }

    }

}