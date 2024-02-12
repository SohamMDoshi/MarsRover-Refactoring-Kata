package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MarsRoverTest {

    @Test
    public void testCreatingRoverWithInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> new MarsRover(-1,7,Direction.S));
    }

    @Test
    public void testLeftTurnOfRoverFromCurrentPosition() {
        MarsRover marsRover = new MarsRover(2,3,Direction.E);
        Command command = new Command(marsRover);
        command.excute("L");
        String result = marsRover.currentPosition();
        assertEquals("2 3 N", result);
    }

    @Test
    public void testRightTurnOfRoverFromCurrentPosition() {
        MarsRover marsRover = new MarsRover(1,1,Direction.S);
        Command command = new Command(marsRover);
        command.excute("R");
        String result = marsRover.currentPosition();
        assertEquals("1 1 W", result);
    }

    @Test
    public void testMoveForwardOfRoverFromCurrentPositionWhileFacingNorth() {
        MarsRover marsRover = new MarsRover(3,3,Direction.N);
        Command command = new Command(marsRover);
        command.excute("M");
        String result = marsRover.currentPosition();
        assertEquals("3 4 N", result);
    }

    @Test
    public void testMoveForwardOfRoverFromCurrentPositionWhileFacingEast() {
        MarsRover marsRover = new MarsRover(2,1,Direction.E);
        Command command = new Command(marsRover);
        command.excute("M");
        String result = marsRover.currentPosition();
        assertEquals("3 1 E", result);
    }

    @Test
    public void testMoveForwardOfRoverFromCurrentPositionWhileFacingWest() {
        MarsRover marsRover = new MarsRover(1,1,Direction.W);
        Command command = new Command(marsRover);
        command.excute("M");
        String result = marsRover.currentPosition();
        assertEquals("0 1 W", result);
    }

    @Test
    public void testMoveForwardOfRoverFromCurrentPositionWhileFacingSouth() {
        MarsRover marsRover = new MarsRover(3,1,Direction.S);
        Command command = new Command(marsRover);
        command.excute("M");
        String result = marsRover.currentPosition();
        assertEquals("3 0 S", result);
    }

    @Test
    public void testMultipleDirectionMove() {
        MarsRover marsRover = new MarsRover(1,2,Direction.N);
        Command command = new Command(marsRover);
        command.excute("LMLMLMLMM");
        String result = marsRover.currentPosition();
        assertEquals("1 3 N", result);
    }

    @Test
    public void testTwoWithMultipleDirectionMove() {
        MarsRover marsRover = new MarsRover(3,3,Direction.E);
        Command command = new Command(marsRover);
        command.excute("MMRMMRMRRM");
        String result = marsRover.currentPosition();
        assertEquals("5 1 E", result);
    }
}
