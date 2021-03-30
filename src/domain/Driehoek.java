package domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driehoek extends Vorm {
    private Punt hoekPunt1, hoekPunt2, hoekPunt3;
    private List<Integer> puntList;


    public Driehoek(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3) {
        this.hoekPunt1 = this.validatePunt(hoekPunt1);
        this.hoekPunt2 = this.validatePunt(hoekPunt2);
        this.hoekPunt3 = this.validatePunt(hoekPunt3);

        this.puntList = new ArrayList<>();
        puntList.add(getHoekPunt1().getX());
        puntList.add(getHoekPunt2().getX());
        puntList.add(getHoekPunt3().getX());
    }

    private Punt validatePunt(Punt punt) {
        if (punt == null) throw new DomainException();
        return punt;
    }

    public void sorteerHoekpunten() {
        Collections.sort(this.puntList);
    }

    public boolean liggenOp1Lijn(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3) {
        return ((hoekPunt2.getX() - hoekPunt1.getX()) * (hoekPunt3.getY() - hoekPunt1.getY())) ==
                ((hoekPunt3.getX() - hoekPunt1.getX()) * (hoekPunt2.getY() - hoekPunt1.getY()));
    }

    public Punt getHoekPunt1() {
        return hoekPunt1;
    }

    public Punt getHoekPunt2() {
        return hoekPunt2;
    }

    public Punt getHoekPunt3() {
        return hoekPunt3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driehoek driehoek = (Driehoek) o;
        return this.getHoekPunt1().equals(driehoek.getHoekPunt1()) &&
                this.getHoekPunt2().equals(driehoek.getHoekPunt2()) &&
                this.getHoekPunt3().equals(driehoek.getHoekPunt3());
    }

    @Override
    public String toString() {
        return "Driehoek: hoekpunt1: " + this.getHoekPunt1() + " - hoekpunt2: " + this.getHoekPunt2() + " - hoekpunt3: " + this.getHoekPunt3();
    }
}
