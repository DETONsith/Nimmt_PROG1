package model;
import java.io.File;
import java.io.InputStream;
import java.net.URI;

import org.w3c.dom.css.RGBColor;

import javafx.scene.image.Image;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class Carta{
    private int number;
    private int value;
    private CartaVisual visual;
    public Carta(int number){
        this.number = number;
        this.value = calculateCartaValue(number);
        this.visual = new CartaVisual(number, value);
    }
    public int calculateCartaValue(int number){
        int value = 1;
        if (isLastDigit5(number)){
            value += 1;
        }
        if (isMultipleOf10(number)){
            value += 2;
        }
        if (hasRepeatedDigit(number)){
            value += 4;
        }
        return value;
    }

    public Image nullimage(){
        URI uri = null;
        uri = new File("Nimmit_GiVi/assets/Nimmit_Givi_Game_Carts/empty.png").toURI();
        try{
            InputStream stream = uri.toURL().openStream();
            Image image = new Image(stream);
            return image;
            }
            catch(Exception e){
                System.out.println("Erro ao carregar imagem");
                System.out.println(e);
                return null;
        }
    }

    public Paint getColor(){
        switch (this.getValue()) {
            case 1:{
                return Paint.valueOf("#d1bc99");
            }
            case 2:{
                return Paint.valueOf("#835b18");
            }
            case 3:{
                return Paint.valueOf("#e4bd7e");
            }
            case 4:{
                return Paint.valueOf("#855d1b");
            }
            case 5:{
                return Paint.valueOf("#f3f1ef");
            }
            case 6:{
                return Paint.valueOf("#19191b");
            }
            case 7:{
                return Paint.valueOf("#000000");
            }
            default:
                break;
        }
        return null;

    }

    public Image getImage(){
        
        URI uri = null;
        switch (this.getValue()) {
            
            case 1:{
                uri = new File("Nimmit_GiVi/assets/Nimmit_Givi_Game_Carts/carta1.png").toURI();
                break;
            }
            case 2:{
                uri = new File("Nimmit_GiVi/assets/Nimmit_Givi_Game_Carts/carta2.png").toURI();
                break;
            }
            case 3:{
                uri = new File("Nimmit_GiVi/assets/Nimmit_Givi_Game_Carts/carta3.png").toURI();
                break;
            }
            case 4:{
                uri = new File("Nimmit_GiVi/assets/Nimmit_Givi_Game_Carts/carta4.png").toURI();
                break;
            }
            case 5:{
                uri = new File("Nimmit_GiVi/assets/Nimmit_Givi_Game_Carts/carta5.png").toURI();
                break;
            }
            case 6:{
                uri = new File("Nimmit_GiVi/assets/Nimmit_Givi_Game_Carts/carta6.png").toURI();
                break;
            }
            case 7:{
                uri = new File("Nimmit_GiVi/assets/Nimmit_Givi_Game_Carts/carta7.png").toURI();
                break;
            }

            default:
                break;
        }
        if (uri == null){
            uri = new File("Nimmit_GiVi/assets/Nimmit_Givi_Game_Carts/empty.png").toURI();
        }
         try{
            InputStream stream = uri.toURL().openStream();
            Image image = new Image(stream);
            return image;
            }
            catch(Exception e){
                System.out.println("Erro ao carregar imagem");
                System.out.println(e);
            }

        return null;
    }

    private boolean isLastDigit5(int number){
        String numberstr = String.valueOf(number);
        if (numberstr.charAt(numberstr.length()-1) == '5'){
            return true;
        }
        return false;
    }

    private boolean isMultipleOf10(int number){
        if (number % 10 == 0){
            return true;
        }
        return false;
    }

    private boolean hasRepeatedDigit(int number){
        String numberstr = String.valueOf(number);
        for (int i = 0; i < numberstr.length(); i++){
            for (int j = i+1; j < numberstr.length(); j++){
                if (numberstr.charAt(i) == numberstr.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public int getNumber() {
        return number;
    }

    public int getValue() {
        return value;
    }

    public CartaVisual getVisual() {
        return visual;
    }





    
}
