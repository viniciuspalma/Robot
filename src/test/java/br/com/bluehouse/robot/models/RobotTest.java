package br.com.bluehouse.robot.models;

import org.junit.Test;
import static org.junit.Assert.*;

import br.com.bluehouse.robot.support.RobotOutMapException;

public class RobotTest {

  @Test
  public void testMoveWithNorthDirection() {
    MarsMap marsMap = new MarsMap(5, 5);
    Robot robot = new Robot(0, 0, 'N', marsMap);
    robot.move();

    assertEquals("Y axis must be one", "(0, 1, N)", robot.toString());
  }

  @Test
  public void testMoveWithEastDirection() {
    MarsMap marsMap = new MarsMap(5, 5);
    Robot robot = new Robot(0, 0, 'E', marsMap);
    robot.move();

    assertEquals("X axis must be one", "(1, 0, E)", robot.toString());
  }

  @Test
  public void testMoveWithSouthDirection() {
    MarsMap marsMap = new MarsMap(5, 5);
    Robot robot = new Robot(1, 1, 'S', marsMap);
    robot.move();

    assertEquals("Y axis must be zero", "(1, 0, S)", robot.toString());
  }

  @Test
  public void testMoveWithWestDirection() {
    MarsMap marsMap = new MarsMap(5, 5);
    Robot robot = new Robot(1, 1, 'W', marsMap);
    robot.move();

    assertEquals("X axis must be zero", "(0, 1, W)", robot.toString());
  }

  @Test
  public void testLeft() {
    MarsMap marsMap = new MarsMap(5, 5);
    Robot robot = new Robot(0, 0, 'N', marsMap);
    robot.left();

    assertEquals("direction must be West", "(0, 0, W)", robot.toString());
  }

  @Test
  public void testRight() {
    MarsMap marsMap = new MarsMap(5, 5);
    Robot robot = new Robot(0, 0, 'N', marsMap);
    robot.right();

    assertEquals("direction must be East", "(0, 0, E)", robot.toString());
  }

  @Test(expected = RobotOutMapException.class)
  public void testMoveExitingMap() {
    MarsMap marsMap = new MarsMap(1, 1);
    Robot robot = new Robot(0, 0, 'N', marsMap);
    robot.move();
    robot.move();
  }
}
