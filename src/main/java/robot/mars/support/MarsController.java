package robot.mars.support;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MarsController {

  @RequestMapping("rest/mars/{commands}")
  public String greeting(@PathVariable(value="commands") String commands) {
    return commands;
  }
}
