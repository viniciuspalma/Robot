import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import robot.mars.support.CommandsParser;

public class CommandsParserTest {

  @Test
  public void testParseCommands() {
    CommandsParser commandsParser = new CommandsParser("MMMLR");
    List<Character> actual = commandsParser.parsedCommands();
    List<Character> expected = Arrays.asList('M', 'M', 'M', 'L', 'R');

    assertEquals("returns a List with all commands", expected, actual);
  }
}
