import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class CardController {

    @FXML
    private Text number;

    @FXML
    private ImageView path;

    void initialize() {
        System.out.println("CardController initialized");
    }

}
