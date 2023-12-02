
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(getClass().getResource("./fxml/menuscreen.fxml"));
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("./fxml/menuscreen.fxml"));
        Parent root = fxmlloader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.resizableProperty().setValue(false);
        primaryStage.setTitle("nimmit givi");
        primaryStage.show();
        
    }
}

