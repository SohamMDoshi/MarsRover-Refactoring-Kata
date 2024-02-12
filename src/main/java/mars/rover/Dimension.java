package mars.rover;

public class Dimension {
    private final Coordinate coordinate;

    public Dimension(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public boolean validCoordinate(int x, int y) {
        return x >= 0 && x <= this.coordinate.x() && y >= 0 && y <= this.coordinate.y();
    }
}
