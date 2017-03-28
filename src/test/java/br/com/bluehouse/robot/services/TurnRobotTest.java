package br.com.bluehouse.robot.services;

import org.junit.Test;
import static org.junit.Assert.*;

public class TurnRobotTest {

  @Test
  public void testTurnLeft() {
    TurnRobot turnRobot = new TurnRobot();

    assertEquals('W', turnRobot.turnLeft('N'));
    assertEquals('S', turnRobot.turnLeft('W'));
    assertEquals('E', turnRobot.turnLeft('S'));
    assertEquals('N', turnRobot.turnLeft('E'));
  }

  @Test
  public void testTurnRight() {
    TurnRobot turnRobot = new TurnRobot();

    assertEquals('E', turnRobot.turnRight('N'));
    assertEquals('S', turnRobot.turnRight('E'));
    assertEquals('W', turnRobot.turnRight('S'));
    assertEquals('N', turnRobot.turnRight('W'));
  }
}
