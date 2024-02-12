package mars.rover;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y){
        if(x < 0 || y < 0) throw new IllegalArgumentException("Please Enter positive Integers");
        this.x = x;
        this.y = y;
    }

    public int x(){
        return x;
    }

    public int y(){
        return y;
    }

    public void moveNorth() {
        y++;
    }

    public void moveEast() {
        x++;
    }

    public void moveSouth() {
        y--;
    }

    public void moveWest() {
        x--;
    }

    @Override
    public String toString() {
        return  x + " " + y;
    }
}
