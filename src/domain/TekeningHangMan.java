package domain;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import java.awt.*;
import java.util.ArrayList;

public class TekeningHangMan extends Tekening{
    private ArrayList<Vorm> vormen;


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

        vormen = new ArrayList<>();
        vormen.add(galgBodem);
        vormen.add(galgStaaf);
        vormen.add(hangbar);
        vormen.add(koord);
        vormen.add(hoofd);
        vormen.add(oogLinks);
        vormen.add(oogRechts);
        vormen.add(neus);
        vormen.add(mond);
        vormen.add(lijf);
        vormen.add(beenLinks);
        vormen.add(beenRechts);
        vormen.add(voetLinks);
        vormen.add(voetRechts);
        vormen.add(armLinks);
        vormen.add(armRechts);
        vormen.add(handLinks);
        vormen.add(handRechts);
        vormen.add(boobie1);
        vormen.add(boobie2);
        vormen.add(nippie1);
        vormen.add(nippie2);

        zetAllesNietZichtbaar();
    }

    public int getAantalOnzichtbaar() {
        int totaal = 0;
        for (Vorm v: vormen) {
            if (!v.isZichtbaar()) totaal++;
        }
        return totaal;
    }

    public void voegToe(Vorm vorm) {
        if (vorm == null) throw new DomainException("Vorm mag niet leeg zijn.");
        if (vormen.contains(vorm)) throw new DomainException("Vorm bestaat al.");
        vormen.add(vorm);
    }

    public void verwijder(Vorm vorm) {
        if (vorm == null) throw new DomainException("Vorm mag niet leeg zijn.");
        for (Vorm v: vormen) {
            if (v.equals(vorm)) vormen.remove(vorm);
        }
    }

    public void zetVolgendeZichtbaar() {
        boolean gedaan = false;
        for (Vorm v: vormen) {
            if (!gedaan) {
                if (!v.isZichtbaar()) {
                    v.setZichtbaar(true);
                    gedaan = true;
                }
            }
        }
    }

    public void zetAllesNietZichtbaar() {
        for (int i = 4; i < vormen.size(); i++) {
            vormen.get(i).setZichtbaar(false);
        }
    }

    @Override
    public void teken(Pane root) {
        int count = 0;

        for (Vorm v: vormen) {
            if (v.isZichtbaar()) {
                count++;
            }
        }

        for (Vorm v: vormen) {
            if (v.isZichtbaar()) {
                v.teken(root);
            }

        }

        if (count == 22) throw new DomainException();


    }

}
