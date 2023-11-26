package model;

public class Carta{
    private int number;
    private int value;
    private CartaVisual visual;
    public Carta(int number){
        this.number = number;
        this.value = calculateCartaValue(number);
        switch (this.value) {
            case this.value == 1:
                this. = "Carta1.fbx"; 
                break;
        
            default:
                break;
        }
    }
    private int calculateCartaValue(int number){
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




    
}
