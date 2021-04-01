package domain.db;
import domain.WoordenLijst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WoordenLezer {
    private Scanner scanner;

    public WoordenLezer(String documentNaam) throws FileNotFoundException {
        String pad = "src/"+documentNaam;
        File file = new File(pad);
        Scanner scanner = new Scanner(file);
        this.scanner = scanner;
    }

    public WoordenLijst lees() throws FileNotFoundException {
        WoordenLijst woordenLijst = new WoordenLijst();
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
            woordenLijst.voegToe(line);
        }
        return woordenLijst;
    }


}
