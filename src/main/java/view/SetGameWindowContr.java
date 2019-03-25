package view;

import controller.StartGameFlow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class SetGameWindowContr {

    private StartGameFlow gameStart = new StartGameFlow();

    @FXML private TextField totalMatchesCountInput;
    @FXML private TextField maxMatchesRoundTakeInput;

    @FXML
    void handleStartGame(ActionEvent event) throws Exception {

        gameStart.execute(Integer.parseInt(totalMatchesCountInput.getText()), Integer.parseInt(maxMatchesRoundTakeInput.getText()));

        Pane mySecPane = FXMLLoader.load(getClass().getResource("/roundWindow.fxml")); //new window resource
        Stage stage = new Stage();
        stage.setTitle("Hra"); //set name of window
        stage.getIcons().add(new Image("iconfinder_match_2799190.png"));
        stage.setScene(new Scene(mySecPane));
        stage.initModality(Modality.APPLICATION_MODAL); //new window behaves as modal
        stage.show();


    }

}