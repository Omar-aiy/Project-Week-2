package domain;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class HangMan {
    private Speler speler;
    private TekeningHangMan tekeningHangMan;
    private WoordenLijst woordenLijst;
    private HintWoord hintWoord;



    public HangMan(Speler speler, WoordenLijst woordenLijst) {
        if (speler==null) throw new DomainException("Speler mag niet null zijn");
        if (woordenLijst==null) throw new DomainException("Woordenlijst mag niet null zijn");
        if (woordenLijst.getAantalWoorden()==0) throw new DomainException("Woordenlijst mag niet leeg zijn");
        this.speler = speler;
        this.tekeningHangMan = new TekeningHangMan("hangwoman");
        this.woordenLijst = woordenLijst;
        this.hintWoord = new HintWoord(woordenLijst.getRandomWoord());

    }

    public Speler getSpeler() {
        return speler;
    }

    public boolean isGameOver(){
        return tekeningHangMan.getAantalOnzichtbaar() == 0;
    }

    public TekeningHangMan getTekening() {
        return tekeningHangMan;
    }

    public String getHint() {
        return hintWoord.toString();
    }

    public boolean isGewonnen() {
        return hintWoord.isGeraden();
    }



    public boolean raad(char letter) {
        boolean geraden = hintWoord.raad(letter);
        if (!geraden) tekeningHangMan.zetVolgendeZichtbaar();
        return geraden;

    }

}