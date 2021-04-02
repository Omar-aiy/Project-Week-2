package domain;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import java.awt.*;
import java.util.ArrayList;

public class TekeningHangMan extends Tekening{
  public TekeningHangMan(String naam) {
        super(naam);

        Vorm galgBodem = new Rechthoek(new Punt(10, 350), 300, 40);
        Vorm galgStaaf = new LijnStuk(new Punt(160, 350), new Punt(160, 50));
        Vorm hangbar = new LijnStuk(new Punt(160, 50), new Punt(280, 50));
        Vorm koord = new LijnStuk(new Punt(280, 50), new Punt(280, 100));
        Vorm hoofd = new Cirkel(new Punt(280, 125), 25);
        Vorm oogLinks = new Cirkel(new Punt(270, 118), 2);
        Vorm oogRechts = new Cirkel(new Punt(290, 118), 2);
        Vorm boobie1 = new Cirkel(new Punt(270, 200), 10);

        Vorm boobie2 = new Cirkel(new Punt(290, 200), 10);
        Vorm nippie1= new Cirkel(new Punt(270, 200),2);
        Vorm nippie2= new Cirkel(new Punt(290, 200),2);
        Vorm neus = new Cirkel(new Punt(280, 128), 2);
        Vorm mond = new LijnStuk(new Punt(270, 138), new Punt(290, 138));
        Vorm lijf = new LijnStuk(new Punt(280, 150), new Punt(280, 250));
        Vorm beenLinks = new LijnStuk(new Punt(280, 250), new Punt(240, 310));
        Vorm beenRechts = new LijnStuk(new Punt(280, 250), new Punt(320, 310));
        Vorm voetLinks = new Cirkel(new Punt(240, 310), 5);
        Vorm voetRechts = new Cirkel(new Punt(320, 310), 5);
        Vorm armLinks = new LijnStuk(new Punt(280, 200), new Punt(230, 170));
        Vorm armRechts = new LijnStuk(new Punt(280, 200), new Punt(330, 170));
        Vorm handLinks = new Cirkel(new Punt(230, 170), 5);
        Vorm handRechts = new Cirkel(new Punt(330, 170), 5);

        super.voegToe(galgBodem);
      super.voegToe(galgStaaf);
      super.voegToe(hangbar);
        super.voegToe(koord);
        super.voegToe(hoofd);
        super.voegToe(oogLinks);
        super.voegToe(oogRechts);
        super.voegToe(neus);
        super.voegToe(mond);
        super.voegToe(lijf);
        super.voegToe(beenLinks);
        super.voegToe(beenRechts);
        super.voegToe(voetLinks);
        super.voegToe(voetRechts);
        super.voegToe(armLinks);
        super.voegToe(armRechts);
        super.voegToe(handLinks);
        super.voegToe(handRechts);
        super.voegToe(boobie1);
        super.voegToe(boobie2);
        super.voegToe(nippie1);
        super.voegToe(nippie2);

        this.zetVolgendeZichtbaar();
      this.zetVolgendeZichtbaar();
      this.zetVolgendeZichtbaar();
      this.zetVolgendeZichtbaar();
    }

    public int getAantalOnzichtbaar() {
        int totaal = 0;
        for (int i = 0; i < this.getAantalVormen() ; i++) {
            if (!this.getVorm(i).isZichtbaar()) totaal++;
        }
        return totaal;
    }

    public void voegToe(Vorm vorm) {

    }

    public void verwijder(Vorm vorm) {
    }

    public void zetVolgendeZichtbaar() {
        this.getVorm(this.getAantalVormen() - this.getAantalOnzichtbaar()).setZichtbaar(true);
    }



}
