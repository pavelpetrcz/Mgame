package view;

import controller.StartGameFlow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.GameItem;
import model.MatchesPile;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SetGameWindowContr {

    private StartGameFlow gameStart = new StartGameFlow();
    RoundWindowContr roundWindow = new RoundWindowContr();

    @FXML private TextField totalMatchesCountInput;
    @FXML private TextField maxMatchesRoundTakeInput;

    public Label getTestLabel() {
        return testLabel;
    }

    public void setTestLabel(Label testLabel) {
        this.testLabel = testLabel;
    }

    @FXML
    private Label testLabel;


    @FXML
    void handleStartGame(ActionEvent event) throws Exception {
        try {

            gameStart.execute(Integer.parseInt(totalMatchesCountInput.getText()), Integer.parseInt(maxMatchesRoundTakeInput.getText()));

        } catch (Exception e) {
            System.out.println("Zadejte celé nezáporné číslo.");
        }

        try {
            Pane mySecPane = FXMLLoader.load(getClass().getResource("/roundWindow.fxml")); //new window resource
            Stage stage = new Stage();
            stage.setTitle("Hra"); //set name of window
            stage.getIcons().add(new Image("iconfinder_match_2799190.png"));
            stage.setScene(new Scene(mySecPane));
            stage.initModality(Modality.APPLICATION_MODAL); //new window behaves as modal
            stage.show();

        } catch (IOException e) {
            System.out.println("Interní chyba - nelze spustit hru.");
        }

    }

}