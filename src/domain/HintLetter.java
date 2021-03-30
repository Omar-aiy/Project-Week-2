package domain;

import static java.lang.Character.toLowerCase;

public class HintLetter {
    private char letter;
    private boolean isGeraden;

    public HintLetter(char letter){
        this.letter=letter;

    }

    public char getLetter() {
        return letter;
    }
    public boolean raad(char poging){
        return toLowerCase(poging) == letter;
    }

    public char toChar(){
       if (raad(letter)==true){
           return letter;
       }
        return '_';
    }
    public boolean isGeraden(){
        if(raad(letter)== true){
            return true;
        }
        return false;
    }
}
