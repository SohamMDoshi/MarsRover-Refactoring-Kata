package mars.rover;

public enum Direction {
    N,E,S,W;

    public Direction turnLeft() {
        int newOrdinal = (ordinal() -1 + values().length ) % values().length;
        return values()[newOrdinal];
    }
    public Direction turnRight() {
        int newOrdinal = (ordinal() +1) % values().length;
        return values()[newOrdinal];
    }

    public void move(Coordinate coordinate) {
        switch (this) {
            case N:
                coordinate.moveNorth();
                break;
            case E:
                coordinate.moveEast();
                break;
            case S:
                coordinate.moveSouth();
                break;
            case W:
                coordinate.moveWest();
                break;
        }
    }
}
