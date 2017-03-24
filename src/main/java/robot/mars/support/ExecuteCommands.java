package robot.mars.support;

import java.util.List;
import java.util.stream.Collectors;

import robot.mars.support.RobotErrorExecutingException;

public class ExecuteCommands {

  public List<String> iterateCommands(List<Character> commands, Robot robot) {
    List<String> resultcommands =
      commands
        .stream()
        .map(command -> this.execute(command, robot))
        .collect(Collectors.toList());

    return resultcommands;
  }

  private String execute(Character command, Robot robot) {
    switch(command) {
      case 'M': robot.move();
                return robot.toString();

      case 'L': robot.left();
                return robot.toString();

      case 'R': robot.right();
                return robot.toString();

      default: throw new RobotErrorExecutingException(String.valueOf(command));
    }
  }
}
