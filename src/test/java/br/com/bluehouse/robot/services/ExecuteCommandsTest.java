package br.com.bluehouse.robot.services;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import br.com.bluehouse.robot.support.RobotErrorExecutingException;
import br.com.bluehouse.robot.models.MarsMap;
import br.com.bluehouse.robot.models.Robot;

public class ExecuteCommandsTest {

  @Test
  public void testIterateCommands() {
    MarsMap marsMap = new MarsMap(5, 5);
    Robot robot = new Robot(0, 0, 'N', marsMap);
    List<Character> commands = Arrays.asList('M', 'M', 'M');

    List<String> actual = new ExecuteCommands().iterateCommands(commands, robot);
    List<String> expected = Arrays.asList("(0, 1, N)", "(0, 2, N)", "(0, 3, N)");

    assertEquals("returns positions that the robot passed", expected, actual);
  }

  @Test(expected = RobotErrorExecutingException.class)
  public void testIterateCommandsWithInvalidCommands() {
    MarsMap marsMap = new MarsMap(5, 5);
    Robot robot = new Robot(0, 0, 'N', marsMap);
    List<Character> commands = Arrays.asList('F', 'O');

    new ExecuteCommands().iterateCommands(commands, robot);
  }
}
