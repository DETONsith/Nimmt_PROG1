package controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class WinnerScreenController {

    @FXML
    private Text lbl_winer;

    public void setLabel(String text){
        this.lbl_winer.setText(text);
    }

}
