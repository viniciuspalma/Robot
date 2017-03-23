package robot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarsController {

  @RequestMapping("/greeting")
  public String greeting() {
    return "hello";
  }
}
