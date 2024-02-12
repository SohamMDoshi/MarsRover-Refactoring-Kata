package mars.rover;

public class MarsRover {
    private Direction direction;
    
    private final Coordinate coordinate;

    public MarsRover(int xCoordinate, int yCoordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = new Coordinate(xCoordinate,yCoordinate);
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void moveForward() {
        direction.move(coordinate);
    }

    public String currentPosition() {
        return coordinate+" "+direction;
    }

}
