package domain;

import java.util.Objects;
import domain.DomainException;

public class Speler {
    private String naam;
    private int score;

    public Speler(String naam){
        if (naam == null || naam.trim().isEmpty()){
            throw new DomainException();
        }
        this.naam=naam;
        this.score=0;
    }

    public String getNaam() {
        return naam;
    }

    public int getScore() {
        return score;
    }
    public void addToScore(int toevoeging){
        if (score + toevoeging < 0){throw new IllegalArgumentException("mag niet");}

            score += toevoeging;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speler)) return false;
        Speler speler = (Speler) o;
        return score == speler.score &&
                Objects.equals(naam, speler.naam);
    }

    @Override
    public String toString() {
        return naam + " heeft als score " + score;
    }
}
