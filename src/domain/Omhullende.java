package domain;
public class Omhullende {
    private Punt LinkerBovenhoek;
    private int Breedte;
    private int Hoogte;

    public Omhullende(Punt hoek, int b, int h){
        if (b >= 0) {
            this.Breedte = b;
        } else {
            throw new DomainException("Cannot be less then zero");
        }
        if (h >= 0) {
            this.Hoogte = h;
        } else {
            throw new DomainException("Cannot be less then zero");
        }
        if (hoek != null) {
            this.LinkerBovenhoek = hoek;
        } else {
            throw new DomainException("Cannot be less then zero");
        }
    }

    public Punt getLinkerBovenhoek() {
        return LinkerBovenhoek;
    }

    public int getBreedte() {
        return Breedte;
    }

    public int getHoogte() {
        return Hoogte;
    }
    public int getMinimumX(){
        return LinkerBovenhoek.getX();
    }
    public int getMaximumX(){
        return LinkerBovenhoek.getX() + Breedte;
    }
    public int getMinimumY(){
        return LinkerBovenhoek.getY();
    }
    public int getMaximumY(){
        return LinkerBovenhoek.getY() + Hoogte;
    }
    public String toString(){
        return "Omhullende: " + getLinkerBovenhoek().toString() + " - " + getBreedte() + " - " + getHoogte();
    }

    public boolean equals(Omhullende a){
        if (a == null){
            return false;
        } else {
            if (a.getHoogte() == Hoogte && a.getBreedte() == Breedte && a.getLinkerBovenhoek().equals(LinkerBovenhoek)){
                return true;
            } else {
                return false;
            }
        }
    }
}
