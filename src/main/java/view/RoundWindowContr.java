package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

public class RoundWindowContr {

    @FXML
    private ComboBox<?> takeAmountCombo;

    @FXML
    private Button takeMatchesBtn;

    @FXML
    private Text actualPileCountText;

    @FXML
    void chooseAmountMatches(ActionEvent event) {

    }

    @FXML
    void takeMatches(ActionEvent event) {

    }

    public ComboBox<?> getTakeAmountCombo() {
        return takeAmountCombo;
    }

    public void setTakeAmountCombo(ComboBox<?> takeAmountCombo) {
        this.takeAmountCombo = takeAmountCombo;
    }

    public Button getTakeMatchesBtn() {
        return takeMatchesBtn;
    }

    public void setTakeMatchesBtn(Button takeMatchesBtn) {
        this.takeMatchesBtn = takeMatchesBtn;
    }

    public Text getactualPileCountText() {
        return actualPileCountText;
    }

    public void setactualPileCountText(Text pileActualCountField) {
        this.actualPileCountText = pileActualCountField;
    }
}
