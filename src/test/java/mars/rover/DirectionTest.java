package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @Test
    public void testTurnRightWhileFacingNorth() {
        Direction direction = Direction.N;
        Direction updatedDirection = direction.turnRight();
        assertEquals(Direction.E,updatedDirection);
    }

    @Test
    public void testTurnRightWhileFacingSouth() {
        Direction direction = Direction.S;
        Direction updatedDirection = direction.turnRight();
        assertEquals(Direction.W,updatedDirection);
    }

    @Test
    public void testTurnLeftWhileFacingEast() {
        Direction direction = Direction.E;
        Direction updatedDirection = direction.turnLeft();
        assertEquals(Direction.N,updatedDirection);
    }

    @Test
    public void testTurnLeftWhileFacingWest() {
        Direction direction = Direction.W;
        Direction updatedDirection = direction.turnLeft();
        assertEquals(Direction.S,updatedDirection);
    }
}
