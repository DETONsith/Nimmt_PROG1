
// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// public class App extends Application{
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, Nimmit!");
//         launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) throws Exception {
//         System.out.println(getClass().getResource("./fxml/Carta.fxml"));
//         FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("./fxml/Carta.fxml"));
//         Parent root = fxmlloader.load();
//         Scene scene = new Scene(root);
//         primaryStage.setScene(scene);
//         primaryStage.setTitle("nimmit givi");
//         primaryStage.show();
        
//     }
// }

import model.Baralho;
import model.Player;
import model.PlayerPlace;

public class App{
    public static void main(String[] args) throws Exception {
        Player jogador = new Player("jogador",false);
        Baralho baralho = new Baralho();
        System.out.println(baralho.getBaralho());
        PlayerPlace playerplace = new PlayerPlace(jogador);
        playerplace.giverCards(baralho.pickCards(109));
        playerplace.getHand().printCards();
        System.out.println(baralho.getBaralho());
        
        
    }
}