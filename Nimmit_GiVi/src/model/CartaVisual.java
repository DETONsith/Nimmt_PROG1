package model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import controller.CardController;

public class CartaVisual extends Visual {
    private Scene scene;
    public CartaVisual(int number,int value){
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("carta.fxml"));
        try{
            scene = new Scene(fxmlloader.load());
        }catch (Exception e){
            System.out.println(e);
        }
        

        
    }
}
