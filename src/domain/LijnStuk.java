package domain;

public class LijnStuk extends Vorm {
    private Punt startPunt;
    private Punt eindPunt;

    public LijnStuk(Punt startPunt, Punt eindPunt) {
        this.setStartEnEindPunt(startPunt, eindPunt);
    }

    public void setStartEnEindPunt(Punt startPunt, Punt eindPunt) {
        if (startPunt == eindPunt || startPunt == null || eindPunt == null)
            throw new DomainException();

        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
    }

    public Punt getStartPunt() {
        return startPunt;
    }

    public Punt getEindPunt() {
        return eindPunt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LijnStuk lijnStuk = (LijnStuk) o;
        return this.startPunt.equals(lijnStuk.getStartPunt()) && this.eindPunt.equals(lijnStuk.getEindPunt());
    }

    @Override
    public String toString() {
        return "Lijn: startpunt: " + this.startPunt + " - eindpunt: " + this.eindPunt;
    }
}
