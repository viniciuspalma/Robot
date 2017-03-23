package robot.mars.support;

import java.util.List;
import java.util.Arrays;

public class TurnRobot {
  private static final List<Character> directions = Arrays.asList('N', 'E', 'S', 'W');

  public char turnLeft(char currentDirection) {
    if (this.getDirectionIndex(currentDirection) == 0) {
      return this.directions.get(3);
    }

    return this.directions.get(this.getDirectionIndex(currentDirection) - 1);
  }

  public char turnRight(char currentDirection) {
    if (this.getDirectionIndex(currentDirection) == 3) {
      return this.directions.get(0);
    }

    return this.directions.get(this.getDirectionIndex(currentDirection) + 1);
  }

  private int getDirectionIndex(char direction) {
    return this.directions.indexOf(direction);
  }
}
