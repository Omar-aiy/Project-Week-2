package domain;
public class Punt implements Comparable<Punt>{
    private int x;
    private int y;

    public Punt(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Punt a){
        if (a == null){
            return false;
        } else {
            return a.getX() == this.x && a.getY() == this.y;
        }
    }
    public String toString(){
        String result = "";
        result += "(" + this.getX() + ", " + this.getY() + ")";
        return result;
    }

    @Override
    public int compareTo(Punt anderPunt) {
        if (anderPunt == null) return 1;
        if (this.x < anderPunt.x) return -1;
        else if (this.x > anderPunt.x) return 1;
        else if (this.y < anderPunt.y) return -1;
        else if (this.y > anderPunt.y) return  1;
        else return 0;
    }
}