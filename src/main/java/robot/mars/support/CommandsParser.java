package robot.mars.support;

import java.util.List;
import java.util.stream.Collectors;

public class CommandsParser {
  public static List<Character> commands;

  public CommandsParser(String commands) {
    this.commands =
      commands
        .chars()
        .mapToObj(x -> (char) x)
        .collect(Collectors.toList());
  }

  public List<Character> parsedCommands() {
    return this.commands;
  }
}
