package robot.mars.support;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import robot.mars.support.Robot;
import robot.mars.support.CommandsParser;
import robot.mars.support.ExecuteCommands;
import robot.mars.support.Robot;
import robot.mars.support.MarsMap;

@RestController
@RequestMapping("/rest/mars")
public class MarsController {

  @RequestMapping(value = "/{commands}", method = POST)
  public String walk(@PathVariable(value="commands") String commands) {
    MarsMap marsMap = new MarsMap(5, 5);
    Robot robot = new Robot(0, 0, 'N', marsMap);

    List<Character> parsedCommands = new CommandsParser(commands).parsedCommands();
    new ExecuteCommands().iterateCommands(parsedCommands, robot);

    return robot.toString();
  }
}
