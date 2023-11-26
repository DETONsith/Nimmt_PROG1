
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Nimmit!");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(getClass().getResource("main.fxml"));
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = fxmlloader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("nimmit givi");
        primaryStage.show();
        
    }
}
