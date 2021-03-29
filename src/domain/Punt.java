package domain;
public class Punt {
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
}