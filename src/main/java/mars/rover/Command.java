package mars.rover;

public class Command {
    private final MarsRover marsRover;

    public Command(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void excute(String instructions) {
        if(!instructions.matches("[LRM]+")) throw new IllegalArgumentException("Instruction should only contain L R M these 3 characters");
        for (char command : instructions.toCharArray()) {
            if (command == 'L') marsRover.turnLeft();
            else if (command == 'R') marsRover.turnRight();
            else marsRover.moveForward();
        }
    }
}
