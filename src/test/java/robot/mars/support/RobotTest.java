import org.junit.Test;
import static org.junit.Assert.*;

import robot.mars.support.Robot;

public class RobotTest {

  @Test
  public void testMoveWithNorthDirection() {
    Robot robot = new Robot(0, 0, 'N');
    robot.move();

    assertEquals("Y axis must be one", "(0, 1, N)", robot.toString());
  }

  @Test
  public void testMoveWithEastDirection() {
    Robot robot = new Robot(0, 0, 'E');
    robot.move();

    assertEquals("X axis must be one", "(1, 0, E)", robot.toString());
  }

  @Test
  public void testMoveWithSouthDirection() {
    Robot robot = new Robot(1, 1, 'S');
    robot.move();

    assertEquals("Y axis must be zero", "(1, 0, S)", robot.toString());
  }

  @Test
  public void testMoveWithWestDirection() {
    Robot robot = new Robot(1, 1, 'W');
    robot.move();

    assertEquals("X axis must be zero", "(0, 1, W)", robot.toString());
  }
}
