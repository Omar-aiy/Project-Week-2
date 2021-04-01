 package domain;


import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Character.toLowerCase;

public class HintWoord {
    private HintLetter[] hintwoord;

    public HintWoord(String s){
        if (s==null||s.isEmpty()||s.trim().isEmpty())throw new DomainException("Woord mag niet leeg zijn");
        this.hintwoord= new HintLetter[s.length()];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            hintwoord[i]= new HintLetter(chars[i]);
        }

    }

    public boolean raad(char c){
        boolean found=false;
        for (HintLetter h:this.hintwoord){
            if (h.raad(c)){
                found=true;
            }
        }
        return found;
    }

    public boolean isGeraden(){
        for (HintLetter h: hintwoord){
            if (!h.isGeraden())return false;
        }
        return true;
    }
    public String getWoord(){
        String output="";
        for (HintLetter h: hintwoord){
            output+=h.getLetter();
        }
        return output;
    }

    @Override
    public String toString() {
        return "HintWoord{" +
                "hintwoord=" + Arrays.toString(hintwoord) +
                '}';
    }
}


