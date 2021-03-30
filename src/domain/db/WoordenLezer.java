package domain.db;

import domain.WoordenLijst;
import java.util.Scanner;

public class WoordenLezer {
    WoordenLijst lijst;

    public WoordenLezer(String bestandsnaam){
        lijst = new WoordenLijst();
        Scanner scan = new Scanner(bestandsnaam);
        while (scan.hasNextLine()){
            lijst.voegToe(scan.nextLine());
        }
    }
}
