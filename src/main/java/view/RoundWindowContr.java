/**
 * Sample Skeleton for 'roundWindow.fxml' Controller Class
 */

package view;

import controller.TakeMatchesFlow;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Popup;
import model.GameItem;

import java.net.URL;
import java.util.ResourceBundle;

public class RoundWindowContr implements Initializable {

    @FXML // fx:id="takeAmountCombo"
    private ComboBox<String> takeAmountCombo; // Value injected by FXMLLoader

    @FXML // fx:id="labelActualCountAtPile"
    private Label labelActualCountAtPile; // Value injected by FXMLLoader

    @FXML // fx:id="takeMatchesBtn"
    private Button takeMatchesBtn; // Value injected by FXMLLoader

    @FXML
    void takeMatches(ActionEvent event) {

    }

    @FXML
    void chooseAmountMatches(ActionEvent event) {

    }

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> matchesTakeOptions = FXCollections.observableArrayList();
        //generate all possible takes up to maximum take
        for (int i = 1; i <= GameItem.getInstance().getGame().getMaximumTake(); i++) {
            int number = 0;
            number += i;
            matchesTakeOptions.add(String.valueOf(number));
        }
        //fill dropdown with all possible takes by player and choose first one
        takeAmountCombo.setItems(matchesTakeOptions);
        takeAmountCombo.getSelectionModel().selectFirst();

        //show actual number of matches at pile
        int matchesCountLabel = GameItem.getInstance().getPile().getActualMatchesCount();
        labelActualCountAtPile.setText(String.valueOf(matchesCountLabel));

        //user clieked button
        takeMatchesBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //getting selected number of matches to take by user
                int selectedAmountToTake;
                selectedAmountToTake = Integer.parseInt(takeAmountCombo.getValue());

                //start flow to deductt selected number
                TakeMatchesFlow takeMatches = new TakeMatchesFlow();
                takeMatches.execute(selectedAmountToTake);

                //update label for user
                int newMatchesCountLabel = GameItem.getInstance().getPile().getActualMatchesCount();
                labelActualCountAtPile.setText(String.valueOf(newMatchesCountLabel));
            }
        });
    }
    public void showAlertComputerWon() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hra skončila.");
        alert.setHeaderText(null);
        alert.setContentText("Bohužel počítač tě přelstil a táhl poslední sirky na hromádce. Zkus to znovu.");
        alert.showAndWait();
    }

    public void showAlertUserWon() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Hra skončila.");
        alert.setHeaderText(null);
        alert.setContentText("VÍTĚZSTVÍ! Právě jsi táhl poslední sirky na hromádce. A stáváš se vítězem.");
        alert.showAndWait();

        ButtonType buttonPlayAgain = new ButtonType("Další hru");
        ButtonType buttonClose = new ButtonType("Zavřít", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonClose, buttonPlayAgain);


    }

}
