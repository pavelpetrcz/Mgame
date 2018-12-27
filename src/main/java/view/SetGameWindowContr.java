package view;

import controller.StartGameFlow;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SetGameWindowContr {
    public StartGameFlow game = new StartGameFlow();

    @FXML protected TextField totalMatchesCountInput;
    @FXML protected TextField maxMatchesRoundTakeInput;

    @FXML
    protected void startGame(ActionEvent event) {
        game.execute(Long.parseLong(String.valueOf(totalMatchesCountInput)), Long.parseLong(String.valueOf(maxMatchesRoundTakeInput)));

    }
}
