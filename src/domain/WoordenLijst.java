package domain;

import java.util.ArrayList;

public class WoordenLijst {
    ArrayList<String> geldigeWoorden;

    public WoordenLijst() {
        this.geldigeWoorden = new ArrayList<>();
    }

    public int getAantalWoorden(){
        return geldigeWoorden.size();
    }

    public void voegToe(String newWoord){
        if (newWoord == null || newWoord.trim().isEmpty()){
            throw new DomainException("newWoord cannot not be empty");
        } else if (geldigeWoorden.contains(newWoord)){
            throw new DomainException("NewWoord already exists");
        }
        geldigeWoorden.add(newWoord);
    }
    public String getRandomWoord(){
        return geldigeWoorden.get((int)(Math.random()* geldigeWoorden.size()));
    }

    public ArrayList<String> getGeldigeWoorden() {
        return geldigeWoorden;
    }




}
